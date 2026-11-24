/*
 * L02G: Efetuar a leitura de quatro numeros inteiros e apresentar
 * os numeros que sao divisiveis por 2 e 3.
 */

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero 1: ");
        int numero01 = sc.nextInt();

        System.out.print("Digite o numero 2: ");
        int numero02 = sc.nextInt();

        System.out.print("Digite o numero 3: ");
        int numero03 = sc.nextInt();

        System.out.print("Digite o numero 4: ");
        int numero04 = sc.nextInt();

        System.out.println("Numeros divisiveis por 2 e 3:");
        if (numero01 % 2 == 0 && numero01 % 3 == 0) {
            System.out.println(numero01);
        }
        if (numero02 % 2 == 0 && numero02 % 3 == 0) {
            System.out.println(numero02);
        }
        if (numero03 % 2 == 0 && numero03 % 3 == 0) {
            System.out.println(numero03);
        }
        if (numero04 % 2 == 0 && numero04 % 3 == 0) {
            System.out.println(numero04);
        }

        sc.close();
    }
}
