package trabalho_grupo;

import java.util.Scanner;

public class Game {

    public enum Command {
        ARMY, INSPECT_ARMY, PLAY, QUIT;
    }

    public static void optionSwitch(String com) {
        Command command = Command.valueOf(com);
        Scanner scanner = new Scanner(System.in);
        String message = "";
 
        Army player = new FightingForce();
        switch (command) {
            case ARMY:
                System.out.println("Crie um exercito com um limite de 100 tropas");
                System.out.println("Indique o numero de catapultas");
                player.setnCatapultas(scanner.nextInt());

                System.out.println("Indique o numero de cavalaria");
                player.setnCavalaria(scanner.nextInt());

                System.out.println("Indique o numero de infantaria");
                player.setnInfantaria(scanner.nextInt());

                System.out.println("Indique a percentagem de divisao de tropas para ataque e defesa");
                player.setPercentagem(scanner.nextInt());

               

                break;
            case INSPECT_ARMY:
                message = "Switch-Case: Successfull save";
                break;
            case PLAY:
                message = "Switch-Case: Loading Save";
                break;
            case QUIT:
                message = "Switch-Case: Highest score is 99999";
                break;
        }

    }
}
