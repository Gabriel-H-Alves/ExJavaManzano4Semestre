/*
 * L06G: Ler 20 elementos de um vetor01 e construir um vetor02 de mesma dimensao
 * com os mesmos elementos do vetor01 invertidos. Apresentar os dois vetores lado a lado.
 */

import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor01 = new int[20];
        int[] vetor02 = new int[20];

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o elemento " + i + ": ");
            vetor01[i] = sc.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            vetor02[i] = vetor01[19 - i];
        }

        System.out.println("Vetor 01 | Vetor 02");
        for (int i = 0; i < 20; i++) {
            System.out.println(vetor01[i] + " | " + vetor02[i]);
        }

        sc.close();
    }
}
