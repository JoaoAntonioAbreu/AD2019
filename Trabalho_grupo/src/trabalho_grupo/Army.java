/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_grupo;

import java.util.ArrayList;

/**
 *
 * @author Turma A
 */
public class Army {

    public ArrayList<FightingForce> army;
    public ArrayList<FightingForce> pcarmy;

    public Army() {
        army = new ArrayList<FightingForce>();
    }

    public ArrayList<FightingForce> getArmy() {
        return army;
    }

    public void add(FightingForce unit) {
        this.army.add(unit);
    }

}
