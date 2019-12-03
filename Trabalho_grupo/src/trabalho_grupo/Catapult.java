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
public class Catapult extends FightingForce {

    private int nCatapultsAttack;
    private int nCataputsDefense;

    public Catapult(int nCatapultsAttack, int nCataputsDefense) {
        super(100, 1);
        this.nCatapultsAttack = nCatapultsAttack;
        this.nCataputsDefense = nCataputsDefense;
    }

    @Override
    public int getAttackPower() {
        int AttackPower = 0;
        for (int i = 0; i < nCatapultsAttack; i++) {
            AttackPower += super.getAttack();
        }
        return AttackPower;

    }

   

    @Override
    public int onDefense(int damage) {
        int lost = 0;
        int total = damage;
        for (int i = 0; i < nCataputsDefense;) {
            if (total >= super.getDefense()) {
                total = total - super.getDefense();
                lost++;
            }
            i++;
        }
        if (lost >= 1) {
            this.nCataputsDefense = nCataputsDefense - lost;
            System.out.println("Lost: " + lost + " catapults");
        }
        
        return total;
    }

    @Override
    public int onAttack() {
        int AttackPower = 0;
        int damage;
        int lost = 0;
        for (int i = 0; i < nCatapultsAttack; i++) {
            damage = (int) (super.getAttack() * Math.round((Math.random() * ((1 - 0)))));
            if (damage == 0) {
                lost++;
            } else {
                AttackPower += damage;
            }

        }
        if (lost >= 1) {
            System.out.println(lost + " catapultas juntaram-se a revolução dos cravos");
        }
        return AttackPower;
    }

     @Override
    public int getDefensePower() {
        int DefensePower = 0;
        for (int i = 0; i < nCataputsDefense; i++) {
            DefensePower += super.getDefense();
        }
        return DefensePower;
    }
}
