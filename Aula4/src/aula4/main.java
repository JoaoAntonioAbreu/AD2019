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

        final int[][] matrix = {
            {15, 18,20},
            {18, 10, 15},
            {11, 13,20}
        };
        final int[][] identity= {
            {1,0,0},
            {0,1,0},
            {0,0,1}
        };
        String a = "+";
       Aula4.show(matrix);
       System.out.println(" ");
       boolean exB = Aula4.isMatrix(matrix);
       System.out.println(exB);
       boolean exC = Aula4.isIdentity(identity);
       System.out.println(exC);
       Aula4.multiplyBy(matrix, 3);
       System.out.println("");
       boolean exE = Aula4.areCompatibleforSum(matrix, identity);
       System.out.println(exE);
       Aula4.sumOf(matrix, matrix);
        System.out.println("");
       Aula4.drawElement(a);
       Aula4.drawNewLine();
       Aula4.drawHorizontalSegmentWith(a,5);
       Aula4.drawNewLine();
       Aula4.drawFilledRectangleWith(a, 7, 5);
       Aula4.drawNewLine();
       Aula4.drawEmptyRectangleWith(a, 7, 5);
    }

}
