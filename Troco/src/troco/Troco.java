
package troco;


import java.util.Scanner;

public class Troco {

   
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        System.out.println("Informe o nome do estabelicimento: ");
        String nome = s.nextLine();
        System.out.println("Valor total a pagar" );
        int pagar = s.nextInt();
        System.out.println("Valor recebido");
        
        int recebido = s.nextInt();
        int troco = (recebido)-(pagar);
        
        int cinquenta = (troco/50);
        int restocinquenta = (troco%50);
        
        int vinte = (restocinquenta/20);
        int restovinte = (restocinquenta%20);
        
        int dez = (restovinte/10);
        int restodez = (restovinte%10);
        
        int cinco = (restodez/5);
        int restocinco = (restodez%5);
        
        int dois = (restocinco/2);
        int restodois = (restocinco%2);
        
        int um = (restodois/1);
        
        System.out.println(nome);
        System.out.println(cinquenta+"X50");
        System.out.println(vinte+"X20");
        System.out.println(dez+"X10");
        System.out.println(cinco+"X5");
        System.out.println(dois+"X2");
        System.out.println(um+"X1");
      
    }
}
