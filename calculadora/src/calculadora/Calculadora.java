
package calculadora;


import java.text.DecimalFormat;
import java.util.Scanner;
import java.math.RoundingMode;


public class Calculadora {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite sum p/+, sub p/-, mult p/*, div p/÷, abs p/valor absoluto");
        String calculadora = s.nextLine();
        System.out.println("primeiro valor");
        double v1 = s.nextDouble();
        double v2;
        double valor1;
        double valor;
    
        switch(calculadora){
            case "sum":
                System.out.println("Segundo valor");
                 v2 = s.nextDouble();
               valor = (v1)+(v2);
               System.out.println(new DecimalFormat("0.0").format(valor));
               break;
            case "sub":
                System.out.println("Segundo valor");
                v2 = s.nextDouble();
                valor = (v1)-(v2);
                System.out.println(new DecimalFormat("0.0").format(valor));
                break;
            case "mult":
                System.out.println("Segundo valor");
                 v2 = s.nextDouble();
                valor = (v1)*(v2);
                DecimalFormat df = new DecimalFormat("0.0");
                df.setRoundingMode(RoundingMode.HALF_UP);
                System.out.println(df.format(valor));
                break;
            case "div":
                System.out.println("Segundo valor");
                 v2 = s.nextDouble();
                if(v2 == 0){
                    System.out.println("Divisão por zero");}
                else{valor1 = (v1)/(v2);
                    System.out.println(new DecimalFormat("0.0").format(valor1));
                }
                break;
            case "abs":
                valor = Math.abs(v1);
                System.out.println(new DecimalFormat("0.0").format(valor));
        }
    }
    
}

