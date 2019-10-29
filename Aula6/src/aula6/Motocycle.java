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
public class Motocycle extends Vehicle{

    private int leanAngle;
    public Motocycle(){
       super();
       this.leanAngle=0;
    }

    public Motocycle(int wheels, int year, String brand, String model, double price, String color) {
        super(year, brand, model, price, color);
        this.leanAngle = wheels;
    }

    @Override
    public String toString() {
        return "Esta bela mota "+super.toString()+" tem um lean angle de: "+leanAngle+" graus"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
