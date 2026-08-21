# FiapRide - Projeto Java

## Sobre o projeto

O **FiapRide** é um projeto desenvolvido em Java para representar, de forma simples, objetos relacionados a um sistema de transporte.

Neste projeto, foi criada a classe **Carro**, que representa um carro do mundo real. O objeto possui características como marca, cor e ano, além de métodos que permitem alterar algumas dessas características seguindo regras de validação.

## Classe Carro

A classe `Carro` está localizada no pacote:

```text
br.com.fiapride.model
```

Ela possui os seguintes atributos:

| Atributo | Tipo     | Descrição          |
| -------- | -------- | ------------------ |
| `marca`  | `String` | Marca do carro     |
| `cor`    | `String` | Cor atual do carro |
| `ano`    | `int`    | Ano do carro       |

## Métodos

A classe possui métodos para alterar o estado do objeto.

### `alterarCor(String novaCor)`

Altera a cor do carro.

A regra de negócio impede que uma cor vazia ou inválida seja atribuída ao carro.

Exemplo:

```java
meuCarro.alterarCor("Preto");
```

Também são realizados testes com valores inválidos para verificar se a validação está funcionando.

### `atualizarAno(int novoAno)`

Atualiza o ano do carro.

O método possui uma validação para impedir que seja informado um ano inválido.

Exemplo:

```java
meuCarro.atualizarAno(2020);
```

Um exemplo de valor inválido utilizado no projeto é:

```java
meuCarro.atualizarAno(1800);
```

Nesse caso, o ano do objeto não é alterado.

## Instanciação dos objetos

No `SistemaPrincipal`, são criados dois objetos da classe `Carro`.

### Primeiro carro

```java
Carro meuCarro = new Carro();

meuCarro.marca = "Lamborghini";
meuCarro.cor = "Verde";
meuCarro.ano = 2015;
```

Depois, são realizados testes para alterar a cor e o ano do carro, utilizando valores válidos e inválidos.

### Segundo carro

```java
Carro carroAleatorio = new Carro();

carroAleatorio.marca = "BMW";
carroAleatorio.cor = "Azul";
carroAleatorio.ano = 2020;
```

O segundo objeto também é utilizado para testar os métodos de alteração e suas respectivas regras de validação.

## Objetivo dos testes

O projeto demonstra os principais conceitos de Programação Orientada a Objetos:

* Criação de uma classe;
* Definição de atributos;
* Instanciação de objetos com `new`;
* Alteração do estado dos objetos por meio de métodos;
* Criação de regras de negócio com `if`;
* Validação de valores válidos e inválidos;
* Criação de diferentes objetos a partir da mesma classe.

## Estrutura do projeto

```text
Projeto/
├── .gitignore
├── README.md
├── Carro.asta
└── src/
    └── br/
        └── com/
            └── fiapride/
                ├── main/
                │   └── SistemaPrincipal.java
                └── model/
                    ├── Carro.java
                    └── Passageiro.java
```

## Como executar

1. Abra o projeto no **Eclipse IDE**.
2. Localize a classe `SistemaPrincipal`.
3. Clique com o botão direito na classe.
4. Selecione **Run As → Java Application**.
5. Observe no console os testes dos dois objetos `Carro`.

## Diagrama UML

O diagrama da classe `Carro` foi desenvolvido no **Astah** e está armazenado no arquivo:

```text
Carro.asta
```

O diagrama apresenta os atributos da classe e os métodos responsáveis por alterar o estado do objeto.

## Tecnologias utilizadas

* Java
* Eclipse IDE
* Astah
* Git
* GitHub
