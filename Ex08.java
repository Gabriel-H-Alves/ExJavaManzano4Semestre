/*
 * L01J: Elaborar um programa que efetue a apresentacao do valor da conversao em real de um valor
 * lido em dolar. O programa deve solicitar o valor da cotacao do dolar e a quantidade de dolares.
 */

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a cotacao do dolar: ");
        double cotacao = sc.nextDouble();

        System.out.print("Digite a quantidade de dolares: ");
        double dolares = sc.nextDouble();

        double reais = dolares * cotacao;

        System.out.println("Valor em reais: R$ " + reais);

        sc.close();
    }
}
