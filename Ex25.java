/*
 * L03L: Elaborar um programa que efetue a leitura de valores positivos inteiros ate que um
 * valor negativo seja informado. Ao final devem ser apresentados o maior e o menor valores.
 */

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero positivo (ou negativo para sair): ");
        int valor = sc.nextInt();

        if (valor < 0) {
            System.out.println("Nenhum valor positivo foi informado.");
        } else {
            int maior = valor;
            int menor = valor;

            while (valor >= 0) {
                if (valor > maior) {
                    maior = valor;
                }
                if (valor < menor) {
                    menor = valor;
                }
                System.out.print("Digite outro numero positivo (ou negativo para sair): ");
                valor = sc.nextInt();
            }

            System.out.println("Maior valor informado: " + maior);
            System.out.println("Menor valor informado: " + menor);
        }

        sc.close();
    }
}
