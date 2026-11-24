/*
 * L01H: Elaborar um programa que calcule e apresente o volume de uma caixa retangular,
 * por meio da formula VOLUME = COMPRIMENTO * LARGURA * ALTURA.
 */

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o comprimento da caixa: ");
        double comprimento = sc.nextDouble();

        System.out.print("Digite a largura da caixa: ");
        double largura = sc.nextDouble();

        System.out.print("Digite a altura da caixa: ");
        double altura = sc.nextDouble();

        double volume = comprimento * largura * altura;

        System.out.println("O volume da caixa retangular e: " + volume);

        sc.close();
    }
}
