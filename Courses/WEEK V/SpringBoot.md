# Spring Boot 3, Spring 6 & Hibernate for Beginners 

### Spring Boot and Spring
- Spring Boot uses Spring behind the scenes
- Spring Boot sumply makes it easeir to use Spring basically

### Spring Initializr
- Quickly create a starter Spring Boot project in ``https://start.spring.io``

### Maven
- Maven is a build automation tool used primarily for Java projects, think of Maven as your friendly helper or your personal shopper.

### Development Process 
1. Configure our project at Spring Initializr website.
    1. **Project**: Maven 
    2. **Language**: Java
    3. **Spring Boot**: 3.1.0
    4. **Dependencies**: Spring WEB
2. Dowlnoad the project.
3. Unzip the file.
4. Import the project into our IDE. 
5. Your project should look like the image below.
![teste](https://github.com/CristinaKulczynski/MyLearningJourneyInSpringBootAndAWS/assets/113571898/39f79e38-eefc-4192-9f4f-4dc0ee36785c)
6. I will run the project and the output will look like this:
![Capturar](https://github.com/CristinaKulczynski/FourthFlutterCompassChallenge/assets/113571898/a0c9e768-2bda-4da4-bbf6-aa0034564ae8)
7. We'll make a REST Controller and we'll  set up a get mapping, don't scared it's very simple. 
8. Create a new folder inside the myapp and name it rest.
9. Create a new class inside the rest folder and name it FunRestController.
10. Inside the FunRestController class we'll add the following code:
```java
package com.study.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }
}
```
11. Run the project again and see the output.


### Core Container
- Beans is a Spring's way of managing Java Objects.
- Core Container is the heart of the Spring Framework.
- SpEL is a powerful expression language that supports querying and manipulating an object graph at runtime.
- Context is a way to access objects that are managed by Spring.

### Acessing Endpoints 
- In file application.properties we'll add the following code:
```conf
management.endpoints.web.exposure.include=health,info
management.info.env.enabled=true

info.app.name=My Super Cool App
info.app.description=A crazy fun app. yoohoo!
info.app.version=1.0.0
```
![endpoints](https://github.com/CristinaKulczynski/FourthFlutterCompassChallenge/assets/113571898/0b491158-24d7-4d60-93d9-77ff106fa326)

- **The output expected is:**
![Visivel](https://github.com/CristinaKulczynski/FourthFlutterCompassChallenge/assets/113571898/b9a638ee-8c95-455e-97ba-6dde32e39002)

- We will add an extension in Chrome to visualize the json better [JSON Formatter](https://chrome.google.com/webstore/detail/json-formatter/bcjindcccaagfpapjjmafapmmgkkhgoa?hl=pt-BR)

- Reload the page and see the output. 







