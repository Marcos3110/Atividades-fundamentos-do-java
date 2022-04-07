/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicaçao_matriz;

import java.util.Scanner;

public class Multiplicaçao_matriz {
    public static void main(String[] args) {
           Scanner s = new Scanner(System.in);

           //System.out.println("qtd. linhas de A:");
           int iLinhaA  = s.nextInt();
           
           //System.out.println("qtd. colunas de A:");
           int iColunaA = s.nextInt();

           int aMatrizA[][] = new int[iLinhaA][iColunaA];

           s.nextLine();
           s.useDelimiter(";");

           for (int i = 0; i < iLinhaA; i++) {
                for (int j = 0; j < iColunaA; j++) {
                   aMatrizA[i][j] = s.nextInt();
                }
                s.nextLine();
           }

           s.useDelimiter("\n");

           //System.out.println("<qtd. linhas de B");
           int iLinhaB = s.nextInt();
           //System.out.println("qtd. colunas de B");
           int iColunaB = s.nextInt();

           if (iLinhaA != iColunaB) {
                System.out.println("Impossível multiplicar");
           } else {
                int aMatrizB[][] = new int[iLinhaB][iColunaB];
                int aMatrizC[][] = new int[iLinhaA][iColunaB];

               s.nextLine();
               s.useDelimiter(";");

               for (int i = 0; i < iLinhaB; i++) {
                   for (int j = 0; j < iColunaB; j++) {
                        aMatrizB[i][j] = s.nextInt();
                   }
                   s.nextLine();
               }
               
               for (int i = 0; i < iLinhaA; i++) {
                   for (int j = 0; j < iColunaB; j++) {
                       for (int x = 0; x < iLinhaB; x++) {
                            aMatrizC[i][j] = aMatrizC[i][j] + aMatrizA[i][x] * aMatrizB[x][j];
                       }
                   }
               }
               
               for (int i = 0; i < aMatrizC.length; i++) {
                   System.out.println();
                   for (int j = 0; j < aMatrizC.length; j++) {
                        System.out.print(aMatrizC[i][j]);
                        System.out.print(";");
               }}
           }

       }
    
}
