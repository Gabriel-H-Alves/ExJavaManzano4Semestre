/*
 * L01F: Ler dois valores para as variaveis numero01 e numero02, e efetuar a troca dos valores de forma
 * que numero01 passe a possuir o valor de numero02 e numero02 passe a possuir o valor de numero01.
 * Apresentar os valores trocados.
 */

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero01 = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        int numero02 = sc.nextInt();

        int auxiliar = numero01;
        numero01 = numero02;
        numero02 = auxiliar;

        System.out.println("Novo valor do primeiro numero: " + numero01);
        System.out.println("Novo valor do segundo numero: " + numero02);

        sc.close();
    }
}
