### Mongo DB ✨

#### O que é MongoDB?
- É um banco de dados orientado a documentos livre, de código aberto e multiplataforma. Usa NoSQL.
- Possui melhor flexibilidade e escalabilidade.

#### Diferença entre SQL e NoSQL 🤔
- SQL: Relacional, tabelas, linhas e colunas, esquema definido, linguagem SQL, ACID, JOINs, escalabilidade vertical.
- NoSQL: Não relacional, documentos, coleções, sem esquema, linguagem própria, BASE, escalabilidade horizontal.

#### Instalando MongoDB no Windows
Se clicar na imagem abaixo será redirediconado ao site oficial do MongoDB, onde poderá baixar o MongoDB Community Server. A minha versão é a 6.0.6 para a plataforma Windos e o pacote foi o msi.

| Banco de Dados | 
| ---------------|
| <div><a href="https://www.mongodb.com/try/download/community-kubernetes-operator" target="_blank"><img src="https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white" target="_blank"></a></div>

A dica para instalar é utilizar o NFC, ou seja, Next, Next, Finish e Close. Não esqueça de marcar a caixinha de Install MongoDB Compass. Pois será a interface. 

Mas no final das contas vou usar outra interface, a Studio 3T.

É só baixar da internet e instalar.

#### Criando um banco de dados

Vamos abrir o Studio 3T, clicar com o botão direito na pasta localhost e selecionar a opção Create Database. Dê um nome da sua preferência. Eu coloquei o nome spring. 

##### 1 - Criando uma coleção 
- Abra a pasta spring, depois clique com o botão direito em collections e crie uma coleção. 
- Dê um nome e depois clique em Create.

##### 2 - Inserindo dados na coleção
Clique no icone de folhinha com maisinho.

````json
{
   "name": "John"
}
````
````json
{
    "name" : "Peter",
    "mail" : "peter@gmail.com",
    "department" : {
        "department_name" : "Computer Science",
        "location" : "INDIA"
    }
}
````

````json
{
    "name" : "Steve",
    "mail" : "steve@gmail.com",
    "subject" : [
        {
            "subject_name" : "Java",
            "marks_obtained" : 70
        },
        {
            "subject_name" : "MongoDB",
            "marks_obtained" : 80
        }
    ]
}
````

##### 2 - Lendo os dados da coleção (ou documentos) 

- Vamos copiar o ID do primeiro documento 
- Vá no Query 
- Clique no icone com linhas e uma setinha para baixo coleque o id e Run.
- Daí vai aparecer os valores do documento.
- Ou você pode pesquisar dessa outra forma:

````json
{
    "name" : "Steve",
}
````
- Ou só colocar no espaço de pesquisa:
````json
{
    "mail" : "peter@gmail.com"
}
````
![teste](https://github.com/CristinaKulczynski/MyLearningJourneyInSpringBootAndAWS/assets/113571898/dbe2abcf-3d9c-40c2-808f-74b7450df0a5)

##### 3 - AND e OR

````json
{
    $and : [
        {
            "name" : "Peter"
        },
        {
            "mail" : "peter@gmail.com"
        }
    ]
}
````	
````json
{
    $or : [
        {
            "name" : "eter"
        },
        {
            "mail" : "peter@gmail.com"
        }
    ]
}
````	
#### IN 
````json
{
    "name" : {
        $in : ["John"]
    }
}
````
````json
{
    "name" : {
        $in : ["John", "Peter"]
    }
}
````
#### Atualizando documento

- Clique no documendo e edit. 
- Pelo comando também, abrindo o IntelliShell.

![image](https://github.com/CristinaKulczynski/MyLearningJourneyInSpringBootAndAWS/assets/113571898/372ba9cd-93bf-4587-b35e-8c3c40c68c41)
