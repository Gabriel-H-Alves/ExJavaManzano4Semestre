/*
 * L06B: Ler 8 elementos em um vetor01 tipo vetor. Construir um vetor02 de mesma dimensao
 * com os elementos do vetor01 multiplicados por 3. Apresentar o vetor02.
 */

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor01 = new int[8];
        int[] vetor02 = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o elemento " + i + ": ");
            vetor01[i] = sc.nextInt();
            vetor02[i] = vetor01[i] * 3;
        }

        System.out.println("Elementos do segundo vetor:");
        for (int i = 0; i < 8; i++) {
            System.out.println("Posicao " + i + ": " + vetor02[i]);
        }

        sc.close();
    }
}
