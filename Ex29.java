/*
 * L05H: Elaborar um programa que apresente como resultado o valor de uma potencia de uma base
 * qualquer elevada a um expoente qualquer (B^E), usando laco para (for) e sem Math.pow.
 */

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = sc.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = sc.nextInt();

        int potencia = 1;
        for (int i = 1; i <= expoente; i++) {
            potencia = potencia * base;
        }

        System.out.println("Resultado: " + potencia);

        sc.close();
    }
}
