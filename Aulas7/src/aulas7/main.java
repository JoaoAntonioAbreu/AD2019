/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas7;

import java.util.Scanner;

/**
 *
 * @author Turma A
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < Menu.Command.values().length; i++) {
            System.out.println(Menu.Command.values()[i]);
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduza uma comando: ");
        String com = scanner.nextLine();
       
        System.out.println(Menu.optionIf(com));
        System.out.println(Menu.optionSwitch(com));
    
        
        Rational rational1 = new Rational(4, 5);
        Rational rational2= new Rational(4,5);
        int rat = 4;
        System.out.println(rational1.equals(rat));
        System.out.println("CompareTO: "+rational1.compareTo(rational2));
        System.out.println(rational1.hashCode());
    
    }
   
    
}
