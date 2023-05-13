
## My Learning Journey in Spring Boot and AWS    ![](https://img.shields.io/badge/data-05%2F04-lightgrey)                                                     
Documenting My Experiences and Discoveries

![Comp](https://user-images.githubusercontent.com/113571898/230207820-c692edfd-04e1-47bf-a176-4252bf27fe9a.png)

### 1 - Os primeiros passos  
Um passo crucial no processo de aprendizagem é ter clareza sobre o objetivo a ser alcançado e as etapas necessárias para chegar lá. Definir objetivos específicos e estabelecer metas concretas pode ajudar a direcionar o foco e o esforço. Por exemplo, para aprender Spring Boot, pode ser útil definir uma meta de compreender os conceitos básicos e, a partir daí, estabelecer tarefas práticas que me ajudem a consolidar o conhecimento adquirido.
- Objetivo : Aprender Spring Boot
- Meta : Compreender os conceitos básicos.
- Anotações : Pesquisar "O que é Spring Boot" e fazer um pequeno resumo.

#### Resumo

Em um super resumo o Spring Boot é um framework para criação de aplicativos Java que simplifica  a criação de aplicativos autônomos, prontos para produção, com o mínimo de configuração. Ele é construído sobre o framework Spring e inclui várias ferramentas e bibliotecas que ajudam a desenvolver aplicações de maneira rápida e eficiente. 


![](https://img.shields.io/badge/data-06%2F04-lightgrey)
### 2 - Baixando uma IDE e um SDK

De acordo com a documentação preciso de uma IDE que tenha a linguagem Java e um SDK 17. Uma IDE é um ambiente de desenvolvimento e o SDK um kit de ferramentas de desenvolvimento. Como eu tinha formatado o meu pc, preciso baixá-los novamente, e como não lembro como faz vou assistir tutoriais. 


 | Documentação | IDE                                                        |  SDK JAVA 17                                                     |
 |--------------|------------------------------------------------------------|------------------------------------------------------------------|
 | <div><a href="https://spring.io/quickstart" target="_blank"><img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white" target="_blank"></a></div>|<div><a href="https://code.visualstudio.com/" target="_blank"><img src="https://img.shields.io/badge/VSCode-0078D4?style=for-the-badge&logo=visual%20studio%20code&logoColor=white" target="_blank"></a></div>|<div><a href="https://www.oracle.com/java/technologies/downloads/#jdk17-windows" target="_blank"><img src="https://img.shields.io/badge/Oracle-F80000?style=for-the-badge&logo=oracle&logoColor=black" target="_blank"></a></div>|
 
 Depois de instalar e configurar vou fazer o "meu" primeiro código focado em Spring Boot. Não sei se estou entendendo muito bem, mas não entender faz parte do aprendizado. Se você clicar nas imagenzinhas acima será redirecionado as páginas que citei.
 

### 3 - Iniciar um novo projeto Spring Boot (baby steps) 
<details>

<summary> Descrição do primeiro projeto </summary>

 #### PASSO 1 - CRIAR

- Cliquei nesse link https://start.spring.io/ 
- Configurei como no gif abaixo

![spring](https://user-images.githubusercontent.com/113571898/230308331-00561c79-abbd-4bdf-bb43-cff0b0368543.gif)

- Cliquei em 'ADD DEPENDENCIES' e selecionei Spring Web
- Depois apertei 'CTROL' + 'ENTER'
- Salvei o arquivo 'demo.zip' e extrai seu conteúdo
#### PASSO 2 - MODIFICAR

- Abri a IDE, selecionei a pasta demo e localizei o arquivo ``DemoApplication.java`` na ``src/main/java/com/example/demo``
- Subistitui o que estava no arquivo por este código abaixo

```` java
package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
    public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
    }
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("Hello %s!", name);
    }
}
````
#### PASSO 3 - TESTAR

- Abri o Prompt e entrei na pasta demo
- Coloquei esta linha dde comando para executar o projeto
```` java
.\gradlew.bat bootRun
````
- Esta foi a minha saída

![image](https://user-images.githubusercontent.com/113571898/230321526-047ae12f-aa77-42bf-a370-1a836b4120d8.png)
 
- Abri meu navegador e na barra de endereço na parte superior digitei `http://localhost:8080/hello`
- Olha só, temos um belo Hello World! 

![image](https://user-images.githubusercontent.com/113571898/230323688-6d1c3008-e996-4ebe-8db6-e7971e809894.png)

- Coloquei `?name=` no final do endereço e olhe só

![image](https://user-images.githubusercontent.com/113571898/230323529-742726d5-e135-4fc6-b58f-483ccab7815a.png)

</details>

![](https://img.shields.io/badge/data-15%2F05-lightgrey)

### 4 - Cursos complementares Scrum, GIT, Cyber Security
<details>

<summary> Cursos da trilha da Compass </summary>
  Os cursos abrangem temas como metodologia ágil, cibersegurança, Git e alguns cursos opcionais sobre AWS. Os resumos desses cursos estão disponíveis na pasta 'Courses WEEK I'. Além disso, vou adicionar os cursos que eu fizer lá também, mas o aprendizado de Spring continuará sendo documentado aqui no README.
</details>
