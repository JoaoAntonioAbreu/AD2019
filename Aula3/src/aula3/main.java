/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

/**
 *
 * @author Turma A
 */
public class main {
    public static void main(String[] args){
         char letras[] = {'z','b','a','b','a','c'};
         char letras2[] = {'z','z','x','c'};
        //Ex1
        char ex1 = Aula3.lowerLetterSuccessorOf('b');
        System.out.println(ex1);
        
        //Ex2
        char ex2 = Aula3.lowerLetterPredecessorOf('v');
        System.out.println(ex2);
        
        //Ex3
        int ex3 = Aula3.lowerLetterSuccessorStepsOf('z', 2);
        System.out.println(Character.toChars(ex3));
        
        //Ex4
        int ex4 = Aula3.lowerLetterPredecessorStepsOf('c',2);
        System.out.println(Character.toChars(ex4));
        
        //Ex5
        int ex5 = Aula3.occurrencesOfCharacterIn(letras, 'a');
        System.out.println(ex5);
        
        
        //Ex6
        char[] ex6 = Aula3.replaceCharacterIn(letras, 'a');
        System.out.println(ex6);
        
        
        //Ex7
        char [] ex7 = Aula3.concatenationOf(letras, letras2);
        System.out.println(ex7);
        
        //Ex8
        char[] ex8 = Aula3.copyOfPartOf(letras, 2, 5);
        System.out.println(ex8);
        
        char[] c = "teste".toCharArray();
        
        //Ex9
        char[] ex9 = Aula3.cipher(c, 2);
        System.out.println(ex9);
        
        //Ex9
        char[] ex10 = Aula3.decipher(c, 2);
        System.out.println(ex10);
     }
}
