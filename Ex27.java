/*
 * L04F: Efetuar a leitura sucessiva de valores numericos positivos e apresentar o somatorio,
 * a media aritmetica e o total de valores lidos. Parar quando um valor negativo for fornecido.
 */

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        int quantidade = 0;
        double valor;

        do {
            System.out.print("Digite um valor positivo (ou negativo para encerrar): ");
            valor = sc.nextDouble();

            if (valor >= 0) {
                soma = soma + valor;
                quantidade++;
            }
        } while (valor >= 0);

        if (quantidade > 0) {
            double media = soma / quantidade;
            System.out.println("Somatorio: " + soma);
            System.out.println("Media aritmetica: " + media);
            System.out.println("Total de valores lidos: " + quantidade);
        } else {
            System.out.println("Nenhum valor positivo foi informado.");
        }

        sc.close();
    }
}
