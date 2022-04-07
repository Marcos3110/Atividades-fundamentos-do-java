/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticaodadosdemograficos;

import java.util.Scanner;


public class RepeticaoDadosDemograficos {

 
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
           int qtdEntrevistados = 0;
           long somaIdades = 0;
           int menorIdade = 999;
           String nomeMenorIdade = "";
           int qtd18e20 = 0;
           int qtdSexoF = 0;
           int qtdNasceuIbirama = 0;
           
           String nome = scan.next();
        while (!nome.equals("fim")) {
            int idade = scan.nextInt();
            String sexo = scan.next();
            String cidade = scan.next();
            
            somaIdades = somaIdades + idade;
            qtdEntrevistados++;
            
            if (idade < menorIdade) {
                menorIdade = idade;
                nomeMenorIdade = nome;
            }
            if (idade >= 18 && idade <= 20) {
                qtd18e20++;
            }
            
            if (sexo.equals("F")) {
                qtdSexoF++;
            }
            
            if (cidade.equals("Ibirama")) {
                qtdNasceuIbirama++;
            }
            
            nome = scan.next();
        }
        double mediaIdades = somaIdades / (double) qtdEntrevistados;
        
        double percentualSexoF = 100 * qtdSexoF / (double) qtdEntrevistados;
        
        System.out.println("Menor idade: " + nomeMenorIdade);
        System.out.println("Quantidade 18-20: " + qtd18e20);
        System.out.println("Média idade: " + String.format("%.2f", mediaIdades));
        System.out.println("Percentual feminino: " + String.format("%.2f",percentualSexoF));
        System.out.println("Nascidos em Ibirama: " + qtdNasceuIbirama);
    }
    
    
    
}
