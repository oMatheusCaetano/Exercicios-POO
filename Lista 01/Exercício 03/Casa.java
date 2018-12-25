/*****************************************************************************
 * 
 * Traduza o seguinte conjunto de classes em um programa Java. 
 * Importante: Não são permitidas chamadas a System.in, System.out ou similares 
 * de dentro das classes criadas
 * 
 * a) Classe: Porta Atributos: aberta, cor, dimensaoX, dimensaoY, 
 * dimensaoZ  Métodos: void abre(), void fecha(), void pinta(String s), 
 * boolean estaAberta().
 * 
 * b) Classe: Casa  Atributos: cor, porta1, porta2, porta3 Método: 
 * void pinta(String s), totalDePortas() int quantasPortasEstaoAbertas() int.
 * 
 * c) Classe: Edificio  Atributos: cor, totalDePortas, totalDeAndares, 
 * portas[] Métodos: void pinta(String s), int quantasPortasEstaoAbertas(), 
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

/**
 *
 * @author CaetanoMatheus
 */
public class Casa extends Imovel {

    
    //Attributes
    private Porta porta1 = new Porta();
    private Porta porta2 = new Porta();
    private Porta porta3 = new Porta();
    private int cont;
    
    //Methods
    @Override
    public int quantasPortasEstaoAbertas() {
       this.cont = 0;
       
       if(this.porta1.estaAberta() == true)
           this.cont ++;
       if(this.porta2.estaAberta() == true)
           this.cont ++;
       if(this.porta3.estaAberta() == true)
           this.cont ++;
       
       return this.cont;
    }

    @Override
    public int totalDePortas() {
        return 3;
    }
    
}
