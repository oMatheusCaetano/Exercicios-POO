/*****************************************************************************
 * 
 * Escreva em Java uma classe que represente um circulo no plano cartesiano.
 * Forneça os seguintes membros de classe:
 * > Um construtor que receba o raio e um ponto (o centro do  círculo);
 * > Um construtor que receba o raio e posicione o círculo na origem  do espaço
 *   cartesiano;
 * > Métodos de acesso ao atributo raio do círculo;
 * > Métodos inflar e desinflar, que, respectivamente, aumentam e  diminuem o raio
 *   do círculo de um dado valor;
 * > Métodos sobrecarregados, inflar e desinflar, que,  respectivamente, aumentam
 *   e diminuem o raio do círculo de uma  unidade; 
 * > Métodos sobrecarregados mover, que:
 *   por default (sem parâmetros) levam o círculo para a origem do espaço 2D;
 *   movem o círculo para um local indicado por dois parâmetros do tipo double
 *   (indicando o valor de abcissa e ordenada do ponto para onde o círculo 
 *   se move);
 *   movem o círculo para o local indicado por outro ponto.
 * > Método que retorna a área do círculo
 * 
 ****************************************************************************/
package exercicio10;

/**
 *
 * @author CaetanoMatheus
 */
public class Circulo {

    //Attributes
    private double raio = 1;
    private double x = 0;
    private double y = 0;

    //Constructor
    public Circulo(double raio, double x, double y) {
        this.raio = raio;
        this.x = x;
        this.y = y;
    }
 
    public Circulo() {
    }
    
    //Methods
    public void inflar(double valor){
        this.raio += valor;
    }
    
    public void inflar(){
        this.raio += 1;
    }
    
    public void desinflar(double valor){
        this.raio -= valor;
    }
    
    public void desinflar(){
        this.raio -= 1;
    }
    
    public void mover(){
        this.x = 0;
        this.y = 0;
    }
    
    public void mover(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public void mover(Circulo outro){
        this.x = outro.x;
        this.y = outro.y;
    }
    
    public double area(){
        return Math.PI * Math.pow(raio, 2);
    }

    //Getters and Setters
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

