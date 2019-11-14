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
public class Infantry extends FightingForce {

    private int nInfantryAttack;
    private int nInfantryDefense;

    public Infantry(int nInfantryAttack, int nInfantryDefense) {
        super(25, 75);
        this.nInfantryAttack = nInfantryAttack;
        this.nInfantryDefense = nInfantryDefense;
    }

    @Override
    public int getAttackPower() {
        int AttackPower = 0;
        for (int i = 0; i < nInfantryAttack; i++) {
            AttackPower += super.getAttack();
        }
        return AttackPower;
    }

    @Override
    public int getDefensePower() {
        int DefensePower = 0;
        for (int i = 0; i < nInfantryDefense; i++) {
            DefensePower += super.getDefense();
        }
        return DefensePower;
    }

}
