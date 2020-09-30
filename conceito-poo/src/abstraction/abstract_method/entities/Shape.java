package abstraction.abstract_method.entities;

import abstraction.abstract_method.entities.enums.Color;

public abstract class Shape {
    /**
     * Metódos Abstratos:
     * 1. São métodos que não possuem implementação.
     * 2. Precisam ser abstrados quando a classe é genérica demais par conter sua implementação.
     * 3. Se uma classe possuir pelos menos um método abstrado, então esta classe também é abstrada.
     * Notação UML: nome em itálico.
     */
    private Color color;
    public abstract double area();

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
