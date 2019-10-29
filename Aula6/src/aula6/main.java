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
    }
}
