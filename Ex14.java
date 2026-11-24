/*
 * L02E: Efetuar a leitura de tres valores (coeficienteA, coeficienteB e coeficienteC) e efetuar o calculo
 * da equacao completa de segundo grau, apresentando as duas raizes, se for possivel.
 */

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o coeficiente A: ");
        double coeficienteA = sc.nextDouble();

        System.out.print("Digite o coeficiente B: ");
        double coeficienteB = sc.nextDouble();

        System.out.print("Digite o coeficiente C: ");
        double coeficienteC = sc.nextDouble();

        if (coeficienteA == 0) {
            System.out.println("Nao e uma equacao de segundo grau (A deve ser diferente de zero).");
        } else {
            double delta = (coeficienteB * coeficienteB) - (4 * coeficienteA * coeficienteC);
            if (delta < 0) {
                System.out.println("Nao existem raizes reais.");
            } else {
                double raiz01 = (-coeficienteB + Math.sqrt(delta)) / (2 * coeficienteA);
                double raiz02 = (-coeficienteB - Math.sqrt(delta)) / (2 * coeficienteA);
                System.out.println("Raiz X1: " + raiz01);
                System.out.println("Raiz X2: " + raiz02);
            }
        }

        sc.close();
    }
}
