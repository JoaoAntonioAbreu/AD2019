/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;
import java.lang.Math;
/**
 *
 * @author Turma A
 */
public  class  Circle extends Shape {
    private double radius;

    public Circle(double radius, Point position) {
        super(position);
        this.radius = radius;
    }

   
    
    
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14*Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius; //To change body of generated methods, choose Tools | Templates.
    }

    
}
