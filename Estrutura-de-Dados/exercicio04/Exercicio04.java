/************************************************************************************
 * 
 *  Escreva um programa para ler as notas das duas avaliações de um aluno no
 * semestre. Faça um procedimento que receba as duas notas por parâmetro e calcule
 * e escreva a média semestral e a mensagem “PARABÉNS! Você foi aprovado!”
 * somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação).
 * 
 ***********************************************************************************/
package exercicio04;

import java.util.Scanner;

/**
 *
 * @author caetanomatheus
 */
public class Exercicio04 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Por favor, informe o valor da primeira nota!!");
        float firstValue = input.nextFloat();
        
        System.out.println("Por favor, informe o valor da segunda nota!!");
        float scondValue = input.nextFloat();
        
        System.out.println(finalResult(firstValue, scondValue));
    }
    
    public static String finalResult(float firstValue, float scondValue) {
        if (((firstValue + scondValue) / 2) > 6)
            return "PARABÉNS! Você foi aprovado";
        return "Reprovado!!";
    }
}