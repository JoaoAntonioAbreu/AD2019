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
public class Rectangle {
    private Point topLeftPoint;
    private double height;
    private double width;

    public Rectangle() {
        topLeftPoint = new Point();
        height = 0.0;
        width= 0.0;
    }

    public Rectangle(Point topLeftPoint, double height, double width) {
        this.topLeftPoint = topLeftPoint;
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public Point getTopLeftPoint() {
        return topLeftPoint;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public double areaRectangle(){
        double area = this.width * this.height;
        return area;
    }
    
    public double perimeterRectangle(){
        double perimeter = this.width+this.width+this.height+this.height;
        return perimeter;
    }
    
    public boolean withinRectangle(){
        boolean ver = false;
        if(this.topLeftPoint.getX() <this.height || this.topLeftPoint.getY() < this.width){
            ver = true;
        }
        return ver;
    }
}
