### SQL Bootcamp ✨

#### O é SQL? 
- Uma linguagem de consulta estruturada.
#### O que são Databases? 🤔
- São sistemas que permitem que usuários armazenem e organizem dados.
- E uma grande quantidade de dados.
#### Usuários típicos de Databases 👥
- Analistas
    - Marketing
    - Negócios
    - Vendas 
- Tecnicos 
    - Engenheiros de Software
    - Cientistas de Dados
    - Engenheiros de Dados
    - Administradores de Banco de Dados
- Basicamente qualquer pessoa que precise armazenar e organizar dados.
#### Databases
- Integriade de dados
- Quantidade massiva de dados
- Automatização de passos para reutilização
- Suporte para websites e aplicações

---
### Vamos fazer o download do PostgreSQL

#### 1 - Passo
- Vamos acessar o site do [PostgreSQL](https://www.postgresql.org/download/) e fazer o download do PostgreSQL.
- Vamos escolher o sistema operacional que estamos utilizando e fazer o download da versão mais recente.
- Instalar o PostgreSQL.
- Vamos clicar em next até chegar na tela de senha, criamos uma senha.
- Clica next até o final e finish.

#### 2 - Passo
- Instalar o [PgAdmin](https://www.pgadmin.org/download/).

#### 3 - Passo
- Vamos baixar(porém não abrir diretamente) o dvdrental.tar.

#### 4 - Passo
- Reiniciar o computador.

#### 5 - Passo
- Restaurar o banco de dados. 
- Ignore a falha.
- Abrir o PgAdmin.
- Crie uma senha.
- Crie um database.
- Clique com o botão direito em cima do database e clique em restore.
- Clique selecione o arquivo dvdrental.tar.
- Ative o post-data o pre-data e o data.
- Clique em restore.
- Faça o refresh no database.
- Clique em Query Tool.
- Digite o comando: SELECT * FROM film; 
- Aperte o botão de play.
- Pronto, agora você tem acesso ao banco de dados.

---

###  Foto comandos SQL 
![Foto comandos SQL](https://github.com/CristinaKulczynski/MyLearningJourneyInSpringBootAndAWS/assets/113571898/901f3bda-8153-4a5d-b68c-87bbb817abf5
)

### Comandos SQL

- SELECT seleciona a coluna que você quer.
````sql	
SELECT coluna1, coluna2
FROM tabela;
````
- FROM seleciona a tabela.
- DISTINCT seleciona os valores únicos.
````sql	
SELECT DISTINCT coluna
FROM tabela;
````
- WHERE condições especificas.
````sql	
SELECT coluna
FROM tabela
WHERE condição;
````
- ORDER BY seleciona a ordem.
````sql	
SELECT coluna
FROM tabela
ORDER BY coluna ASC/DESC;
````
- LIMIT seleciona a quantidade de linhas.
````sql	
SELECT coluna
FROM tabela
LIMIT quantidade;
````
- BETWEEN seleciona o intervalo.
````sql	
SELECT coluna
FROM tabela
WHERE coluna BETWEEN valor1 AND valor2;
````
- IN se o valor especifico está dentro da tabela.
````sql	
SELECT coluna
FROM tabela
WHERE coluna IN (valor1, valor2, valor3);
````
- LIKE buscar registros que comecem com um determinado valor por exemplo.
````sql	
SELECT coluna
FROM tabela
WHERE coluna LIKE 'valor%';
````
- GROUP BY agrupa os valores. 
````sql	
SELECT coluna1, coluna2
FROM tabela
GROUP BY coluna1, coluna2;
````
- AS renomeia a coluna.
````sql
SELECT coluna AS novo_nome
FROM tabela;
````
- HAVING condições especificas para o GROUP BY.
````sql
SELECT coluna1, coluna2
FROM tabela
GROUP BY coluna1, coluna2
HAVING condição;
````
- INNER JOIN junta duas tabelas.
````sql
SELECT coluna
FROM tabela1
INNER JOIN tabela2 ON tabela1.coluna = tabela2.coluna;
````
- LEFT JOIN junta duas tabelas e mostra todos os valores da tabela da esquerda.
````sql
SELECT coluna
FROM tabela1
LEFT JOIN tabela2 ON tabela1.coluna = tabela2.coluna;
````
- RIGHT JOIN junta duas tabelas e mostra todos os valores da tabela da direita.
````sql
SELECT coluna
FROM tabela1
RIGHT JOIN tabela2 ON tabela1.coluna = tabela2.coluna;
````
- FULL JOIN junta duas tabelas e mostra todos os valores das duas tabelas.
````sql
SELECT coluna
FROM tabela1
FULL JOIN tabela2 ON tabela1.coluna = tabela2.coluna;
````

### Funções SQL

- AVG() retorna a média.
    - ROUND() arredonda o valor.
````sql
SELECT AVG(coluna) AS media_arredondada
FROM tabela;
````
- COUNT() retorna a quantidade de linhas.
````sql
SELECT COUNT(*) AS quantidade_linhas
FROM tabela;
````
- MAX() retorna o maior valor.
````sql	
SELECT MAX(coluna) AS maior_valor
FROM tabela;
````
- MIN() retorna o menor valor.
````sql
SELECT MIN(coluna) AS menor_valor
FROM tabela;
````
- SUM() retorna a soma dos valores.
````sql
SELECT SUM(coluna) AS soma_valores
FROM tabela;
````

### Criar tabelas
````sql
 CREATE TABLE account(
    user_id SERIAL PRIMARY KEY, 
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(50) NOT NULL,
    email VARCHAR(250) UNIQUE NOT NULL,
    created_on TIMESTAMP NOT NULL,
    last_login TIMESTAMP
    )
````
````sql	
 CREATE TABLE job(
    job_id SERIAL PRIMARY KEY,
    job_name VARCHAR(200) UNIQUE NOT NULL
)
````

````sql	
CREATE TABLE account_job(
    user_id INTEGER REFERENCES account(user_id), 
    job_id INTEGER REFERENCES job(job_id),
    hire_date TIMESTAMP
)
````

````sql	
CREATE TABLE information(
    info_id SERIAL PRIMARY KEY,
    title VARCHAR(500) NOT NULL, 
    person VARCHAR(50) NOT NULL UNIQUE
)
````


### Inserir dados nas tabelas

````sql
INSERT INTO account(username, password, email, created_on)
VALUES
('Jose', 'pasword', 'jose@mail.com', CURRENT_TIMESTAMP)
````

````sql	
INSERT INTO job(job_name)
VALUES
('Astronaut')
````

````sql	
INSERT INTO job(job_name)
VALUES 
('President')
````

````sql	
INSERT INTO account_job(user_id, job_id, hide_date)
VALUES
(1, 1, CURRENT_TIMESTAMP)
````
````sql
INSERT INTO job(job_name)
VALUES
('Cowboy')
````

````sql	
INSERT INTO new_info (title)
VALUES
('Some new title')
````
### Atualizar tabelas

````sql
UPDATE account
SET last_login = CURRENT_TIMESTAMP
````
````sql
UPDATE account
SET last_login = created_on 
````
````sql	
UPDATE account_job
SET hire_date = account.created_on
FROM account
WHERE account_job.user_id = account.user_id
````

### Deletar 

````sql
DELETE FROM job
WHERE job_name = 'Cowboy'
RETURNING job_id, job_name
````

### Alterar tabelas

````sql
ALTER TABLE new_information 
RENAME TO new_info 
````

````sql
ALTER TABLE new_info
RENAME COLUMN person TO people 
````

````sql	
ALTER TABLE new_info
ALTER COLUMN people DROP NOT NULL
````

### DROP 

````sql	
ALTER TABLE new_info
DROP COLUMN people 
````
````sql	
ALTER TABLE new_info
DROP COLUMN IF EXISTS people 
````

### CHECK 

````sql	
CREATE TABLE employees(
    emp_id SERIAL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    birthday DATE CHECK(birthday > '1900-01-01'),
    hire_date DATE CHECK(hire_date > birthday),
    salary INTEGER CHECK(salary > 0)
)
````

### CASE

````sql	
SELECT customer_id,
CASE 
	WHEN (customer_id <= 100) THEN 'Premium'
	WHEN (customer_id BETWEEN 100 and 200) THEN 'Plus'
	ELSE 'Normal'
END AS customer_class
FROM customer 
````

````sql	
SELECT customer_id,
CASE customer_id
	WHEN 2 THEN 'Winner'
	WHEN 5 THEN 'Second Place'
	ELSE 'Normal'
END AS raffle_results
FROM customer 
```` 

````sql	
SELECT rental_rate,
CASE rental_rate
	WHEN 0.99 THEN 1
	ELSE 0
END
FROM film
````
````sql	
SELECT 
SUM(CASE rental_rate
	WHEN 0.99 THEN 1
	ELSE 0
END) AS number_of_bargains
FROM film
````
````sql	
SELECT 
SUM(CASE rental_rate
	WHEN 0.99 THEN 1
	ELSE 0
END) AS bargains,
SUM(CASE rental_rate
	WHEN 2.99 THEN 1
	ELSE 0
END) AS regular
FROM film
````
### CAST
    
````sql
SELECT CAST('5' AS INTEGER) AS new_int 
````
````sql
SELECT '5'::INTEGER 
````
````sql
SELECT CAST(inventory_id AS VARCHAR) FROM rental
````
````sql
SELECT CHAR_LENGTH(CAST(inventory_id AS VARCHAR)) FROM rental
````

### NULLIF

````sql
SELECT(
SUM(CASE WHEN department = 'A' THEN 1 ELSE 0 END)/
NULLIF(SUM(CASE WHEN department = 'B' THEN 1 ELSE 0 END), 0)
) AS department_ratio
FROM depts
````

### VIEWS

````sql
CREATE VIEW customer_info AS
SELECT first_name, last_name, address FROM customer
INNER JOIN address
ON customer.address_id = address.address_id
````
````sql
CREATE OR REPLACE VIEW customer_info AS
SELECT first_name, last_name, address, district FROM customer
INNER JOIN address
ON customer.address_id = address.address_id
````
````sql
DROP VIEW IF EXISTS customer_info
````	