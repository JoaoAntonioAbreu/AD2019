/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author Turma A
 */
public class Aula2 {

    /**
     * @param args the command line arguments
     */
    public static int powerOf (int a, int b){
        int resultado=1;
        for(int i=0;i<b;i++){
            resultado = resultado*a;
        }
      return resultado; 
    }
    
    public static int sumOfNaturalNumbersUpTo (int n){
        int resultado = 0;
        for(int i = 0; i<=n;i++){
            resultado = resultado + i;
        }
        return resultado;
    }
    
    public static int sumOfNaturalNumbersBetween(int n1, int n2){
        int resultado = 0;
        for(int i = n1; i<=n2;i++){
            resultado = resultado + i;
            
        }
        return resultado;
    }
    
    public static int sumOfEvenNumbersBetween(int n1, int n2){
        int resultado = 0;
        for (int i = n1;i<=n2;i++){
            if (i%2==0){
                resultado = resultado + i;
            }
        }
        return resultado;
    }
    
    public static int  numberOfDivisorsOf(int n1){
        int resultado = 0;
        for(int i = 1; i<=n1;i++){
            if(n1%i==0){
                resultado++;
            }
        }
        return resultado;
    }
    
    public static void isPrime(int n1){
        int resultado = 0;
        for (int i=1;i<=n1;i++){
            if(n1%i==0){
                resultado++;
            }
        }if(resultado ==2){
            System.out.println("Number is prime");}
        else {
            System.out.println("Number isnt prime");
        }
    } 
}

