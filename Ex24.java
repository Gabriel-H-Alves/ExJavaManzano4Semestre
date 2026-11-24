/*
 * L03K: Calcular a area total de uma residencia solicitando nome, largura e comprimento de cada comodo,
 * apresentando a area do comodo e perguntando se deseja continuar. Se responder NAO, mostrar o total.
 */

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double areaTotal = 0;
        String resposta = "SIM";

        while (!resposta.equalsIgnoreCase("NAO")) {
            System.out.print("Digite o nome do comodo: ");
            String nome = sc.nextLine();

            System.out.print("Digite a largura do comodo: ");
            double largura = sc.nextDouble();

            System.out.print("Digite o comprimento do comodo: ");
            double comprimento = sc.nextDouble();
            sc.nextLine();

            double areaComodo = largura * comprimento;
            areaTotal = areaTotal + areaComodo;

            System.out.println("Area do comodo (" + nome + "): " + areaComodo);

            System.out.print("Deseja continuar calculando novos comodos? (SIM/NAO): ");
            resposta = sc.nextLine();
        }

        System.out.println("Area total da residencia: " + areaTotal);

        sc.close();
    }
}
