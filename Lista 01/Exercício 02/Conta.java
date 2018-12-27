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

import java.util.ArrayList;

/**
 *
 * @author CaetanoMatheus
 */
public class Conta {
 
    /*************************************************************************
     * Attributes
     ************************************************************************/
    private String numero;
    private double saldo;
    private boolean status;
    private double limite;
    private double limiteInicial;
    private ArrayList<Movimentacao> m = new ArrayList();
    
    /*************************************************************************
     * Constructor
     ************************************************************************/
    public Conta(String numero, double saldo, double limite, boolean status){
        this.numero = numero;
        this.saldo = Math.abs(saldo);
        this.limite = Math.abs(limite);
        this.limiteInicial = Math.abs(limite);
        this.status = status;
        
        if(this.status = false)
            this.limite = 0;
       
    }
    /*************************************************************************
     * Methods
     ************************************************************************/
    public void novaMovimentacao(String descricao, String tipo, double valor){
        m.add(new Movimentacao(descricao, tipo, valor));
    }
    
    @Override
    public String toString(){
        return "NÚMERO: " + this.numero + "\nESPECIAL: " + this.status +
                "\nLIMITE: R$" +this.limite + "\nSALDO: R$" + this.saldo;           
    }
    
    public String emitirExtrato(){
        StringBuilder s = new StringBuilder();
        for(Movimentacao m : this.m){
            s.append(m.toString());
            System.out.println();
        }
        return s.toString();
    }
    /*************************************************************************
     * Getters and Setters
     ************************************************************************/
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public double getLimiteInicial() {
        return limiteInicial;
    }

    public void setLimiteInicial(double limiteInicial) {
        this.limiteInicial = limiteInicial;
    }
}
