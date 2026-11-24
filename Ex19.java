/*
 * L02J: Elaborar um programa que efetue a leitura de um valor que esteja entre a faixa de 1 a 9.
 * Indicar "O valor esta na faixa permitida" ou "O valor esta fora da faixa permitida".
 */

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro entre 1 e 9: ");
        int valor = sc.nextInt();

        if (valor >= 1 && valor <= 9) {
            System.out.println("O valor esta na faixa permitida");
        } else {
            System.out.println("O valor esta fora da faixa permitida");
        }

        sc.close();
    }
}
