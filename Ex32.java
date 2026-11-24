/*
 * L07A: Ler 12 elementos de uma matriz tipo vetor, coloca-los em ordem decrescente
 * e apresentar os elementos ordenados.
 */

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[12];

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite o " + (i + 1) + "o elemento: ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < 11; i++) {
            for (int j = i + 1; j < 12; j++) {
                if (vetor[i] < vetor[j]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }

        System.out.println("Elementos em ordem decrescente:");
        for (int i = 0; i < 12; i++) {
            System.out.println(vetor[i]);
        }

        sc.close();
    }
}
