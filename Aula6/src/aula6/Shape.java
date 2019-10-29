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
public abstract class Shape {
    private Point position;

    public Shape(Point position) {
        super();
        this.position = position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }
    
    public double getArea(){
        return position.getX()*position.getY();
    }
    public double getPerimeter(){
        return position.getX()+position.getX()+position.getY()+position.getY();
    }
}
