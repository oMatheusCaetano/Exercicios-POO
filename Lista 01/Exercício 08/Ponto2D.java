/*****************************************************************************
 * 
 * Escreva uma classe Ponto2D que represente um ponto no plano cartesiano. 
 * Além dos atributos por você identificados, a classe deve oferecer os 
 * seguintes membros:
 *
 * 1. Construtores sobrecarregados que permitam a inicialização do ponto:
 * a. Por default (sem parâmetros) na origem do espaço 2D
 * b. Num local indicado por dois parâmetros do tipo double
 * c. Em um local indicado por outro ponto.
 * 2. Métodos de acesso (getter/setter) dos atributos do ponto;
 * 3. Métodos sobrecarregados de movimentação do ponto com os mesmos  parâmetros
 *    indicados para os construtores;
 * 4. Método de comparação semântica do ponto;
 * 5. Método de representação do objeto como String;
 * 6. Método que permita calcular a distância do ponto que recebe a  mensagem, 
 *    para outro ponto;
 * 7. Método que permita a criação de um novo ponto no mesmo local do  ponto 
 *    que recebeu a mensagem (clone); 
 * 
 ***************************************************************************/
/**
 *
 * @author CaetanoMatheus
 */
public class Ponto2D {
    
    //Attributes
    double abscissa = 0;
    double ordenada = 0;

    //Constructors
    public Ponto2D(){
        
    }
    
    public Ponto2D(double abscissa, double ordenada){
        this.abscissa = abscissa;
        this.ordenada = ordenada;
    }
    
    public Ponto2D(Ponto2D outro){
        this.abscissa = outro.getAbscissa();
        this.ordenada = outro.getOrdenada();
    }
    
    public String representacao(){
        return "(" + this.abscissa + "," + this.ordenada 
                + ").";   
    }
    
    public String distacia(Ponto2D outro){
        return "(" + (this.abscissa - outro.getAbscissa()) + "," 
                + (this.ordenada - outro.getOrdenada()) + ")."; 
    }
    
    //Methods
    public void moverPonto2D(){
        this.abscissa = 0;
        this.ordenada = 0;
    }
    
    public void moverPonto2D(double abscissa, double ordenada){
        this.abscissa = abscissa;
        this.ordenada = ordenada;
    }
    
    public void moverPonto2D(Ponto2D outro){
        this.abscissa = outro.getAbscissa();
        this.ordenada = outro.getOrdenada();
    }
    
    @Override
    public boolean equals(Object ponto2d){
        Ponto2D outro = (Ponto2D) ponto2d;
        return this.abscissa == outro.getAbscissa() && 
                this.ordenada == outro.getOrdenada();
    }
    
    /*********************************************************************
     * 
     * Tópico 7 ainda não resolvido!!! 
     *  
     *********************************************************************/
   
        
    //Getters and Setters
    public double getAbscissa() {
        return abscissa;
    }

    public void setX(double abscissa) {
        this.abscissa = abscissa;
    }

    public double getOrdenada() {
        return ordenada;
    }

    public void setOrdenada(double ordenada) {
        this.ordenada = ordenada;
    }
}
