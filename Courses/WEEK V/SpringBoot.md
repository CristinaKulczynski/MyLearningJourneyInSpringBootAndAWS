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

- Reload the page and see the output. It's beautiful.  

![image](https://github.com/CristinaKulczynski/FourthFlutterCompassChallenge/assets/113571898/bddbb2ed-701a-46d6-af54-0e11ac0c228c)

- If you want to show all end points use an asterisk, observe the code below.
````conf
# Use wildcard "*" to expose all endpoints
# Can also expose individual endpoints with a comma-delimited list
management.endpoints.web.exposure.include=*
management.info.env.enabled=true
````
- Let's see the ``http://localhost:8080/actuator/threaddump`` (remember a thread dump is a snapshot of the current state of all threads running in a Java.)

### Spring Boot Actuator - Security 

- We need to add security dependency in our pom.xml file and run the project again and save the password that will be generated in the console.
```xml
<!-- ADD SUPPORT FOR SPRING SECURITY-->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>
```
- Then when the page loads, a login screen will appear, put the username (as this is the default) and the passwoed that was generated in the console.
![image](https://github.com/CristinaKulczynski/FourthFlutterCompassChallenge/assets/113571898/fe57641d-de7e-4e2a-8e85-51ba61564e33)

- Now we will disable endpoints for /health and /info. 
```conf
# Exclude individual endpois with a comma-delimited list
management.endpoints.web.exposure.exclude=health, info
```
### Run Spring Boot in Command Line
1. Open the cmd
2. Enter the project folder, in my case it was like this C:\Users\01-spring-boot-overview\05-command-line-demo0
3. Write the command ``mvnw package`` 
4. The Maven will do a lot of downloading.
5. Using the command ``cd target`` we will enter the target folder.``  
6. Using the command ``dir *.jar`` we will list all the jar files.
7. Coppy your application name
8. Run the application using the command ``java -jar <your application name>.jar``
9. Nice! 
10. To stop the application press ``ctrl + c``
11. Using the command ``cd ..`` we will return to the project folder.
12. Using the command ``mvnw spring-boot:run`` we will run the application again.
13. To stop the application press ``ctrl + c``

### Custom Application Properties 

- In the application.properties file we'll add the following code:

```conf	
#
# Define my crazy properties
#

coach.name=Mickey Mouse
team.name=The Mouse Club
```

- In the FunRestController class we'll add the following code:
```java
 @Value("${coach.name")
    private String coachName;
    @Value("${team.name")
    private String teamName;

    // expose new endpoint for "teaminfo"

    @GetMapping("/teaminfo")
    public String getTEamInfo(){
        return"Coach: " + coachName + ", Team name: " + teamName;
    }
```
- Run the project again and see the output in ``localhost:8080/teaminfo``

- The output expected is:

```text
Coach: Mickey Mouse, Team name: The Mouse Club
```

### Configuring the Spring Boot Server

- In the application.properties file we'll add the following code:

```conf
#
# Change Spring Boot embedded server port
#

server.port=7070
```
- Run the project again and see the output in ``localhost:7070/``

- Int the application.properties file we'll add the following code:

```conf
#
# Set the context path of the application
#
# All requests should be prefixed with /mycoolapp
#
server.servlet.context-path=/myapp
````

- Run the project again and see the output in ``localhost:7070/teaminfo``
- And in ``localhost:7070/myapp/teaminfo``

### Questions and answers

> From now on I will write in Portuguese to finish the course faster

Certo, agora que já criamos um projeto Spring Boot e executamos o aplicativo, vamos fazer algumas perguntas e respostas para entender melhor o funcionamento do projeto, as perguntas não estão em nenhuma ordem específica. 

- O que é uma injeção de dependencias ?

> Imagine que você tem uma amiga chamada Ana, que adora cozinhar. Ela decide fazer um bolo delicioso e precisa de alguns ingredientes. No entanto, ela não tem todos os ingredientes em sua despensa. Então, ela recorre à sua amiga Bruna, que é conhecida por sempre ter uma despensa cheia.

> Nessa história, Ana é o objeto que precisa dos ingredientes, e Bruna é a dependência, ou seja, a pessoa que possui os ingredientes necessários.

> Ana não quer sair correndo para a loja e comprar todos os ingredientes, então ela pede ajuda a Bruna. Bruna, como uma boa amiga, concorda em fornecer os ingredientes para Ana.

> Ana não precisa se preocupar em como ou onde Bruna conseguiu esses ingredientes, ela apenas confia que Bruna vai lhe entregar os ingredientes corretos. Essa é uma forma de desacoplamento entre Ana e Bruna - Ana não precisa saber todos os detalhes sobre como Bruna obteve os ingredientes.

> Voltando à injeção de dependências no Spring Boot, Ana seria a classe que precisa das dependências (os ingredientes), e Bruna seria a classe que fornece essas dependências.

> O Spring Boot age como o intermediário nessa história. Ele é como uma pessoa que sabe quem precisa de quais ingredientes e quem tem esses ingredientes. Ele faz a ligação entre as classes, garantindo que cada objeto obtenha as dependências corretas sem que eles mesmos precisem se preocupar com a criação dessas dependências.

Injeção de dependências (ou Dependency Injection, em inglês) é um padrão de projeto utilizado para gerenciar as dependências entre objetos em uma aplicação. O Spring Framework, especialmente o Spring Boot, é um framework de desenvolvimento em Java que suporta fortemente a injeção de dependências.

As anotações fornecidas pelo Spring, como **@Autowired** (injeta a carambolas da dependência, ~~porra~~ ), @Inject e @Resource, são usadas para marcar os pontos onde as dependências devem ser injetadas. O contêiner do Spring gerencia a criação dos objetos e suas dependências, garantindo que as instâncias corretas sejam criadas e injetadas nos lugares apropriados.

Para fazermos isso nós precisamos 

1. Definir a interface de dependência e a classe
2. Criar um método Demo REST Controller
3. Criar o construtor e a sua classe para injeções
4. Adicionar @GetMapping for /dailyworkout

- **O que é o @Component?** 

Ela é utilizada para indicar que a classe é um componente gerenciado pelo contêiner de inversão de controle. 

- Por quais anotações o @SpringBootApplication é composto?

    - @EnableAutoConfiguration que habilita a configuração automatica do SpringBoot
    - @ComponentScan permite a varredura de componentes do pacote atual e também escaneia recursivamente os subpacotes.
    - @Configuration indica que a classe é uma classe de configuração do Spring Boot. 

- **O que é o @Laze?**

A anotação @Lazy é usada para indicar que um bean deve ser inicializado somente quando for necessário. Isso é útil quando você tem um bean que é pesado para inicializar, mas que pode não ser usado durante a execução do aplicativo.

Para fazer isso em todo o projeto, entramos no arquivo application.properties e adicionamos a seguinte linha:

```conf
spring.main.lazy-initialization=true
```

- **Quais são os escopos adicionais do Spring Bean?**

    - Singleton que cria um único bean para cada contexto de aplicativo. É o escopo padrão.
    - Prototype que cria um novo bean sempre que solicitado.
    - Request que cria um único bean para cada solicitação HTTP. Isso é usado apenas para aplicativos da web.
    - Session que cria um único bean para cada sessão HTTP. Isso também é usado apenas para aplicativos da web.
    - GlobalSession que cria um único bean para cada sessão global HTTP. Isso também é usado apenas para aplicativos da web.









