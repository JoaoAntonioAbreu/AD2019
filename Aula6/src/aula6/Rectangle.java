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
public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(double height, double width, Point position) {
        super(position);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.width * this.height;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPerimeter() {
        return this.width + this.width + this.height + this.height; //To change body of generated methods, choose Tools | Templates.
    }
}
