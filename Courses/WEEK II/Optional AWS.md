## Mapa mental: Comandos básicos em java

````java
- Declaração de Variáveis:
  - int idade = 20;
  - double salario = 2500.50;
  - boolean isTrue = true;
  - String nome = "João";

- Entrada e Saída de Dados:
  - System.out.println("Olá, mundo!");
  - Scanner scanner = new Scanner(System.in);
    int numero = scanner.nextInt();
    System.out.println("O número digitado foi: " + numero);

- Estruturas Condicionais:
  - if (idade > 18) {
      System.out.println("Maior de idade");
    } else {
      System.out.println("Menor de idade");
    }

  - switch (opcao) {
      case 1:
        System.out.println("Opção 1 selecionada");
        break;
      case 2:
        System.out.println("Opção 2 selecionada");
        break;
      default:
        System.out.println("Opção inválida");
    }

- Loops:
  - for (int i = 0; i < 10; i++) {
      System.out.println("Iteração " + i);
    }

  - while (condicao) {
      System.out.println("Executando enquanto a condição for verdadeira");
      // Atualiza a condição para evitar um loop infinito
    }

  - do {
      System.out.println("Executa pelo menos uma vez");
      // Atualiza a condição para evitar um loop infinito
    } while (condicao);

  - break; // interrompe o loop atual
  - continue; // vai para a próxima iteração do loop

- Estruturas de Dados:
  - int[] numeros = {1, 2, 3, 4, 5};
    System.out.println(numeros[0]); // Acessando o primeiro elemento do array

  - ArrayList<String> nomes = new ArrayList<String>();
    nomes.add("João");
    nomes.add("Maria");
    System.out.println(nomes.get(0)); // Acessando o primeiro elemento da lista

- Operadores:
  - int resultado = a + b;
  - boolean condicao = (x > y) && (z < 10);
  - int valor = (condicao) ? 10 : 20; // Se a condição for verdadeira, valor recebe 10, caso contrário, recebe 20

- Funções e Métodos:
  - public static void imprimirMensagem() {
      System.out.println("Olá, mundo!");
    }
    imprimirMensagem(); // Chamada da função

  - public static int somar(int a, int b) {
      return a + b;
    }
    int resultado = somar(3, 5); // Chamada do método e atribuição do retorno à variável

- Exceções:
  - try {
      // código que pode gerar uma exceção
    } catch (Exception e) {
      // código para tratamento da exceção
      System.out.println("Ocorreu uma exceção: " + e.getMessage());
    } finally {
      // código executado sempre, independentemente da exceção
    }

  - throw new Exception("Mensagem de erro"); // Lançamento de uma exceção

- Manipulação de Strings:
  - String nomeCompleto = nome1 + " " + nome2;
  - boolean isEqual = str1.equals(str2); // Verifica se as strings são iguais
  - String substring = str.substring(0, 5); // Obtém uma parte da string, do índice 0 ao 4
  - int valor = Integer.parseInt(str); // Converte uma string em um valor inteiro

- Manipulação de Arquivos:
  - FileReader reader = new FileReader("arquivo.txt");
  - FileWriter writer = new FileWriter("arquivo.txt");
  - BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
  - BufferedWriter writer = new BufferedWriter(new FileWriter("arquivo.txt"));

````
#### Classes e Objetos

```java
public class Carro {
    private String marca;
    private String modelo;
    
    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }
    
    public void frear() {
        System.out.println("O carro está freando.");
    }
    
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla");
        meuCarro.acelerar();
        meuCarro.frear();
    }
}

```

#### Construtores

```java
public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
    
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25);
        pessoa.imprimirInformacoes();
    }
}

```
#### Encapsulamento

```java
public class Banco {
    private double saldo;
    
    public void depositar(double valor) {
        saldo += valor;
    }
    
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public static void main(String[] args) {
        Banco conta = new Banco();
        conta.depositar(1000);
        conta.sacar(500);
        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}

```
#### Herança

```java
public class Animal {
    public void comer() {
        System.out.println("O animal está comendo.");
    }
}

public class Cachorro extends Animal {
    public void latir() {
        System.out.println("O cachorro está latindo.");
    }
}

public static void main(String[] args) {
    Cachorro dog = new Cachorro();
    dog.comer();
    dog.latir();
}

```
#### Polimorfismo

```java
public class Animal {
    public void emitirSom() {
        System.out.println("O animal emite um som.");
    }
}

public class Cachorro extends Animal {
    public void emitirSom() {
        System.out.println("O cachorro late.");
    }
}

public class Gato extends Animal {
    public void emitirSom() {
        System.out.println("O gato mia.");
    }
}

public static void main(String[] args) {
    Animal animal1 = new Cachorro();
    Animal animal2 = new Gato();
    
    animal1.emitirSom(); // Output: O cachorro late.
    animal2.emitirSom(); // Output: O gato mia.
}

```