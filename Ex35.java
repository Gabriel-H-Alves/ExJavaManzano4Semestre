/*
 * L12A: Escreva um programa que utilize uma sub-rotina (funcao/metodo) para calcular
 * a serie de Fibonacci de N termos e apresentar o resultado.
 */

import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos da serie de Fibonacci: ");
        int n = sc.nextInt();

        calcularFibonacci(n);

        sc.close();
    }

    public static void calcularFibonacci(int n) {
        int anterior = 0;
        int atual = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(atual + " ");
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        System.out.println();
    }
}
