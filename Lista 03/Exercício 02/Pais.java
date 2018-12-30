/*****************************************************************************
 * 
 * Escreva uma classe que represente um país. Um país tem como atributos o seu
 * nome, o nome da capital, sua dimensão em Km2 e uma lista de países com os 
 * quais ele faz fronteira. Represente a classe e forneça os seguintes 
 * construtores e método:
 * 
 * a)  Construtor que inicialize o nome, capital e a dimensão do país;
 * b)  Métodos de acesso (obter/get) para as propriedades indicadas no item (a);
 * c)  Um método que permita verificar se dois países são iguais. Dois países 
 *     são iguais se tiverem o mesmo nome e a mesma capital. A assinatura deste
 *     método deve ser: public boolean equals(final Pais outro);
 * d)  Um método que define quais outros países fazem fronteira (note que um 
 *     país não pode fazer fronteira com ele mesmo);
 * e)  Um método que retorne a lista de países que fazem fronteira;
 * f)  Um método que receba um outro país como parâmetro e retorne uma lista
 *     de vizinhos comuns aos dois países.
 * 
 *****************************************************************************/
import java.util.ArrayList;

/**
 *
 * @author CaetanoMatheus
 */
public class Pais {
    
    /*************************************************************************
     *Attributes 
     ************************************************************************/
    private String nome;
    private String capital;
    private double km2;
    private ArrayList<Pais> p = new ArrayList();
    
    /*************************************************************************
     *Constructor 
     ************************************************************************/
    public Pais(String nome, String capital, double km2) {
        this.nome = nome;
        this.capital = capital;
        this.km2 = km2;
    }

    /*************************************************************************
     *Methods 
     ************************************************************************/
    public boolean equals(final Pais outro){
        return this.nome.equals(outro.nome) && this.capital.equals(outro.capital);
    }
    
    public boolean definirFronteira(Pais outro){
        if(!equals(outro)){
            this.p.add(outro);
            return true;
        }
        return false;
    }
    
    public ArrayList<Pais> getFronteira(){
        return this.p;
    }
    
    public ArrayList<Pais> getVizinhos(Pais outro){
        ArrayList<Pais> v = new ArrayList();
        
        for(Pais a : this.p){
            for(Pais b : outro.p){
                if(a.equals(b))
                    v.add(b);
            }
        }
        
        return v;
    }
    
    /*************************************************************************
     *Getters and Setters 
    ************************************************************************/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public double getKm2() {
        return km2;
    }

    public void setKm2(double km2) {
        this.km2 = km2;
    }
}
