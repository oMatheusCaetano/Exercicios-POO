/************************************************************************************
 * 
 *  Faça um programa que leia a altura e o sexo (codificado da seguinte forma:
 * 1:feminino 2:masculino) de uma pessoa. Depois faça uma função chamada pesoideal
 * que receba a altura e o sexo via parâmetro e que calcule e retorne seu peso ideal,
 * utilizando as seguintes fórmulas:
 * 
 * - para homens : (72.7 * h) – 58
 * - para mulheres : (62.1 * h) – 44.7
 * 
 * 
 ***********************************************************************************/
package exercicio05;

import java.util.Scanner;

/**
 *
 * @author caetanomatheus
 */
public class Exercicio05 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Por favor, informe a altura!!");
        float height = input.nextFloat();
        
        System.out.println("Por favor, informe o genero\n[1]Feminino\n[2]Masculino!!");
        byte gender = input.nextByte();
        
        System.out.println("Peso ideal: " + idealWeight(gender, height));
    }
    
    public static double idealWeight(byte gender, float height) {
        double idealWeight = 0;
        switch (gender) {
            case 1:
                idealWeight = (62.1 * height) - 44.7;
                break;
            case 2:
                idealWeight = (72.7 * height) - 58;
        }
        
        return idealWeight;
    }
}