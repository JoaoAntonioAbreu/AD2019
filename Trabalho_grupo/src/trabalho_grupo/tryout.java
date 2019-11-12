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
public class tryout {

    double uniMax = 0.0;
    double nCatapultas = 0.0;
    double nCavalaria = 0.0;
    double nInfantaria= 0.0;
    public double getUniMax() {
        return uniMax;
    }

    public void setUniMax(double uniMax) {
        this.uniMax = uniMax;
    }

    public void setnCatapultas() {
        this.nCatapultas = Math.round(Math.random() * ((this.uniMax - 1) + 1));
        this.uniMax= this.uniMax-this.nCatapultas;
    }

    public double getnCatapultas() {
        return nCatapultas;
    }

    public void setnCavalaria() {
        this.nCavalaria =Math.round(Math.random() * ((this.uniMax - 1) + 1));
        this.uniMax= this.uniMax-this.nCavalaria;
    }

    public double getnCavalaria() {
        return nCavalaria;
    }

    public void setnInfantaria() {
        this.nInfantaria = this.uniMax;
    }

    public double getnInfantaria() {
        return nInfantaria;
    }
    public double verificacao(){
        double total = getnCatapultas()+getnCavalaria()+getnInfantaria();
        return total;
    }


        public double ataqueCatapultas() {
            double totalACatapultas = 0.0;
            int nO = 0;
            for (double i = 0.0; i < getnCatapultas(); i++) {
                double x = 100.0* Math.round((Math.random() * ((1 - 0))));
                if(x==0){
                   nO++;
                }
                 totalACatapultas +=x; 
            }
            System.out.println("fugiram "+nO+" catapultas");
            return totalACatapultas;
        }

        public  double ataqueCavalaria() {
             double totalACavalaria = 0.0;
            for (double i = 0.0; i < getnCavalaria(); i++) {
                double x = Math.round(Math.random() * ((50 - 1) + 1));
                 totalACavalaria +=x; 
            }
            return totalACavalaria;
        }

        public  double ataqueInfataria() {
            double totalAInfantaria = 0.0;
          
            for (double i = 0.0; i < getnInfantaria(); i++) {
                double x = Math.round(Math.random() * ((25 - 1) + 1))*Math.round(Math.random()*(1.0-0.0));
                
                 totalAInfantaria +=x; 
            }
            return  totalAInfantaria;
        }
        
        public double defesaCatapulta(){
             return getnCatapultas();
        }
        public  double defesaCavalaria() {
             double totalDCavalaria = 0.0;
            for (double i = 0.0; i < getnCavalaria(); i++) {
                double x = Math.round(Math.random() * ((50 - 1) + 1));
                 totalDCavalaria +=x; 
            }
            return totalDCavalaria;
        }

        public  double defesaInfataria() {
            double totalDInfantaria = 0.0;
            for (double i = 0.0; i < getnInfantaria(); i++) {
                double x = Math.round(Math.random() * ((75 - 1) + 1));
                 totalDInfantaria +=x; 
            }
            return  totalDInfantaria;
        }
    
        public double totalAtaque(){
            double totalA = ataqueCatapultas()+ataqueCavalaria()+ataqueInfataria();
            return totalA;
        }
        public double totalDefesa(){
            double totalD = defesaCatapulta()+defesaCavalaria()+defesaInfataria();
            return totalD;
        }
}
