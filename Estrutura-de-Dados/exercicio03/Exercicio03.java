/************************************************************************************
 * 
 * Escreva um programa para ler uma temperatura em graus Fahrenheit. Faça uma
 * função chamada celsius para calcular e retornar o valor correspondente em graus
 * Celsius. Fórmula: C = ((F-32)/9)*5 
 * 
 ***********************************************************************************/
package exercicio03;

import java.util.Scanner;

/**
 *
 * @author caetanomatheus
 */
public class Exercicio03 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Por favor, informe o valor em graus fahrenheit!!");
        double fahrenheit = input.nextDouble();
        
        System.out.printf("Temperatura equivalente em graus celsius: %.2f" + celsius(fahrenheit));
    }
    
    public static double celsius(double fahrenheit) {
        return ((fahrenheit - 32) / 9) * 5;
    }
}