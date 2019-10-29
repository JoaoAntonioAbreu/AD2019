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
public class Aula4 {

    public static void show(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    public static boolean isMatrix(int[][] matrix) {
        boolean x = true;
        int y = matrix[0].length;
        for (int i = 0; i < matrix.length; i++) {
            if (y != matrix[i].length) {
                x = false;
            }

        }
        return x;
    }

    public static boolean isIdentity(int[][] matrix) {
        boolean x = true;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j == i && matrix[i][j] != 1) {
                    x = false;
                } else if (j != i && matrix[i][j] != 0) {
                    x = false;
                }
            }
        }
        return x;
    }

    public static void multiplyBy(int[][] matrix, int m) {
        int x = 0;
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < matrix.length; j++) {
                x = matrix[i][j] * m;
                System.out.print(x+" ");

            }
        }
    }
    
    
    public static boolean areCompatibleforSum(int[][]matrix1, int[][]matrix2){
        boolean x = true;
        if(matrix1.length == matrix2.length){
            for(int i = 0;i< matrix1.length;i++){
                if(matrix1[i].length != matrix2[i].length){
                    x=false;
                }
            }
        }else{
            x=false;
        }
        return x;
    }
    
    public static void sumOf(int[][]matrix1,int[][]matrix2){
        int x = 0;
        if(areCompatibleforSum(matrix1,matrix2)==true){
            for(int i = 0; i< matrix1.length;i++){
                System.out.println("");
                for( int j = 0; j < matrix1.length;j++){
                    x = matrix1[i][j]+matrix2[i][j];
                    System.out.print(x+" ");
                }
            }
        }
    }
    
    
    public static void drawElement(String a){
        System.out.print(a);
    }
    public static void drawNewLine(){
        System.out.println("");
    }
    public static void drawHorizontalSegmentWith(String a, int L){
        for(int i=0;i<=L;i++){
            drawElement(a);
        }
    }
    
    public static void drawFilledRectangleWith(String a, int L, int A){
        for(int i=0;i<=A;i++){
            drawNewLine();
            drawHorizontalSegmentWith(a,L);
        }
    }
    
    public static void drawEmptyRectangleWith( String a, int L, int A){
        drawNewLine();
        drawHorizontalSegmentWith(a,L);
        drawNewLine();
       for(int i=0;i<A;i++){
           drawElement(a);
           for(int j=1;j<=L;j++){
               if(j==L){  
               drawElement(a);
               }else{
                   System.out.print("");
               }
           }
          drawNewLine();
       }
       drawHorizontalSegmentWith(a,L);
    }
}
