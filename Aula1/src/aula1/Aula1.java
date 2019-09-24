/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

/**
 *
 * @author Turma A
 */
public class Aula1 {

    /**
     * @param args the command line arguments
     */
    public static void Helloworld() {
        System.out.println("Hello, World");
    }   

    
    public static void CalcularPerimetro(int L, int C){
         int perimetro = 2*(L + C);
          System.out.println("O perimetro e: "+perimetro);
    }
    
    public static void CalcularVolume(int L, int C, int A) {
        int volume = C*L*A;
        System.out.println("O volume e: "+volume);
    }
    
    public static void CalcularCelsius(int F) {
       float celsius = (F-32)*5/9;
       System.out.println(F+" Fahrenheit equivale a "+ celsius+" celsius");
    }
    
    public static void Tempo(String t1, String t2){
        String[] temp1 = t1.split(t1,':');
        String[] temp2 = t2.split(t2,':');
        int[] tempf = new int[3];
        for (int i = 0; i < temp1.length; i++) {
            tempf[i] = Integer.parseInt(temp1[i])-Integer.parseInt(temp2[i]);
            System.out.println(tempf[i]);
        }
    }
}


