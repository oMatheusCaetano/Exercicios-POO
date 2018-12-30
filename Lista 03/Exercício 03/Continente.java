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
public class Continente {
    
    /*************************************************************************
     * Attributes
     ************************************************************************/
    private String nome;
    private ArrayList<Pais> p = new ArrayList();    
    
    /*************************************************************************
     * Constructor
     ************************************************************************/
    public Continente(String nome) {
        this.nome = nome;
    }
    
    /*************************************************************************
     * Methods
     ************************************************************************/
    public boolean adicionarPais(Pais pais){
        for(Pais a : this.p){
            if(a.equals(pais)){
                return false;
            }
        }
        this.p.add(pais);
        return true;
    }
    
    public double dimensaoTotal(){
        double a = 0;
        for(Pais b : this.p){
            a += b.getKm2();
        }
        return a;
    }
    
    public long populacaoTotal(){
        long a = 0;
        for(Pais b : this.p){
            a += b.getPopulacao();
        }
        return a;
    }
    
    public double densidadePopulacional(){
        double densidade = (double) populacaoTotal() / dimensaoTotal();
        return densidade;
    }
    
    public Pais maiorPopulacao(){
        Pais a = this.p.get(0);
        for(Pais b : this.p){
            if(b.getPopulacao() > a.getPopulacao())
                a = b;
        }
        return a;
    }
    
    public Pais menorPopulacao(){
        Pais a = this.p.get(0);
        for(Pais b : this.p){
            if(b.getPopulacao() < a.getPopulacao())
                a = b;
        }
        return a;
    }
    
    public Pais maiorDimensao(){
        Pais a = this.p.get(0);
        for(Pais b : this.p){
            if(b.getKm2() > a.getKm2())
                a = b;
        }
        return a;
    }
    
    public Pais menorDimensao(){
        Pais a = this.p.get(0);
        for(Pais b : this.p){
            if(b.getKm2() < a.getKm2())
                a = b;
        }
        return a;
    }
    
    public double razaoTerritorial(){
        double razao = maiorDimensao().getKm2() / menorDimensao().getKm2();
        return razao;
    }
}