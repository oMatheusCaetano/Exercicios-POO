/******************************************************************************************
 *
 * Escreva um programa para ler o número de lados de um polígono regular e a
 * medida do lado (em cm). Faça um procedimento que receba como parâmetro o
 * número de lados e a medida do lado deste polígono e calcule e imprima o seguinte: -
 * Se o número de lados for igual a 3, escrever TRIÂNGULO e o valor do seu perímetro.
 * - Se o número de lados for igual a 4, escrever QUADRADO e o valor da sua área. -
 * Se o número de lados for igual a 5, escrever PENTÁGONO. Observação: Considere
 *que o usuário só informará os valores 3, 4 ou 5. 
 * 
 *
 *****************************************************************************************/

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        byte numberOfSides;
        double measureOfTheSides;
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, informe o número de lados!");
        numberOfSides = input.nextByte();

        System.out.println("Por favor, informe a medida dos lados!");
        measureOfTheSides = input.nextDouble();

        System.out.println(getGeometricFigure(numberOfSides, measureOfTheSides));
    }

    public static String getGeometricFigure(byte numberOfSides, double measureOfTheSides) {
        switch (numberOfSides) {
            case 3:
                return "TRIÂNGULO! Perímetro: " + calculateTrianglePerimeter(measureOfTheSides);
            case 4:
                return "QUADRADO! Área: " + calculateSquareArea(measureOfTheSides);
        }
        
        return "PENTÁGONO!";
    }

    public static double calculateTrianglePerimeter(double measureOfTheSides) {
        return measureOfTheSides * 3;
    }

    public static double calculateSquareArea(double measureOfTheSides) {
        return Math.pow(measureOfTheSides, 2);
    }
}
