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
public class Main {
    public static void main(String[] args){
        int ex1 = Aula2.powerOf(2, 10);
        System.out.println(ex1);
        int ex2 = Aula2.sumOfNaturalNumbersUpTo(3);
        System.out.println(ex2);
        int ex3 = Aula2.sumOfNaturalNumbersBetween(2, 5);
        System.out.println(ex3);
        int ex4 = Aula2.sumOfEvenNumbersBetween(1, 10);
        System.out.println(ex4);
        int ex5 = Aula2.numberOfDivisorsOf(10);
        System.out.println(ex5);
        Aula2.isPrime(4);
    }
}
