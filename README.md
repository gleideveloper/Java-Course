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

<a href="https://github.com/gleideveloper/JavaCourse/tree/master/project-chess-game" title="Project: Chess Game System">Link Project: Chess Game System</a>

## Interfaces
<b>Conceitos:</b>
* Interface é um <b>tipo que define um conjunto de operações</b> que uma classe deve implementar.
* Interface estabelece um <b>contrato.</b>

<b>Pra quê serve interfaces?</b>
* Serve para criar sistemas com <b>baixo acomplamento e flexíveis.</b>
<p>Exemplo:</p>
A interface define as operações, a classe que implementar essa interface deverá implementar todas as suas operações.

```java
interface Shape {
    double area();
    double perimeter();
}
```
### Inversão de controle, Injeção de dependência

<b>Acomplamento forte.</b>
* A classe RentalService <b>CONHECE a dependência concreta</b>
* Se a classe concreta mudar, é <b>preciso mudar a classe RentalService.</b>

Nesse exemplo abaixo existem um alto acomplamento entre esse dois serviços, não sendo uma boa prática, sem o uso de interface.
```java
class RentalService {
    (...)
    
    private BrazilTaxService taxService;
    
    (...)
}
````

<b>Acomplamento fraco.</b>
* A classe RentalService <b>NÃO CONHECE a dependência concreta</b>
* Se a classe concreta mudar, <b>a classe RentalService não muda nada</b>

Nesse exemplo abaixo existem um alto acomplamento entre esse dois serviços, sem o uso de interface.
```java
class RentalService {
    (...)
    
    private TaxService taxService;
    
    (...)
}
````

![Alt text](interfaces/src/InjeçãoDeDependência.png?raw=true "Injeção de Dependeência")

<p><b>Inversão de controle</b></p>
<p><b>Injeção de dependência</b></p>
<b>Conceitos:</b> Padrão de desenvolvimento que consiste em retirar da classe a responsabilidade de instanciar suas dependências.

<p><b>Injeção de dependência por meio do construtor</b></p>
