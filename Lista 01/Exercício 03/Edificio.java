/*****************************************************************************
 * 
 * Traduza o seguinte conjunto de classes em um programa Java. 
 * Importante: Não são permitidas chamadas a System.in, System.out ou similares 
 * de dentro das classes criadas
 * 
 * a) Classe: Porta  Atributos: aberta, cor, dimensaoX, dimensaoY, 
 * dimensaoZ Métodos: void abre(), void fecha(), void pinta(String s), 
 * boolean estaAberta().
 * 
 * b) Classe: Casa  Atributos: cor, porta1, porta2, porta3 Método: 
 * void pinta(String s), totalDePortas() int quantasPortasEstaoAbertas() int.
 * 
 * c) Classe: Edificio  Atributos: cor, totalDePortas, totalDeAndares, 
 * portas[] : Métodos: void pinta(String s), int quantasPortasEstaoAbertas(), 
 * void adicionaPorta(Porta p), int totalDePortas(), void adicionarAndar(),
 * int totalDeAndares().
 * 
 * d) As classes Casa e edifício ficaram muito parecidas. 
 * Crie a classe Imovel e coloque nela tudo o Casa e Edificio tem em comum. 
 * Faça Imovel superclasse de Casa e Edificio. Note que alguns métodos em 
 * comum não poderão ser implementados por Imovel (quantasPortasEstaoAbertas 
 * e totalDePortas). Logo, esses deverão ser declarados como métodos abstratos.
 *
 * **************************************************************************/
package exercicio03;

import java.util.ArrayList;

/**
 *
 * @author CaetanoMatheus
 */
public class Edificio extends Imovel {
    
    //Attributes
    private ArrayList<Porta> portas = new ArrayList();
    private int totalDePortas = portas.size();
    private int totalDeAndares = 1;
    private int cont;
    
    
    //Methods
    @Override
    public int quantasPortasEstaoAbertas(){         
        for (Porta p : portas) {
            if(p.estaAberta() == true)
                this.cont++;
        }
        return this.cont;
    }

    public void adicionaPorta(Porta p){
        this.portas.add(p);
    }
    
    @Override
    public int totalDePortas() {
        return this.totalDePortas;
    }
    
    public void adicionarAndar(){
        this.totalDeAndares += 1;
    }
    
    public int totalDeAndares(){
        return this.totalDeAndares;
    }
}
