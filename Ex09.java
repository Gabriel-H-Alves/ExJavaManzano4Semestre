/*
 * L01L: Elaborar um programa que efetue a leitura de tres valores (numero01, numero02 e numero03)
 * e apresente como resultado final a soma dos quadrados dos tres valores lidos.
 */

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero01 = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        int numero02 = sc.nextInt();

        System.out.print("Digite o terceiro numero: ");
        int numero03 = sc.nextInt();

        int resultado = (numero01 * numero01) + (numero02 * numero02) + (numero03 * numero03);

        System.out.println("Soma dos quadrados: " + resultado);

        sc.close();
    }
}
