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
public class Banco {
    
    /*************************************************************************
     * Attributes
     ************************************************************************/
    private ArrayList<Conta> c = new ArrayList();
    private boolean trasferidor;
    private boolean recebedor;
    
    /*************************************************************************
     * Constructor
     ************************************************************************/
    
    /*************************************************************************
     * Methods
     ************************************************************************/
    public boolean abrirConta(String numero, double saldo, double limite, boolean status){
        for(Conta a :c){
            if(a.getNumero().equals(numero))
                return false;
        }
        c.add(new Conta(numero, saldo, limite, status));  
        return true;
    }    
    
    public boolean excluirConta(String numero){
        for(Conta a : c) {
            if(a.getNumero().equals(numero)){
                c.remove(a);
                return true;
            }
        }
        return false;
    }
    
    public boolean efetuarSaque(String numero, double valor){
        for(int i = 0; i < c.size(); i++){
            if(c.get(i).getNumero().equals(numero)){
                if(c.get(i).isStatus() == false){
                    if(c.get(i).getSaldo() < valor)
                        return false;
                    else {
                        c.get(i).setSaldo(c.get(i).getSaldo() - valor);
                        this.c.get(i).novaMovimentacao("Descrição...", "Saque", valor);
                        return true;
                    }
                } else {
                    if(c.get(i).getSaldo() + c.get(i).getLimite() < valor)
                        return false;
                    else {
                        c.get(i).setSaldo(c.get(i).getSaldo() - valor);
                        if(c.get(i).getSaldo() < 0) {
                            c.get(i).setLimite(c.get(i).getLimite() - Math.abs(c.get(i).getSaldo()));
                            c.get(i).setSaldo(0);
                            this.c.get(i).novaMovimentacao("Descrição...", "Saque", valor);
                            return true;
                        } else {
                            c.get(i).setSaldo(c.get(i).getSaldo() - valor);
                            this.c.get(i).novaMovimentacao("Descrição...", "Saque", valor);
                            return true;
                        }
                        
                    }
                }
            }
        }
        return false;
    }
    
    public boolean efetuarDeposito(String numero, double valor){
        for(int i = 0; i < this.c.size(); i++){
            if(this.c.get(i).getNumero().equals(numero)){
                this.c.get(i).setSaldo(this.c.get(i).getSaldo() + valor);
                if(this.c.get(i).getSaldo() < 0){
                    this.c.get(i).setLimite(this.c.get(i).getLimite() + this.c.get(i).getSaldo());
                    this.c.get(i).novaMovimentacao("Descrição...", "Depósito", valor);
                    return true;
                } else {
                    this.c.get(i).setLimite(this.c.get(i).getLimiteInicial());
                    this.c.get(i).novaMovimentacao("Descrição...", "Depósito", valor);
                    return true;
                }
            }
        }
        return false;
    }
    
    public String emitirSaldo(String numero){
        for(Conta a : this.c){
            if(a.getNumero().equals(numero)){
                return a.toString();
            }
        }
        return "Conta não encontrada.";
    }
    
    public String emitirExtrato(String numero){
         for(Conta a : this.c){
            if(a.getNumero().equals(numero)){
                return a.emitirExtrato();
            }
        }    
         return "Conta não encontrada.";
    }
    
    public boolean efetuarTrasnferencia(String trasferidor, String recebedor, double valor){
        this.recebedor = false;
        this.trasferidor = false;
        for(int i = 0; i < this.c.size(); i++){
            if(this.c.get(i).getNumero().equals(trasferidor)){
                this.trasferidor = true;
            }
            if(this.c.get(i).getNumero().equals(recebedor)){
                this.recebedor = true;
            }
            if(this.trasferidor == true && this.recebedor == true){
                efetuarSaque(trasferidor, valor);
                efetuarDeposito(recebedor, valor);
                return true;
                
            }
        }
        return false;
    }
}