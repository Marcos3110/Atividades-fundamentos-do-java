package desconto;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class desconto {

    static Scanner s = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.00");

    static String getInfo() {
        String info = s.nextLine();
        return info;
    }

    static double getDouble() {
        return s.nextDouble();

    }

    static int getInfoInt() {
        return s.nextInt();

    }

    static double calcularINSS(double sBruto) {

        double porcent;

        if (sBruto <= 1000) {
            porcent = (8.5 * sBruto / 100);
        } else {
            porcent = (9 * sBruto / 100);
        }

        return sBruto - (sBruto - porcent);
    }

    static double calcularIR(double salarioBt) {
        double imposto;

        if (salarioBt <= 500) {
            imposto = 0;
        } else if (salarioBt > 500 && salarioBt <= 1000) {
            imposto = (5 * salarioBt / 100);
        } else {
            imposto = (7 * salarioBt / 100);
        }

        return salarioBt - (salarioBt - imposto);
    }

    static double calcularBruto(double hTrabalhadas, double pHora, int filhos) {
        double salarioBt = hTrabalhadas * pHora;
        return salarioBt + ((filhos * 3) * salarioBt) / 100;
    }

    static double calcularLiquido(double bruto, double ir, double inss) {
        return bruto - ir - inss;
    }

    public static void main(String[] args) {
        df.setRoundingMode(RoundingMode.HALF_UP);

        String nome = getInfo();
        String hTrabalhadas1 = getInfo();
        double hTrabalhadas = Double.parseDouble(hTrabalhadas1);
        double pgmtHora = getDouble();
        int filhos = getInfoInt();

        double salarioBt = calcularBruto(hTrabalhadas, pgmtHora, filhos);
        double descontoINSS = calcularINSS(salarioBt);
        double descontoIR = calcularIR(salarioBt);
        double salarioLiquido = calcularLiquido(salarioBt, descontoIR, descontoINSS);

        System.out.println(nome + ";"
                + df.format(salarioBt) + ";"
                + df.format(descontoINSS) + ";"
                + df.format(descontoIR) + ";"
                + df.format(salarioLiquido));
    }
}
