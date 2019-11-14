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
public class Cavalry extends FightingForce {

    private int nCavalryAttack;
    private int nCavalryDefense;

    public Cavalry(int nCavalryAttack, int nCavalryDefense) {
        super(50, 50);
        this.nCavalryAttack = nCavalryAttack;
        this.nCavalryDefense = nCavalryDefense;
    }

    @Override
    public int getAttackPower() {
        int AttackPower = 0;
        for (int i = 0; i < nCavalryAttack; i++) {
            AttackPower += super.getAttack();
        }
        return AttackPower;
    }

    @Override
    public int getDefensePower() {
        int DefensePower = 0;
        for (int i = 0; i < nCavalryDefense; i++) {
            DefensePower += super.getDefense();
        }
        return DefensePower;
    }

}
