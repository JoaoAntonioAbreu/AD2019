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
    
    //Ex1
    public static int powerOf(int a, int b) {
        int resultado = 1;
        for (int i = 0; i < b; i++) {
            resultado = resultado * a;
        }
        return resultado;
    }
    
    //Ex2
    public static int sumOfNaturalNumbersUpTo(int n) {
        int resultado = 0;
        for (int i = 0; i <= n; i++) {
            resultado = resultado + i;
        }
        return resultado;
    }
    
    //Ex3
    public static int sumOfNaturalNumbersBetween(int n1, int n2) {
        int resultado = 0;
        for (int i = n1; i <= n2; i++) {
            resultado = resultado + i;

        }
        return resultado;
    }

    //Ex4
    public static int sumOfEvenNumbersBetween(int n1, int n2) {
        int resultado = 0;
        for (int i = n1; i <= n2; i++) {
            if (i % 2 == 0) {
                resultado = resultado + i;
            }
        }
        return resultado;
    }

    //Ex5
    public static int numberOfDivisorsOf(int n1) {
        int resultado = 0;
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0) {
                resultado++;
            }
        }
        return resultado;
    }

    //Ex6
    public static void isPrime(int n1) {
        int resultado = 0;
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0) {
                resultado++;
            }
        }
        if (resultado == 2) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number isnt prime");
        }
    }
    
    //Ex7
    public static String toString(int[] numeros) {
        String resultado = "";
        for (int i = 0; i < numeros.length; i++) {
            resultado += numeros[i] + ",";
        }
        return resultado;
    }

    //Ex8
    public static int maximumOf(int[] numeros) {
        int max = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        return max;
    }

    //Ex9
    public static int minimumOf(int[] numeros) {
        int min = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        return min;
    }

    //Ex10
    public static int[] copyOf(int[] numeros) {
        int[] copy = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            copy[i] = numeros[i];
        }
        return copy;
    }
    //Ex11
    public static boolean contains(int[] numeros, int n) {
        boolean exist = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == n) {
                exist = true;
            }
        }
        return exist;
    }
    //Ex12
    public static boolean containsDuplicates(int[] numeros) {
        boolean exist = false;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    exist = true;
                }
            }
        }
        return exist;
    }
    //Ex13
    public static int indexOf(int[] numeros, int n) {
        int index = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (n == numeros[i]) {
                index = i;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }
    
    //Ex14
    public static int[] add(int[] numeros, int n) {
        int[] novo = new int[numeros.length + 1];
        for (int i = 0; i < numeros.length; i++) {
            novo[i] = numeros[i];
        }
        novo[numeros.length] = n;

        return novo;
    }

    //Ex15
    public static int[] remove(int[] numeros, int n) {
        int quantos = 0;
        int pos = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == n) {
                quantos++;
            }
        }
        int[] novo = new int[numeros.length - quantos];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] != n) {
                novo[pos++] = numeros[i];
                //pos++;
            }
        }
        return novo;
    }
}
