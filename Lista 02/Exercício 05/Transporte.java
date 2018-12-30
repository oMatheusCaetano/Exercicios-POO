/*****************************************************************************
 * 
 * Suponha que precisamos implementar um sistema para a gerência de embarcações.
 * Uma embarcação possui como dados básicos a quantidade de passageiros e suas 
 * dimensões (comprimento e largura). Como tipos de embarcações, para este nosso
 * sistema, podemos ter as voltadas para esporte e lazer (por ex., caiaques, 
 * barcos à vela, remo, etc) e as para transporte (barcas, navios que 
 * transportam petróleo, balsas, etc). Nas de esporte e lazer, uma 
 * característica comum é a existência ou não de vela. Para as de transporte, 
 * normalmente nos interessa saber a capacidade de carga e a potência da 
 * embarcação. Em todas também é interessante registrar a velocidade máxima.
 * 
 * a) Crie as classes que representam os tipos de embarcações do sistema com 
 *    seus atributos. 
 * b) Defina os construtores dessas classes. Para o caso das embarcações de 
 *    transporte, há uma restrição de que o valor da potência tenha que ser, no 
 *    mínimo, o valor da sua carga. Na construção de um objeto, caso os valores 
 *    passados não respeitem esta regra, altere-os de forma a respeitá-los.
 * 
 ****************************************************************************/
package exercicio05;

/**
 *
 * @author CaetanoMatheus
 */
public class Transporte extends Embarcacao{
    
    /*************************************************************************
     * Attributes
     ************************************************************************/
    private int capacidade;
    private int potencia;
    
    /*************************************************************************
     * Constructor
     ************************************************************************/
    public Transporte(int quantidadePassageiros, double comprimento,
            double largura, int velocidadeMaxima, int capacidade,
            int potencia) {
        this.quantidadePassageiros = quantidadePassageiros;
        this.comprimento = comprimento;
        this.largura = largura;
        this.velocidadeMaxima = velocidadeMaxima;
        this.capacidade = capacidade;
        this.potencia = potencia;
        
        if(this.potencia < this.capacidade)
            this.potencia = this.capacidade;
    }
}
