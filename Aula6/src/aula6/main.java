/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;

/**
 *
 * @author Turma A
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle car = new Car(4, 2019, "Ford", "Fiesta", 233.99, "Black");
        System.out.println(car.toString());

        Vehicle bike = new Motocycle(2, 1999, "Yahama", "Supah Ninja", 0.99, "Pink");
        System.out.println(bike.toString());

        Point a = new Point();
        Point b = new Point();
        Point c = new Point();
        Point position = new Point();
        a.setXY(3.4, 2.4);
        b.setXY(5.0, 1.0);
        c.setXY(7.0, 6.0);
        Circle circle = new Circle(5.0, position);

        Triangle triangle = new Triangle(a, b, c, position);

        Rectangle rectangle = new Rectangle(5.0, 10.0, position);

        Figure fig = new Figure();
        fig.add(circle);
        fig.add(triangle);
        fig.add(rectangle);

        for (Shape shape : fig.getShapes()) {
            System.out.println(shape.getClass());
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
        }

    }
}
