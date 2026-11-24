/*
 * 3.10 C: Em uma eleicao sindical concorreram tres candidatos (A, B e C). Ler a quantidade de votos
 * validos para cada candidato, votos nulos e votos em branco. Apresentar o total de eleitores e os
 * percentuais de votos validos, de cada candidato, nulos e em branco em relacao ao total de eleitores.
 */

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Votos validos candidato A: ");
        int votosA = sc.nextInt();

        System.out.print("Votos validos candidato B: ");
        int votosB = sc.nextInt();

        System.out.print("Votos validos candidato C: ");
        int votosC = sc.nextInt();

        System.out.print("Votos nulos: ");
        int nulos = sc.nextInt();

        System.out.print("Votos em branco: ");
        int brancos = sc.nextInt();

        int totalEleitores = votosA + votosB + votosC + nulos + brancos;
        int totalValidos = votosA + votosB + votosC;

        double percValidos = (totalValidos * 100.0) / totalEleitores;
        double percA = (votosA * 100.0) / totalEleitores;
        double percB = (votosB * 100.0) / totalEleitores;
        double percC = (votosC * 100.0) / totalEleitores;
        double percNulos = (nulos * 100.0) / totalEleitores;
        double percBrancos = (brancos * 100.0) / totalEleitores;

        System.out.println("Total de eleitores: " + totalEleitores);
        System.out.println("Percentual de votos validos: " + percValidos + "%");
        System.out.println("Percentual candidato A: " + percA + "%");
        System.out.println("Percentual candidato B: " + percB + "%");
        System.out.println("Percentual candidato C: " + percC + "%");
        System.out.println("Percentual votos nulos: " + percNulos + "%");
        System.out.println("Percentual votos em branco: " + percBrancos + "%");

        sc.close();
    }
}
