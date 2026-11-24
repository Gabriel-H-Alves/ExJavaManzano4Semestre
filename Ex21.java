/*
 * L03A: Apresentar os resultados de uma tabuada de multiplicar (de 1 ate 10)
 * de um numero qualquer usando a estrutura enquanto (while).
 */

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero para ver a tabuada: ");
        int numero = sc.nextInt();

        int i = 1;
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }

        sc.close();
    }
}
