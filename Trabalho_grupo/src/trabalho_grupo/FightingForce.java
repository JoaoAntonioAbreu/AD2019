/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_grupo;


/**
 *
 * @author Turma A
 */
public abstract class FightingForce{

    private int attack;
    private int defense;

 

    public FightingForce(int attack, int defense) {
        this.attack = attack;
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    
 
    public abstract int getAttackPower();

    public abstract int getDefensePower();

}
