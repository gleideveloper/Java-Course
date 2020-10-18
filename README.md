# JavaCourse
## Conceito POO
1. Classe: É um modelo que decreve os tipos de <b>estado e comportamento</b> que os objetos do seu tipo podem ter.

2. Obejto: No tempo de execução, quando JVM encontra a palavra <b>new</b>, ela usa a classe (molde do objeto)
apropiada para criar um objeto que será uma instância dessa classe, e terá seu próprio estado e acesso a todos
os comportamentos definidos por sua classe. 

3. Classe Abstrata: São classes que não podem ser instanciadas, ou seja, somente <b>subclasses não abstradas podem
ser instanciadas</b>. Seu propósito, missão na vida, é ser estendida (subclassificada) .

## Herança

1. Herança: É um tipo de associação que permite que uma classe herde todos os dados e comportamentos de outra.
    * Vantangens:
        * Reuso: Herança permite o reuso de atributos e métodos (dados e comportamentos)
        * Polimorfismo: É o recurso que permite que variáveis de um mesmo tipo mais genérico possam
    apontar para obejtos tipos específicos, tendo assim comportamento diferentes conforme cada tipo.

    ![Alt text](conceito-poo/src/Inheritance_polymorphism/Herança-polimorfismo.png?raw=true "Herança & Polimorfismo")
    
2. Encapsulamento: Vem de encapsular, que em programação orientada a objetos significa separar o programa em partes,
o mais isolado possível. A idéia é tornar o software mais flexível, fácil de modificar e de criar novas implementações.
O Encapsulamento serve para controlar o acesso aos atributos e métodos de uma classe.
    * O encapsulamento que é dividido em dois níveis:
        * Nível de classe: Quando determinamos o acesso de uma classe inteira que pode ser public ou Package-Private (padrão);
        * Nível de membro: Quando determinamos o acesso de atributos ou métodos de uma classe que podem ser public, private, protected ou Package-Private (padrão).
    * Modificadores de Acesso: Eles são palavras chave que permitem o acesso, dependendo de alguns níveis a atributos, métodos e classes e derivados. São essenciais para utilizar o conceito de Encapsulamento.
    ![Alt text](conceito-poo/src/Inheritance_polymorphism/Modificadores-de-acesso.png?raw=true "Modificadores de Acesso")

## Type Exception customization
1. Class extends Exception
2. Class extends RuntimeException

## Project: Chess Game System

<a href="https://github.com/gleideveloper/project-chess-java" title="Project: Chess Game System">Link Project: Chess Game System</a>

## Interfaces
Enquanto uma classe abstrata pode define tanto métodos abstratos quanto não-abstratos, uma interface só pode ter métodos abstratos.
Elas apresetam muito pouca flexibilidade em relação aos seus métodos e variáveis declarados.

<b>As regras restritas de uma interface:</b>
* Todos o métodos de interface <i><b>são implicitamente public e abstract</b></i>, ou seja, não precisa digitar os modificadores de acesso
 <i><b>public ou abstract</b></i>, na declaração dos métodos.
 * Todas as variáveis definidas em uma interface devem ser <i><b>public, static e final</b></i>, ou seja, <b>as interfaces
 só podem declarar constantes</b> e não variáveis de instâncias.
 * Os métodos não podem ser <b>static</b>.
 * Uma interface pode <b>estender uma ou mais interfaces diferentes.</b>
 * Uma interface não pode <b>estender nada que não seja outra interface.</b>
 * Uma interface não pode <b>implementar outrar interface ou classe.</b>

<b>Conceitos:</b>
* É uma espécie de <b>superclasse 100% abstrata</b> que define os métodos que uma subclasse.
* É um <b>tipo que define um conjunto de operações</b> que uma classe deve implementar.
* Quando uma interface implementada <b>é estabelecido um contrato</b>, qualquer tipo de classe que implementar essa interface
precisa concordar em escrever o código dos métodos desse contrato.

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

<p><b>Exercício de fixação</b></p>

![Alt text](interfaces/src/exercicio_de_fixacao/exercicio_de_fixacao_uml.png?raw=true "Modificadores de Acesso")