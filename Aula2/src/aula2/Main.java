/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

import java.util.Arrays;

/**
 *
 * @author Turma A
 */
public class Main {
    public static void main(String[] args){
        int numeros[] = {10,20,1,30,2,10};
        
        //Ex1
        int ex1 = Aula2.powerOf(2, 10);
        System.out.println(ex1);
        
        //Ex2
        int ex2 = Aula2.sumOfNaturalNumbersUpTo(3);
        System.out.println(ex2);
        
        //Ex3
        int ex3 = Aula2.sumOfNaturalNumbersBetween(2, 5);
        System.out.println(ex3);
        
        //Ex4
        int ex4 = Aula2.sumOfEvenNumbersBetween(1, 10);
        System.out.println(ex4);
        
        //Ex5
        int ex5 = Aula2.numberOfDivisorsOf(10);
        System.out.println(ex5);
        
        //Ex6
        Aula2.isPrime(4);
        
        //Ex7
        String ex7 = Aula2.toString(numeros);
        System.out.println(ex7);
        
        //Ex8
        int ex8 = Aula2.maximumOf(numeros);
        System.out.println(ex8);
        
        //Ex9
        int ex9 = Aula2.minimumOf(numeros);
        System.out.println(ex9);
        
        //Ex10
        int[] ex10 = Aula2.copyOf(numeros);
        System.out.println(Arrays.toString(ex10));
        
        //Ex11
        boolean ex11 = Aula2.contains(numeros, 20);
        System.out.println(ex11);
        
        //Ex12
        boolean ex12 = Aula2.containsDuplicates(numeros);
        System.out.println(ex12);
        
        //Ex13
        int ex13 = Aula2.indexOf(numeros, 2);
        System.out.println(ex13);
        
        //Ex14
        int[] ex14 = Aula2.add(numeros, 414);
        System.out.println(Arrays.toString(ex14));
        
        //Ex15
        int[] ex15= Aula2.remove(numeros,10);
        System.out.println(Arrays.toString(ex15));
    }
}
