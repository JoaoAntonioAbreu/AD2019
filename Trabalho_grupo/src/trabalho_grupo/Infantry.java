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

    @Override
    public int onDefense(int damage) {
        int lost = 0;
        int total = damage;
        for (int i = 0; i < nInfantryDefense;) {
            if (total >= super.getDefense()) {
                total = total - super.getDefense();
                lost++;
            }
            i++;
        }
        if (lost >= 1) {
            this.nInfantryDefense -= lost;
            System.out.println("Lost: " + lost + " infantry");
        }
        return total;
    }

    @Override
    public int onAttack() {
        int AttackPower = 0;
        int damage;
        int lost = 0;

        for (int i = 0; i < nInfantryAttack; i++) {
            damage = (int) (super.getAttack() * Math.round((Math.random() * ((1 - 0)))));
            if (damage == 0) {
                lost++;
            } else {
                AttackPower += damage;
            }

        }
        if (lost >= 1) {
            System.out.println(lost + " infantaria juntaram-se a revolução dos cravos");
        }
        return AttackPower;
    }

}
