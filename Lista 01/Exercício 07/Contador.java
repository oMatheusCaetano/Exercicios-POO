/*****************************************************************************
 * Escreva em Java uma classe Contador, que encapsule um valor usado para
 * contagem de itens ou eventos. A classe deve oferecer métodos que devem:
 *
 * > Zerar;
 * > Incrementar;
 * > Retornar o valor do contador.
 *
 *************************************************************************** */
/**
 *
 * @author CaetanoMatheus
 */
public class Contador {

    //Attribute
    private int contador;

    //Methods
    public void zerarContador() {
        this.contador = 0;
    }

    public void incrementarContador(int quantidade) {
        this.contador += quantidade;
    }

    //Get
    public int getContador() {
        return contador;
    }
}