package trabalho_grupo;

import java.util.Scanner;

public class Game {

    public enum Command {
        ARMY,INSPECT,PLAY,QUIT;
    }

    public static void optionSwitch(String com) {
        Command command = Command.valueOf(com);
        Scanner scanner = new Scanner(System.in);
        
        Army player = new Army();

        int catapultas;
        int cavalaria;
        int infantaria;
        int divisao;
        int tropas;
        boolean verificacao = false;
        
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
                                                           
                        verificacao=true;
                        System.out.println("Exercito feito com sucesso");
                        System.out.println(player.getArmy().size());
                    }                                   
                }

                break;
            case INSPECT:
                System.out.println("caralho");
                System.out.println(player.getArmy().size());
                for (FightingForce fightingforce : player.getArmy()) {
                            System.out.println(fightingforce.getClass());
                            System.out.println("Ataque: "+ fightingforce.getAttackPower());
                            System.out.println("Defesa: "+fightingforce.getDefensePower());
                            
                        }
               
                break;
            case PLAY:
                // message = "Switch-Case: Loading Save";
                break;
            case QUIT:
                // message = "Switch-Case: Highest score is 99999";
                break;
             default:
                 System.out.println("Comando invalido");
        }
       
    }
}
