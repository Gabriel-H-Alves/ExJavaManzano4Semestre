/*
 * L02H: Efetuar a leitura de cinco numeros inteiros e identificar o maior e o menor valores.
 */

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero 1: ");
        int numero01 = sc.nextInt();
        int maior = numero01;
        int menor = numero01;

        System.out.print("Digite o numero 2: ");
        int numero02 = sc.nextInt();
        if (numero02 > maior) maior = numero02;
        if (numero02 < menor) menor = numero02;

        System.out.print("Digite o numero 3: ");
        int numero03 = sc.nextInt();
        if (numero03 > maior) maior = numero03;
        if (numero03 < menor) menor = numero03;

        System.out.print("Digite o numero 4: ");
        int numero04 = sc.nextInt();
        if (numero04 > maior) maior = numero04;
        if (numero04 < menor) menor = numero04;

        System.out.print("Digite o numero 5: ");
        int numero05 = sc.nextInt();
        if (numero05 > maior) maior = numero05;
        if (numero05 < menor) menor = numero05;

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        sc.close();
    }
}
