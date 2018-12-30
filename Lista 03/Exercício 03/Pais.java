/*****************************************************************************
 * 
 * Escreva em Java uma classe Continente. Um continente possui um nome e é 
 * composto por um conjunto de países. Forneça os membros de classe a seguir:
 * 
 * Construtor que inicialize o nome do continente;
 * Um método que permita adicionar países aos continentes;
 * Um método que retorne a dimensão total do continente;
 * Um método que retorne a população total do continente;
 * Um método que retorne a densidade populacional do continente;
 * Um método que retorne o país com maior população no continente;
 * Um método que retorne o país com menor população no continente;
 * Um método que retorne o país de maior dimensão territorial no continente;
 * Um método que retorne o país de menor dimensão territorial no continente;
 * Um método que retorne a razão territorial do maior pais em relação ao menor
 * país.
 * 
 *****************************************************************************/
package exercicio03;

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
    private long populacao;
    
    
    /*************************************************************************
     *Constructor 
     ************************************************************************/
    public Pais(String nome, String capital, double km2, long populacao) {
        this.nome = nome;
        this.capital = capital;
        this.km2 = km2;
        this.populacao = populacao;
    }

    /*************************************************************************
     *Methods 
     ************************************************************************/
    public boolean equals(final Pais outro){
        return this.nome.equals(outro.nome) && this.capital.equals(outro.capital);
    }
    
    @Override
    public String toString(){
        return "NOME: " + this.nome + "\nCAPITAL: " + this.capital + "\nKM2: " + 
                this.km2 + "\nPOPULAÇÃO: " + this.populacao;
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
    
    public long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }
}
