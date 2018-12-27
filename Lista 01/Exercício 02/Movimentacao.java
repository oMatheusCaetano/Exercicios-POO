/*****************************************************************************
 * 
 * Implemente em Java classes, atributos e métodos necessários para implementar:
 * 
 * a) Uma conta corrente que possui um número, um saldo, um status que informa
 *    se ela é especial ou não, um limite e um conjunto de movimentações.
 * b) Uma movimentação que possui uma descrição, um valor e uma informação se
 *    ela é uma movimentação de crédito ou débito.
 * c) Um banco que armazene um conjunto de contas e forneça métodos que permitam
 *    que sejam feitos criações de conta, exclusão de contas, saques (uma conta
 *    corrente só pode fazer saques desde que o valor não exceda o limite de
 *    saque‐limite + saldo negativo), depósitos, emissão de saldo e extrato e
 *    transferência entre contas.
 * 
 ****************************************************************************/
package exercicio02;

/**
 *
 * @author CaetanoMatheus
 */
public class Movimentacao {
    
    /*************************************************************************
     * Attributes
     ************************************************************************/
    private String descricao;
    private String tipo;
    private double valor;
    
    /*************************************************************************
     * Constructor
     ************************************************************************/
    public Movimentacao(String descricao, String tipo, double valor) {
        this.descricao = descricao;
        this.tipo = tipo;
        this.valor = valor;
    }
    
    @Override
    public String toString(){
        return "DESCRIÇÃO: " + this.descricao + "\nTIPO: " + this.tipo +
                "\nVALOR: R$" +this.valor;
    }
    
    /*************************************************************************
     * Getters and Setters
     ************************************************************************/
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
