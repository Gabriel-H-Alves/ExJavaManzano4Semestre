/*
 * L02B: Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o numero lido
 * como sendo um valor positivo (modulo). Se for menor que zero, multiplique-o por -1.
 */

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            numero = numero * -1;
        }

        System.out.println("Valor positivo: " + numero);

        sc.close();
    }
}
