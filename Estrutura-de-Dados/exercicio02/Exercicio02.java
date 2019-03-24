/************************************************************************************
 * 
 * Escreva um programa que leia o raio de um círculo e faça duas funções: uma
 * função chamada area que calcula e retorna a área do círculo e outra função chamada
 * perimetro que calcula e retorna o perímetro do círculo.
 * 
 * Área = PI * 𝑟2
 * Perímetro = PI * 2 * r; 
 * 
 ***********************************************************************************/
package exercicio02;

import java.util.Scanner;

/**
 *
 * @author caetanomatheus
 */
public class Exercicio02 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Por favor, informe o valor do raio!!");
        double radius = input.nextDouble();
        
        System.out.println("Área: " + getArea(radius));
        System.out.println("Perímetro: " + getPerimeter(radius));
    }
    
    public static double getArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
    
    public static double getPerimeter(double radius) {
        return Math.PI * 2 * radius;
    }
}