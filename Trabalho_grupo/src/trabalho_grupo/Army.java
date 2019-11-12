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

    private int nCatapultas;
    private int nCavalaria;
    private int nInfantaria;
    private int percentagem;
    
    
 
    public int getPercentagem() {
        return percentagem;
    }

    public int getnCatapultas() {
        return nCatapultas;
    }

    public int getnCavalaria() {
        return nCavalaria;
    }

    public int getnInfantaria() {
        return nInfantaria;
    }

    public void setnCatapultas(int nCatapultas) {
        this.nCatapultas = nCatapultas;
    }

    public void setnCavalaria(int nCavalaria) {
        this.nCavalaria = nCavalaria;
    }

    public void setnInfantaria(int nInfantaria) {
        this.nInfantaria = nInfantaria;
    }

    public void setPercentagem(int percentagem) {
        this.percentagem = percentagem;
    }
 
    @Override
    public String toString() {
        return "catapultas: "+ nCatapultas +" cavalaria: "+ nCavalaria + " infantaria : "+nInfantaria +" divisao de "+percentagem+"%"; //To change body of generated methods, choose Tools | Templates.
    }

    
    
  
    
}
