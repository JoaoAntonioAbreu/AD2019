/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_grupo;

import java.util.Scanner;

/**
 *
 * @author Turma A
 */
public class main {

    public static void main(String[] args) {
     

        for (int i = 0; i < Game.Command.values().length; i++) {
            System.out.println(Game.Command.values()[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduza uma comando: ");
        String com = scanner.nextLine().toUpperCase();

        Game.optionSwitch(com);

    }

}
