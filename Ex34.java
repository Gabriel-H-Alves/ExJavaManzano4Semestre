/*
 * L08A: Ler duas matrizes matriz01 e matriz02 de duas dimensoes com 5 linhas e 3 colunas.
 * Construir uma matrizSoma de mesma dimensao formada pela soma dos elementos.
 */

import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz01 = new int[5][3];
        int[][] matriz02 = new int[5][3];
        int[][] matrizSoma = new int[5][3];

        System.out.println("Digite os elementos da primeira matriz (5x3):");
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Matriz01[" + linha + "][" + coluna + "]: ");
                matriz01[linha][coluna] = sc.nextInt();
            }
        }

        System.out.println("Digite os elementos da segunda matriz (5x3):");
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Matriz02[" + linha + "][" + coluna + "]: ");
                matriz02[linha][coluna] = sc.nextInt();
                matrizSoma[linha][coluna] = matriz01[linha][coluna] + matriz02[linha][coluna];
            }
        }

        System.out.println("Matriz Soma (Matriz01 + Matriz02):");
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(matrizSoma[linha][coluna] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
