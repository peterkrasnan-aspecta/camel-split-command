package com.example;

import jakarta.enterprise.context.ApplicationScoped;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * Example Camel Quarkus route that demonstrates reading a JSON file and using the Split pattern.
 * This route reads a JSON file containing an array of objects and splits it to process each object individually.
 * 
 * Follows the Camel Quarkus command mode pattern as described in:
 * https://camel.apache.org/camel-quarkus/3.20.x/user-guide/command-mode.html
 */
@ApplicationScoped
public class JsonSplitRoute extends RouteBuilder {

    @ConfigProperty(name = "input.file", defaultValue = "input/sample-data.json")
    String inputFile;



    @Override
    public void configure() throws Exception {
        
   
        
        from("file://src/main/resources/input?noop=true")
            .log("Reading JSON file: ${header.CamelFileName}")
            .log("File content: ${body}")
            
            // Unmarshal JSON to Java objects
            .unmarshal().json(JsonLibrary.Jackson, Person[].class)
            .log("Unmarshaled JSON to ${body.getClass().getSimpleName()}")
            
            // Split the array into individual objects
            .split(body())
                .delay(5000)
                .log("Processing item: ${body}")
                .log("Item details - Name: ${body.name}, Age: ${body.age}, City: ${body.city}")
                
                // You can add more processing here for each item
                .choice()
                    .when(simple("${body.age} >= 18"))
                        .log("Adult person: ${body.name}")
                    .otherwise()
                        .log("Minor person: ${body.name}")
                .end()
                
                // Optional: Transform or enrich the data
                .setBody(simple("Processed: ${body.name} from ${body.city}"))
                .log("Final result: ${body}")
            .end()
            
            .log("Finished processing all items from the JSON file");
    }
    
    /**
     * Sample Person class for JSON unmarshaling
     */
    public static class Person {
        private String name;
        private int age;
        private String city;
        
        // Default constructor
        public Person() {}
        
        // Constructor with parameters
        public Person(String name, int age, String city) {
            this.name = name;
            this.age = age;
            this.city = city;
        }
        
        // Getters and setters
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        
        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }
        
        public String getCity() { return city; }
        public void setCity(String city) { this.city = city; }
        
        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + ", city='" + city + "'}";
        }
    }
}
