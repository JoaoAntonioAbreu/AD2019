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
public  class Triangle extends Shape{

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c, Point position) {
        super(position);
        this.a = a;
        this.b = b;
        this.c = c;
    }

   

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public void setABC(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        
    }

    public double calculateBase() {
        return this.b.distanceTo(this.c);
    }
    
    
    public double calculateAltura(){
        return this.b.distanceTo(this.a);
        
    }

    @Override
    public double getArea() {
        return ((this.b.distanceTo(this.a)*this.a.distanceTo(this.c))/2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPerimeter() {
       return Math.sqrt(Math.pow(calculateBase(), 2)+Math.pow(calculateAltura(), 2))+calculateAltura()+calculateBase(); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
    
}
