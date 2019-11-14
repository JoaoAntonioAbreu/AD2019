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
public class Catapult extends FightingForce{
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
            AttackPower+= super.getAttack();
        }
        return AttackPower;
       
    }

    @Override
    public int getDefensePower() {
       int DefensePower = 0;
        for (int i = 0; i < nCataputsDefense; i++) {
            DefensePower+= super.getDefense();
        }
        return DefensePower;
    }
   
    

    
    
    
        
           
}
