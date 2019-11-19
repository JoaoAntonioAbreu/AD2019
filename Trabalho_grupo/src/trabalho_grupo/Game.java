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
        Army pc = new Army();
        int unimax = 100;
        int catapultas;
        int x = 0;
        int cavalaria;
        int infantaria;
        int divisao;
        int tropas;
        int damage = 0;
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

                    divisao = (int) (Math.random() * ((100 - 1) + 1));
                    catapultas = (int) (Math.random() * ((unimax - 1) + 1));
                    unimax = unimax - catapultas;
                    cavalaria = (int) (Math.random() * ((unimax - 1) + 1));
                    unimax = unimax - cavalaria;
                    infantaria = unimax;

                    Catapult pcCat = new Catapult((catapultas * divisao) / 100, catapultas - (catapultas * divisao) / 100);
                    Cavalry pcCav = new Cavalry((cavalaria * divisao) / 100, cavalaria - (cavalaria * divisao) / 100);
                    Infantry pcInf = new Infantry((infantaria * divisao) / 100, infantaria - (infantaria * divisao) / 100);
                    pc.add(pcCat);
                    pc.add(pcCav);
                    pc.add(pcInf);
                    options = scanner.nextLine().toUpperCase();
                    break;
                case INSPECT:
                    System.out.println("Player's Army:");
                    for (FightingForce army : player.getArmy()) {
                        System.out.println("Player: " + army.getClass().getName().replace("trabalho_grupo.", ""));
                        System.out.println("Attack: " + army.getAttackPower());
                        System.out.println("Defense: " + army.getDefensePower());
                    }
                    System.out.println("Computer's Army:");
                    for (FightingForce army : pc.getArmy()) {
                        System.out.println("Computer: " + army.getClass().getName().replace("trabalho_grupo.", ""));
                        System.out.println("Attack: " + army.getAttackPower());
                        System.out.println("Defense: " + army.getDefensePower());
                    }

                    break;
                case PLAY:
                    int defenseleft=0;
                    int playerAttack = 0;
                    int playerDefense = 0;
                    int pcAttack = 0;
                    int pcDefense = 0;
                    boolean dead = false;
                    for (FightingForce army : player.getArmy()) {
                        playerAttack += army.getAttackPower();
                        playerDefense += army.getDefensePower();
                    }
                    System.out.println("Player: Total  Attack: " + playerAttack + " ,Total Defense: " + playerDefense);
                    for (FightingForce pcarmy : pc.getArmy()) {
                        pcAttack += pcarmy.getAttackPower();
                        pcDefense += pcarmy.getDefensePower();
                    }
                    System.out.println("Computers: Total  Attack: " + pcAttack + " ,Total Defense: " + pcDefense);

                    System.out.println("The first attacker will be picked at random");
                    int firstAttacker = 1;//(int) (Math.random() * ((1 - 0) + 1));
                    if (firstAttacker == 1) {
                        while(dead!=true){
                        System.out.println("You will attack first");
                        System.out.println("Since every units on attack has a 50% to do a sucessfull attack: ");
                        for (FightingForce army : player.getArmy()) {
                            damage = damage + army.onAttack();
                        }
                        System.out.println("You dealt " + damage + " points of damage");

                        for (FightingForce pcarmy : pc.getArmy()) {
                            if (damage > 100) {
                                System.out.print("The Computer ");
                                x = pcarmy.onDefense(damage);
                            }

                            damage = x;

                        }
                        
                                
                         for (FightingForce pcarmy : pc.getArmy()) {
                                defenseleft += pcarmy.getDefensePower();
                            }
                        System.out.println("The computer was left with : " + defenseleft + " defense points");
                        if(defenseleft==0){
                            System.out.println("The computer died, you WIN!!");
                            dead=true;
                        }
                        }
                    } else {
                        System.out.println("The computer will attack first");
                    }

                    
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
