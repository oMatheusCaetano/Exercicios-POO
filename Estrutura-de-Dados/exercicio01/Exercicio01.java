/************************************************************************************
 * 
 * Faça uma função que recebe um número inteiro por parâmetro e retorna verdadeiro
 * se ele for par e falso se for ímpar. 
 * 
 ***********************************************************************************/
package exercicio01;

/**
 *
 * @author caetanomatheus
 */
public class Exercicio01 {
    
    public static void main(String[] args) {
        
        System.out.println(evenOrOdd(2));
    }
    
    public static boolean evenOrOdd(int number) {
        return number % 2 == 0;
    }
}