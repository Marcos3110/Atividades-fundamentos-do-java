
package dadosdemograficos;

import java.util.Scanner;

/**
 *
 * @author marcos-levandoski
 */
public class DadosDemograficos {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.useDelimiter("\n");
        int qtdEntrevistados = 0;
        long somaIdades = 0;
        int menorIdade = 999;
        String nomeMenorIdade = " ";
        int idade18e20 = 0;
        int sexoFem = 0;
        int nacidosIbirama = 0;
        
        
        String nome = s.next();
        
        while (!nome.equals("fim")){
            int idade = s.nextInt();
            String sexo = s.next();
            String cidade = s.next();
            
            somaIdades = somaIdades + idade;
            qtdEntrevistados++;
            
            if(idade < menorIdade){
                menorIdade = idade;
                nomeMenorIdade = nome;
            }
            
            if(idade >= 18 && idade <= 20){
                idade18e20++;
            }
            
            if(sexo.equals("F")){
                sexoFem++;
            }
            
            if(cidade.equals("Ibirama")){
                nacidosIbirama++;
            }
            
            nome = s.next();
            
        }
        
        double mediaIdades = somaIdades / (double) qtdEntrevistados;
        
        double percentualFem = 100 * sexoFem / (double) qtdEntrevistados;
        
        System.out.println("Menor idade: " + nomeMenorIdade);
        System.out.println("Quantidade 18-20: " + idade18e20);
        System.out.println("Média idade: " + String.format("%.2f", mediaIdades));
        System.out.println("Percentual feminino: " + String.format("%.2f",percentualFem));
        System.out.println("Nascidos em Ibirama: " + nacidosIbirama);
    }
    
}
