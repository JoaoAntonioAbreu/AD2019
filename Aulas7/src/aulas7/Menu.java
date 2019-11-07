/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas7;

/**
 *
 * @author Turma A
 */
public class Menu {

    public enum Command {
        START,SAVE_GAME,LOAD_GAME,HIGH_SCORE,QUIT;
    }

    public static String optionIf(String com) {
        Command command = Command.valueOf(com);
        String message = "";
        if (command==Command.START) {
            message = "If-Else: Starting the game!";
        } else if (command==Command.SAVE_GAME) {
            message = "If-Else: Successfull save";
        } else if (command==Command.LOAD_GAME) {
            message = "If-Else: Loading Save";
        } else if (command==Command.HIGH_SCORE) {
            message = "If-Else: Highest score is 99999";
        } else if (command==Command.QUIT) {
            message = "If-Else: Quitting the game";
        } else {
            message = "If-Else: Error, not a command!!!";
        }
        return message;
    }

    public static String optionSwitch(String com) {
        Command command = Command.valueOf(com);
        String message = "";
        switch (command) {
            case START:
                message = "Switch-Case: Starting the game!";
                break;
            case SAVE_GAME:
                message = "Switch-Case: Successfull save";
                break;
            case LOAD_GAME:
                message = "Switch-Case: Loading Save";
                break;
            case HIGH_SCORE:
                message = "Switch-Case: Highest score is 99999";
                break;
            case QUIT:
                message = "Switch-Case: Quitting the game";
                break;
        }
        return message;
    }
}
