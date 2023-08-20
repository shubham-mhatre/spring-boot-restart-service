
# Spring boot restart service

without requiring manual stop and start, resume the spring boot application via the API


## Purpose/Usage

We need to restart our spring boot application due to below reasons.              

1. Reloading configuration files after modifying a parameter.
2. Modifying the active profile in-flight.  
3. For any reason, re-initializing the application context.

## Working

In this example, 
1. We made an API endpoint available that returns data from a property file.
2. In our programme, we maintained some keys and default values application.properties file.
3. After the initial run, we are updating the value for that key in the property file without stopping the application.
4.Now hit the exposed endpoint to start the service again. We should receive the most recent value for the property file key upon restart. 

## Screenshots
API Endpoints:
![App Screenshot](https://github.com/BooleanBros/spring-boot-restart-service/assets/118552076/9e5eae40-635f-4611-8011-0ee19b25c2a3)

Application.properties file:

![App Screenshot](https://github.com/BooleanBros/spring-boot-restart-service/assets/118552076/d8b439ed-2b01-48c6-938a-a3d65ad1f1cf)



hit api endpoint : http://localhost:8080/hello

Output: 

![App Screenshot](https://github.com/BooleanBros/spring-boot-restart-service/assets/118552076/06d866af-22cb-4437-8195-da92bb98ae5d)

change property file value.
hit api endpoint : http://localhost:8080/restart


output:

![App Screenshot](https://github.com/BooleanBros/spring-boot-restart-service/assets/118552076/2a6934ac-1805-4790-928b-0d48fd5acb39)

now again hit api endpoint : http://localhost:8080/hello & we should get updated value.

output:

![App Screenshot](https://github.com/BooleanBros/spring-boot-restart-service/assets/118552076/b1473f44-9655-45cb-af0c-a56aca258bd6)




