/*
 * L02F: Efetuar a leitura de tres valores (numero01, numero02 e numero03)
 * e apresenta-los dispostos em ordem crescente.
 */

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero01 = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        int numero02 = sc.nextInt();

        System.out.print("Digite o terceiro numero: ");
        int numero03 = sc.nextInt();

        int auxiliar;
        if (numero01 > numero02) {
            auxiliar = numero01;
            numero01 = numero02;
            numero02 = auxiliar;
        }
        if (numero01 > numero03) {
            auxiliar = numero01;
            numero01 = numero03;
            numero03 = auxiliar;
        }
        if (numero02 > numero03) {
            auxiliar = numero02;
            numero02 = numero03;
            numero03 = auxiliar;
        }

        System.out.println("Ordem crescente: " + numero01 + ", " + numero02 + ", " + numero03);

        sc.close();
    }
}
