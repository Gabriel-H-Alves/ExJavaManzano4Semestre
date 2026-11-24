/*
 * L03I: Elaborar um programa que efetue a leitura de 10 valores numericos e apresente
 * no final o total do somatorio e a media aritmetica dos valores lidos.
 */

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        int i = 1;

        while (i <= 10) {
            System.out.print("Digite o " + i + "o valor: ");
            double valor = sc.nextDouble();
            soma = soma + valor;
            i++;
        }

        double media = soma / 10.0;

        System.out.println("Somatorio: " + soma);
        System.out.println("Media aritmetica: " + media);

        sc.close();
    }
}
