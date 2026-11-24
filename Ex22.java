/*
 * L03F: Elaborar um programa que apresente como resultado o valor de uma potencia
 * de uma base B elevada a um expoente E qualquer, sem usar operador de exponenciacao.
 */

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base (B): ");
        int base = sc.nextInt();

        System.out.print("Digite o expoente (E): ");
        int expoente = sc.nextInt();

        int resultado = 1;
        int i = 1;
        while (i <= expoente) {
            resultado = resultado * base;
            i++;
        }

        System.out.println(base + " elevado a " + expoente + " = " + resultado);

        sc.close();
    }
}
