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
public class Aula3 {

    //Ex1
    public static char lowerLetterSuccessorOf(char letra) {
        char successor = letra;
        if (letra == 'z') {
            successor = 'a';
        } else {
            successor++;
        }
        return successor;
    }

    //Ex2
    public static char lowerLetterPredecessorOf(char letra) {
        char predecessor = letra;
        if (letra == 'a') {
            predecessor = 'z';
        } else {
            predecessor--;
        }
        return predecessor;
    }

    //Ex3
    public static int lowerLetterSuccessorStepsOf(char letra, int num) {
        char teste = letra;
        for (int i = 0; i < num; i++) {
            if (teste == 'z') {
                teste = 'a';

            } else {
                teste++;
            }

        }
        final int letrateste = teste;
        return letrateste;
    }

    //Ex4
    public static int lowerLetterPredecessorStepsOf(char letra, int num) {
        char teste = letra;
        for (int i = 0; i < num; i++) {
            if (teste == 'a') {
                teste = 'z';
            } else {
                teste--;
            }
        }
        final int letrateste = teste;
        return letrateste;
    }

    //Ex5
    public static int occurrencesOfCharacterIn(char[] letras, char letra) {
        int dups = 0;
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == letra) {
                dups++;
            }
        }
        return dups;
    }

    //Ex6
    public static char[] replaceCharacterIn(char[] letras, char letra) {
        char[] replace = new char[letras.length];
        for (int i = 0; i < letras.length; i++) {
            replace[i] = letras[i];
            if (replace[i] == letra) {
                replace[i]++;
            }
        }
        return replace;
    }

    //Ex7
    public static char[] concatenationOf(char[] letras1, char[] letras2) {
        char[] letrasfinal = new char[letras1.length + letras2.length];
        int teste = 0;
        for (int i = 0; i < letras1.length; i++) {
            letrasfinal[i] = letras1[i];
        }
        for (int i = letras1.length; i < letrasfinal.length; i++) {
            letrasfinal[i] = letras2[teste++];
        }
        return letrasfinal;
    }

    //Ex8
    public static char[] copyOfPartOf(char[] letras, int a, int b) {
        int parte = b - a + 1;
        int teste = 0;
        char[] copia = new char[parte];
        for (int i = a; i <= b; i++) {
            copia[teste++] = letras[i];
        }
        return copia;
    }

    //Ex9
    public static char[] cipher(char[] letras, int num) {
        //char[] cipher = new char[letras.length];
        int j = 0;
        for (int i = 0; i < letras.length; i++) {
           // cipher[i] = letras[i];
            while (j != num) {
                if (letras[i] == 'z') {
                    letras[i] = 'a';
                } else {
                    letras[i]++;
                    
                }
                j++;
            }
            j = 0;
        }
        return letras;
    }

    //Ex9
    public static char[] decipher(char[] letras, int num) {
        //char[] decipher = new char[letras.length];
        int j = 0;
        for (int i = 0; i < letras.length; i++) {
            //decipher[i] = letras[i];int j = 0;

            while (j != num) {
                if (letras[i] == 'a') {
                    letras[i] = 'z';
                } else {
                    letras[i]--;
                    
                }
                j++;
            }
            j = 0;
        }
        return letras;
    }
}
