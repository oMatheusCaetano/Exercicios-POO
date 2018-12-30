/******************************************************************************
 * 
 * Um avião é representado pelo seu prefixo, pelo nome do seu modelo, pelo nome
 * do seu fabricante, pela quantidade de assentos e pela quantidade de assentos
 * ocupados. Escreva uma classe que represente um avião e desenvolva um método
 * que informe qual o prefixo da aeronave.
 * 
 * Um aeroporto é representado pelo seu código e seu nome (ex.: SSA: Salvador,
 * BSB: Brasília. etc), por um status que informa se ele é um aeroporto 
 * internacional ou não, uma lista de outros aeroportos para os quais partam 
 * vôos diretos à partir dele e uma lista de outros aeroportos de onde venham
 * vôos para ele. Além disto possui uma lista de aviões que estão atualmente 
 * no pátio.Escreva uma classe que contemple os atributos apresentados e mais
 * os seguintes membros: 
 * Um construtor que inicialize o código do aeroporto e seu nome.
 * Métodos que verifiquem e alterem a situação relativa ao fato do aeroporto 
 * ser internacional ou não.
 * Um método que verifique e informe se um aeroporto é igual a ele:
 * public boolean equals (Aeroporto aeroposto)
 * Dois aeroportos são iguais se o seu código for coincidente.
 * Um método que receba um prefixo de avião como parâmetro e informe se a 
 * aeronave está pousada nele.
 * Um método que receba um outro aeroporto como parâmetro e verifique se
 * existe alguma forma de se chegar nele. Para isto, o aeroporto deve
 * verificar se ele possui vôo partindo para o aeroporto desejado, e caso não
 * saia, se existe alguma forma de chegar nele à partir dos aeroportos de onde
 * sai
 * public boolean possuiRota(Aeroporto aeroporto)
 * 
 * Obs: A quantidade máxima de aeronaves que um aeroporto pode ter em terra é 
 * igual a 100 e a quantidade máxima de outros aeroportos com os quais o 
 * aeroporto pode ter linhas saindo e chegando é 100.
 * 
 ****************************************************************************/
package exercicio06e07;

import java.util.ArrayList;

/**
 *
 * @author CaetanoMatheus
 */
public class Aeroporto {
    
    /**************************************************************************
     * Attributes
     *************************************************************************/
    private final String codNome;
    private boolean internacional;
    private Aeroporto[] go = new Aeroporto[100];
    private Aeroporto[] arrive = new Aeroporto[100];
    private Aviao[] avioesNoPatio = new Aviao[100];

    /**************************************************************************
     * Attributes
     *************************************************************************/
    public Aeroporto(String codNome, boolean internacional) {
        this.codNome = codNome;
        this.internacional = internacional;
    }
    
    /**************************************************************************
     * Methods
     *************************************************************************/
     public boolean equals(Aeroporto outro){
        return this.codNome.equals(outro.codNome);
    }
    
    public boolean aviaoPousado(Aviao aviao){
        for(Aviao a: this.avioesNoPatio){
            if(a.getPrefixo().equals(aviao.getPrefixo()))
                return true;
        }
        return false;
    }
    
    public boolean possuiRota(Aeroporto aeroporto){
        for(Aeroporto a : aeroporto.arrive){
            if(a.equals(this))
                return true;
        }
        
        for(int i = 0; i < aeroporto.arrive.length; i++){
            if(aeroporto.arrive[i].arrive[i].equals(this))
                return true;
        }
        
        return false;
    }
    
    /**************************************************************************
     * Getters and Setters
     *************************************************************************/
    public void setInternacional(boolean internacional){
        this.internacional = internacional;
    }
    
    public boolean getInternacional(){
        return this.internacional;
    }  

    public String getCodNome() {
        return codNome;
    }
}
