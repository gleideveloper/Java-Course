package generico_delimitado.application;

import generico_delimitado.entities.Circle;
import generico_delimitado.entities.Rectangle;
import generico_delimitado.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class ProgramBounded {
    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0,2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myCircles));
    }
    /**
     * Método totalArea recebe uma lista de qualquer tipo de seja um subtipo de shape
     * Não sendo possível a adição de elementos nessa lista
     * @param myList
     * @return
     */
    private static double totalArea(List<? extends Shape> myList) {
        double sum = 0.0;
        for (Shape shape : myList) {
            sum += shape.area();
        }
        return sum;
    }
}