/**
 * *****************************************************************************************
 *
 * Escreva uma função que lê um caractere digitado pelo usuário e retorna este
 * caractere somente se ele for igual a 'S' ou 'N'. Se o caractere não for nem 'S' nem 'N',
 * a função imprime a mensagem 'Caractere inválido. Digite novamente'. Use esta
 * função em um programa que fica lendo do usuário um número qualquer e imprime
 * este número ao cubo na tela. O programa deve ficar lendo os números até o usuário
 * responder 'N' à pergunta se ele deseja continuar ou não.
 *
 *****************************************************************************************
 */
package exercicio08;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercicio08 {

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Scanner input = new Scanner(System.in);
        double number;

        do {
            try {
                System.out.println("Por Favor, informe o número!!");
                number = input.nextDouble();

                System.out.println("Resultado: " + getMultipliedNumber(number));
                toContinue();
            } catch (InputMismatchException ex) {
                System.err.println("ERRO: VALOR INFORMADO É INVÁLIDO!!");
            } finally {
                input.nextLine();
            }
        } while (true);
    }

    private static double getMultipliedNumber(double number) {
        return Math.pow(number, 3);
    }

    private static void toContinue() {
        Scanner input = new Scanner(System.in);
        String choice;
        boolean repeat = true;

        do {
            try {
                System.out.println("\nDeseja contiuar??");
                choice = input.next();

                if (choice.equalsIgnoreCase("S")) {
                    start();
                } else if (choice.equalsIgnoreCase("N")) {
                    System.exit(0);
                } else {
                    throw new Exception();
                }
            } catch (Exception ex) {
                System.err.println("ERRO: VALOR INFORMADO É INVÁLIDO!!");
            } finally {
                input.nextLine();
            }
        } while (true);
    }
}
