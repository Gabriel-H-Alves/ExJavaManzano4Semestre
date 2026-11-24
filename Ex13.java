/*
 * L02D: Ler quatro notas escolares. Se a media for >= 7, aluno aprovado. Se menor que 7,
 * solicitar nota de exame, somar com a media e obter nova media. Se nova media >= 5,
 * aprovado em exame; caso contrario, reprovado. Apresentar a media em qualquer condicao.
 */

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        double nota01 = sc.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota02 = sc.nextDouble();

        System.out.print("Digite a nota 3: ");
        double nota03 = sc.nextDouble();

        System.out.print("Digite a nota 4: ");
        double nota04 = sc.nextDouble();

        double media = (nota01 + nota02 + nota03 + nota04) / 4.0;

        if (media >= 7.0) {
            System.out.println("Aluno aprovado! Media: " + media);
        } else {
            System.out.print("Digite a nota do exame: ");
            double notaExame = sc.nextDouble();
            double novaMedia = (media + notaExame) / 2.0;

            if (novaMedia >= 5.0) {
                System.out.println("Aluno aprovado em exame! Nova media: " + novaMedia);
            } else {
                System.out.println("Aluno reprovado! Nova media: " + novaMedia);
            }
        }

        sc.close();
    }
}
