/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

/**
 *
 * @author Turma A
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int[] studentNumbers = {20032, 3012, 25342, 31432};
        final String[] courseAcronyms = {"AD", "WEB-FE", "WEB-BE"};
        final int[][] studentGrade = {
            {15, 18, 17},
            {18, 10, 11},
            {11, 13, 15},
            {10, 19, 16}
        };
        
        
        for (int i = 0; i < studentGrade.length; i++) {
            System.out.println("O aluno " + studentNumbers[i]);
            for (int j = 0; j < courseAcronyms.length; j++) {
                System.out.println("   -->" + courseAcronyms[j] + ": " + studentGrade[i][j]);
                
            }
        }
        
        
    }

}
