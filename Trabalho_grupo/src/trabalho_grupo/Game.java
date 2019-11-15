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
public class Game {

    public enum Command {
        ARMY, INSPECT, PLAY, QUIT;
    }

    public static void optionSwitch() {
        Scanner scanner = new Scanner(System.in);

        String options = "";
        // Command command = Command.valueOf(options);

        Army player = new Army();

        int catapultas;
        int cavalaria;
        int infantaria;
        int divisao;
        int tropas;
        boolean verificacao = false;
        while (options != "QUIT") {

            options = scanner.nextLine().toUpperCase();
            Command command = Command.valueOf(options);
            switch (command) {

                case ARMY:
                    while (verificacao == false) {
                        System.out.println("Crie um exercito com um limite de 100 tropas");
                        System.out.println("Indique o numero de catapultas");
                        catapultas = scanner.nextInt();
                        // player.setnCatapultas(scanner.nextInt());

                        System.out.println("Indique o numero de cavalaria");
                        cavalaria = scanner.nextInt();

                        System.out.println("Indique o numero de infantaria");
                        infantaria = scanner.nextInt();

                        tropas = catapultas + cavalaria + infantaria;
                        if (tropas > 100) {
                            System.out.println("O teu exercito excede o limite de 100 tropas");
                        } else {
                            System.out.println("Indique a percentagem de divisao de tropas para ataque e defesa");
                            divisao = scanner.nextInt();
                            Catapult catapult = new Catapult((catapultas * divisao) / 100, catapultas - (catapultas * divisao) / 100);
                            Cavalry cavalry = new Cavalry((cavalaria * divisao) / 100, cavalaria - (cavalaria * divisao) / 100);
                            Infantry infantry = new Infantry((infantaria * divisao) / 100, infantaria - (infantaria * divisao) / 100);
                            player.add(catapult);
                            player.add(cavalry);
                            player.add(infantry);

                            verificacao = true;
                            System.out.println("Exercito feito com sucesso");

                        }

                    }
                    options = scanner.nextLine().toUpperCase();
                    break;
                case INSPECT:
                     
                    break;
                case PLAY:
                      int totalAttack=0;
                               int totalDefense=0;
                    for (FightingForce army : player.getArmy()) {
                        System.out.println(army.getClass());
                        System.out.println("Ataque: " + army.getAttackPower());
                        System.out.println("Defesa: " + army.getDefensePower());
                        totalAttack += army.getAttackPower();
                        totalDefense +=  army.getDefensePower();
                    }
                    System.out.println("Total  Attack: "+totalAttack);
                     System.out.println("Total  Defense: "+totalDefense);
                    options = scanner.nextLine().toUpperCase();
                    break;
                case QUIT:
                    // message = "Switch-Case: Highest score is 99999";
                    break;
                default:
                    System.out.println("Comando invalido");

            }
        }
    }
}
