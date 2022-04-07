
package emprestimo;

import java.util.Scanner;

/**
 *
 * @author marcos-levandoski
 */
public class Emprestimo {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Nome: ");
        String nome = s.next();
        
        System.out.printf("salario: ");
        double salario = s.nextDouble();
        
        System.out.printf("valor financiamento: ");
        double valorFinanciamento = s.nextDouble();
        
        System.out.println(nome);
        
        if(valorFinanciamento <= 5 * salario){
            System.out.println("Financiamento CONCEDIDO");
        }else{
            System.out.println("Financiamento NEGADO");
        }
        System.out.println("Obrigado por nos consultar");
        
        
    }
    
}
