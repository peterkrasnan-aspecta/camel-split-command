# How to use me

```bash
$  mvn clean package
$  java -jar target/quarkus-app/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2025-08-21 12:23:59,684 INFO  [org.apa.cam.qua.cor.CamelBootstrapRecorder] (main) Apache Camel Quarkus 3.20.0.redhat-00003 is starting
2025-08-21 12:23:59,690 INFO  [org.apa.cam.mai.MainSupport] (main) Apache Camel (Main) 4.10.3.redhat-00022 is starting
2025-08-21 12:23:59,724 INFO  [org.apa.cam.mai.BaseMainSupport] (main) Auto-configuration summary
2025-08-21 12:23:59,724 INFO  [org.apa.cam.mai.BaseMainSupport] (main)     [MicroProfilePropertiesSource] camel.main.durationMaxMessages = 1
2025-08-21 12:23:59,724 INFO  [org.apa.cam.mai.BaseMainSupport] (main)     [MicroProfilePropertiesSource] camel.dataformat.jackson.enableFeatures = ACCEPT_CASE_INSENSITIVE_PROPERTIES
2025-08-21 12:23:59,724 INFO  [org.apa.cam.mai.BaseMainSupport] (main)     [MicroProfilePropertiesSource] camel.dataformat.jackson.disableFeatures = FAIL_ON_UNKNOWN_PROPERTIES
2025-08-21 12:23:59,802 INFO  [org.apa.cam.com.fil.FileEndpoint] (main) Endpoint is configured with noop=true so forcing endpoint to be idempotent as well
2025-08-21 12:23:59,802 INFO  [org.apa.cam.com.fil.FileEndpoint] (main) Using default memory based idempotent repository with cache max size: 1000
2025-08-21 12:23:59,805 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Apache Camel 4.10.3.redhat-00022 (camel-1) is starting
2025-08-21 12:23:59,861 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Routes startup (total:1)
2025-08-21 12:23:59,861 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main)     Started route1 (file://src/main/resources/input)
2025-08-21 12:23:59,861 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Apache Camel 4.10.3.redhat-00022 (camel-1) started in 56ms (build:0ms init:0ms start:56ms boot:260ms)
2025-08-21 12:23:59,862 INFO  [org.apa.cam.mai.MainSupport] (camel-main) Waiting until complete: Duration max 1 messages processed
2025-08-21 12:23:59,863 INFO  [io.quarkus] (main) aspecta-camel-batch 1.0.0 on JVM (powered by Quarkus 3.20.2.redhat-00004) started in 0.429s. 
2025-08-21 12:23:59,863 INFO  [io.quarkus] (main) Profile prod activated. 
2025-08-21 12:23:59,863 INFO  [io.quarkus] (main) Installed features: [camel-bean, camel-core, camel-file, camel-jackson, cdi]
2025-08-21 12:24:00,881 INFO  [route1] (Camel (camel-1) thread #1 - file://src/main/resources/input) Reading JSON file: sample-data.json
2025-08-21 12:24:00,884 INFO  [route1] (Camel (camel-1) thread #1 - file://src/main/resources/input) File content: [
  {
    "name": "John Doe",
    "age": 30,
    "city": "New York"
  },
  {
    "name": "Jane Smith",
    "age": 25,
    "city": "Los Angeles"
  },
  {
    "name": "Bob Johnson",
    "age": 17,
    "city": "Chicago"
  },
  {
    "name": "Alice Brown",
    "age": 35,
    "city": "Houston"
  },
  {
    "name": "Charlie Wilson",
    "age": 16,
    "city": "Phoenix"
  }
]

2025-08-21 12:24:00,932 INFO  [route1] (Camel (camel-1) thread #1 - file://src/main/resources/input) Unmarshaled JSON to Person[]
2025-08-21 12:24:00,937 INFO  [route1] (Camel (camel-1) thread #1 - file://src/main/resources/input) Processing item: Person{name='John Doe', age=30, city='New York'}
2025-08-21 12:24:00,938 INFO  [route1] (Camel (camel-1) thread #1 - file://src/main/resources/input) Item details - Name: John Doe, Age: 30, City: New York
2025-08-21 12:24:00,938 INFO  [route1] (Camel (camel-1) thread #1 - file://src/main/resources/input) Adult person: John Doe
2025-08-21 12:24:00,939 INFO  [route1] (Camel (camel-1) thread #1 - file://src/main/resources/input) Final result: Processed: John Doe from New York
2025-08-21 12:24:00,940 INFO  [org.apa.cam.mai.MainDurationEventNotifier] (Camel (camel-1) thread #1 - file://src/main/resources/input) Duration max messages triggering shutdown of the JVM
2025-08-21 12:24:00,940 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (Camel (camel-1) thread #2 - CamelMainShutdownCamelContext) Apache Camel 4.10.3.redhat-00022 (camel-1) is shutting down (timeout:45s)
2025-08-21 12:24:00,940 INFO  [route1] (Camel (camel-1) thread #1 - file://src/main/resources/input) Processing item: Person{name='Jane Smith', age=25, city='Los Angeles'}
2025-08-21 12:24:00,941 INFO  [route1] (Camel (camel-1) thread #1 - file://src/main/resources/input) Item details - Name: Jane Smith, Age: 25, City: Los Angeles
2025-08-21 12:24:00,941 INFO  [route1] (Camel (camel-1) thread #1 - file://src/main/resources/input) Adult person: Jane Smith
2025-08-21 12:24:00,941 INFO  [route1] (Camel (camel-1) thread #1 - file://src/main/resources/input) Final result: Processed: Jane Smith from Los Angeles
2025-08-21 12:24:00,941 INFO  [route1] (Camel (camel-1) thread #1 - file://src/main/resources/input) Processing item: Person{name='Bob Johnson', age=17, city='Chicago'}
2025-08-21 12:24:00,942 INFO  [route1] (Camel (camel-1) thread #1 - file://src/main/resources/input) Item details - Name: Bob Johnson, Age: 17, City: Chicago
2025-08-21 12:24:00,942 INFO  [route1] (Camel (camel-1) thread #1 - file://src/main/resources/input) Minor person: Bob Johnson
2025-08-21 12:24:00,942 INFO  [route1] (Camel (camel-1) thread #1 - file://src/main/resources/input) Final result: Processed: Bob Johnson from Chicago
2025-08-21 12:24:00,942 INFO  [route1] (Camel (camel-1) thread #1 - file://src/main/resources/input) Processing item: Person{name='Alice Brown', age=35, city='Houston'}
2025-08-21 12:24:00,943 INFO  [route1] (Camel (camel-1) thread #1 - file://src/main/resources/input) Item details - Name: Alice Brown, Age: 35, City: Houston
2025-08-21 12:24:00,943 INFO  [route1] (Camel (camel-1) thread #1 - file://src/main/resources/input) Adult person: Alice Brown
2025-08-21 12:24:00,943 INFO  [org.apa.cam.imp.eng.DefaultShutdownStrategy] (Camel (camel-1) thread #3 - ShutdownTask) Waiting as there are still 2 inflight and pending exchanges to complete, timeout in 45 seconds. Inflights per route: [route1 = 2]
2025-08-21 12:24:00,943 INFO  [route1] (Camel (camel-1) thread #1 - file://src/main/resources/input) Final result: Processed: Alice Brown from Houston
2025-08-21 12:24:00,943 INFO  [route1] (Camel (camel-1) thread #1 - file://src/main/resources/input) Processing item: Person{name='Charlie Wilson', age=16, city='Phoenix'}
2025-08-21 12:24:00,944 INFO  [route1] (Camel (camel-1) thread #1 - file://src/main/resources/input) Item details - Name: Charlie Wilson, Age: 16, City: Phoenix
2025-08-21 12:24:00,944 INFO  [route1] (Camel (camel-1) thread #1 - file://src/main/resources/input) Minor person: Charlie Wilson
2025-08-21 12:24:00,944 INFO  [route1] (Camel (camel-1) thread #1 - file://src/main/resources/input) Final result: Processed: Charlie Wilson from Phoenix
2025-08-21 12:24:00,944 INFO  [route1] (Camel (camel-1) thread #1 - file://src/main/resources/input) Finished processing all items from the JSON file
2025-08-21 12:24:01,952 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (Camel (camel-1) thread #2 - CamelMainShutdownCamelContext) Routes stopped (total:1)
2025-08-21 12:24:01,952 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (Camel (camel-1) thread #2 - CamelMainShutdownCamelContext)     Stopped route1 (file://src/main/resources/input)
2025-08-21 12:24:01,955 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (Camel (camel-1) thread #2 - CamelMainShutdownCamelContext) Apache Camel 4.10.3.redhat-00022 (camel-1) shutdown in 1s14ms (uptime:2s)
2025-08-21 12:24:01,959 INFO  [io.quarkus] (main) aspecta-camel-batch stopped in 1.019s
```

