/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

/**
 *
 * @author Turma A
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point ex1 = new Point();
        Point a = new Point();
        Point b = new Point();
        Point c = new Point();
        
        ex1.setX(2.5);
        System.out.println(ex1.getX());
        ex1.setY(8.5);
        System.out.println(ex1.getY());
        ex1.setXY(9.0, 7.0);
        System.out.println("x: " + ex1.getX() + " y: " + ex1.getY());
        System.out.println(ex1.distanceTo(a));

        
        Triangle triangle = new Triangle();
        a.setXY(3.4,2.4);
        b.setXY(5.0, 1.0);
        c.setXY(7.0, 6.0);
        triangle.setABC(a, b, c);
        System.out.println("base triangle: "+triangle.calculateBase());
        System.out.println("altura triangle: "+triangle.calculateAltura());
        System.out.println("area triangle: "+triangle.areaTriangulo());
        
        Rectangle rectangle = new Rectangle();
        Point topLeftPoint = new Point();
        topLeftPoint.setXY(2.5, 8.0);
        System.out.println("point x: "+topLeftPoint.getX()+" point y: "+topLeftPoint.getY());
        rectangle.setHeight(5.0);
        rectangle.setWidth(10.0);
        System.out.println("get height rectangle: "+rectangle.getHeight());
        System.out.println("get width rectangle: "+rectangle.getWidth());
        System.out.println("area rectangle: "+rectangle.areaRectangle());
        System.out.println("perimeter rectangle: "+rectangle.perimeterRectangle());
        System.out.println("within rectangle: "+rectangle.withinRectangle());
        
    }

}
