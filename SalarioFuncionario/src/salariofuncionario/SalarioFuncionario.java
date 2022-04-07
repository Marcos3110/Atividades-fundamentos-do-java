
package salariofuncionario;

import java.util.Scanner;

/**
 *
 * @author marcos-levandoski
 */
public class SalarioFuncionario {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Nome funcionario: ");
        String nome = s.nextLine();
        
        System.out.printf("Horas trabalhada: ");
        int horas = s.nextInt();
        
        System.out.printf("valor a receber: ");
        double receber = s.nextDouble();
        
        System.out.printf("Total filhos: " );
        int filhos = s.nextInt();
        
        double salario = (horas * receber);
        salario = salario + (salario * 0.03 * filhos);
        
        System.out.println(nome+" "+String.format("%.2f",salario));
        
    }
    
}
