/*
 * L02A: Ler dois valores numericos inteiros e apresentar o resultado da diferenca
 * do maior pelo menor valor.
 */

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero01 = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        int numero02 = sc.nextInt();

        int diferenca;
        if (numero01 > numero02) {
            diferenca = numero01 - numero02;
        } else {
            diferenca = numero02 - numero01;
        }

        System.out.println("Diferenca do maior pelo menor: " + diferenca);

        sc.close();
    }
}
