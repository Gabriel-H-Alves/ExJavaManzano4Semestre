/*
 * L04J: Elaborar um programa que apresente o resultado inteiro da divisao de dois numeros
 * quaisquer sem utilizar o operador de divisao, utilizando laco de repeticao.
 */

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dividendo: ");
        int dividendo = sc.nextInt();

        System.out.print("Digite o divisor: ");
        int divisor = sc.nextInt();

        if (divisor <= 0) {
            System.out.println("Divisor deve ser maior que zero.");
        } else {
            int quociente = 0;
            if (dividendo >= divisor) {
                do {
                    dividendo = dividendo - divisor;
                    quociente++;
                } while (dividendo >= divisor);
            }
            System.out.println("Quociente inteiro da divisao: " + quociente);
        }

        sc.close();
    }
}
