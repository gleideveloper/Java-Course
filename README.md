# JavaCourse
## Conceito POO
1. Class Abstract
2. Enum and Composition
3. Basic Exceptions
4. Inheritance and Polymorphism

## Type Exception customization
1. Class extends Exception
2. Class extends RuntimeException

## Project: Chess Game System

<a href="https://github.com/gleideveloper/project-chess-java" title="Project: Chess Game System">Link Project: Chess Game System</a>

## Interfaces
<b>Conceitos:</b>
* Interface é um <b>tipo que define um conjunto de operações</b> que uma classe deve implementar.
* Interface estabelece um <b>contrato.</b>

<b>Pra quê serve interfaces?</b>
* Serve para criar sistemas com <b>baixo acoplamento e flexíveis.</b>
<p>Exemplo:</p>
A interface define as operações, a classe que implementar essa interface deverá implementar todas as suas operações.

```java
interface Shape {
    double area();
    double perimeter();
}
```
### Inversão de controle, Injeção de dependência

<b>acoplamento forte.</b>
* A classe RentalService <b>conhece a dependência concreta</b> BrasilTaxService.
* Se a classe concreta mudar, é <b>preciso mudar a classe RentalService.</b>

Nesse exemplo abaixo existem um alto acoplamento entre esse dois serviços, não sendo uma boa prática, sem o uso de interface.
![Alt text](interfaces/src/SolucaoSemInterfaces.png?raw=true "Forte Acoplamento")
* A classe RentalService é responsável por instanciar suas dependências, causando um forte acoplamento com dois pontos de alteração, um na classe RentalService e outro no programa principal.

```java
class RentalService {
    (...)
    
    private BrazilTaxService taxService;
    
    (...)
}
````

<b>acoplamento fraco.</b>
* A classe RentalService <b>não conhece a dependência concreta</b>
* Se a classe concreta mudar, <b>a classe RentalService não muda</b>, e só é alterado em um único lugar.

Nesse exemplo abaixo temos um <b>fraco acoplamento</b> entre esse dois serviços, com o uso da interface TaxService.
![Alt text](interfaces/src/SolucaoComInterfaces.png?raw=true "Fraco Acoplamento")

```java
class RentalService {
    (...)
    
    private TaxService taxService;
    
    (...)
}
````

<p><b>Injeção de dependência por meio do construtor</b></p>
É a injeção de dependência chamada pelo construtor através de um upcasting, onde minha classe mais especifica é instanciada no contrustor da classe RentalService.

![Alt text](interfaces/src/InjeçãoDeDependência.png?raw=true "Injeção de Dependeência")

Se a própria classe RentalService não deve ser responsável por instanciar suas dependências.

<p><b>Inversão de controle</b></p>

É um padrão de desenvolvimento que consiste em <b>retirar da classe a responsabilidade de instanciar suas dependências.</b>

<p><b>Injeção de dependência</b></p>

É uma forma de <b>realizar a inversão de controle</b>: um componente externo instacia a dependência, que é então injetada no objeto "pai" através desse componente. Pode ser implementada de vários formas:
* Construtor
* Classe de instanciação (builder/factory)
* Container / framework