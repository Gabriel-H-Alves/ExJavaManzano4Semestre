/*
 * L07B: Ler 8 elementos em um vetor01. Construir um vetor02 com os elementos do vetor01 multiplicados
 * por 5. Montar uma rotina de pesquisa sequencial para pesquisar os elementos no vetor02.
 */

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor01 = new int[8];
        int[] vetor02 = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o elemento " + i + ": ");
            vetor01[i] = sc.nextInt();
            vetor02[i] = vetor01[i] * 5;
        }

        System.out.print("Digite o valor que deseja pesquisar no segundo vetor: ");
        int valorPesquisado = sc.nextInt();

        boolean encontrado = false;
        int posicao = -1;

        for (int i = 0; i < 8; i++) {
            if (vetor02[i] == valorPesquisado) {
                encontrado = true;
                posicao = i;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Valor encontrado na posicao " + posicao + " do vetor.");
        } else {
            System.out.println("Valor nao encontrado no vetor.");
        }

        sc.close();
    }
}
