/*
 * L02L: Elaborar um programa que efetue a leitura do nome e do sexo de uma pessoa,
 * apresentando "Ilmo Sr." para masculino ou "Ilma Sra." para feminino, junto do nome.
 */

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o sexo (M/F): ");
        String sexo = sc.next();

        if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("masculino")) {
            System.out.println("Ilmo Sr. " + nome);
        } else if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("feminino")) {
            System.out.println("Ilma Sra. " + nome);
        } else {
            System.out.println("Sexo invalido.");
        }

        sc.close();
    }
}
