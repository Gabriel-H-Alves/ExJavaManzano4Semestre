/*
 * L04E: Elaborar um programa que efetue a leitura de 15 valores numericos inteiros e no final
 * apresente o total do somatorio da fatorial de cada valor lido (usando do-while).
 */

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long somaFatoriais = 0;
        int contador = 1;

        do {
            System.out.print("Digite o " + contador + "o numero inteiro: ");
            int numeroEntrada = sc.nextInt();

            long fatorial = 1;
            int multiplicador = 1;
            while (multiplicador <= numeroEntrada) {
                fatorial = fatorial * multiplicador;
                multiplicador++;
            }

            somaFatoriais = somaFatoriais + fatorial;
            contador++;
        } while (contador <= 15);

        System.out.println("Somatorio dos fatoriais: " + somaFatoriais);

        sc.close();
    }
}
