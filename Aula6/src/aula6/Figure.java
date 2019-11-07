/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;

import java.util.ArrayList;

/**
 *
 * @author Turma A
 */
public class Figure {
    public ArrayList<Shape> shapes;

    public Figure() {
        shapes = new ArrayList<Shape>();
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }         

   public void add(Shape shape){
       this.shapes.add(shape);
   }
  
   
}
