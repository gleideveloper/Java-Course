package abstraction.abstract_method;

import abstraction.abstract_method.entities.Circle;
import abstraction.abstract_method.entities.Rectangle;
import abstraction.abstract_method.entities.Shape;
import abstraction.abstract_method.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgAbstractMethod {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner((System.in));
        List<Shape> list = new ArrayList<>();
        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectrangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (ch == 'r') {
                System.out.print("With: ");
                double with = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, with, height));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
        }
        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape shape:list) {
            System.out.println(String.format("%.2f", shape.area()));
        }
        sc.close();
    }
}
