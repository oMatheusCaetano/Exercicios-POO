/*****************************************************************************
 * Crie uma classe chamada Invoice que possa ser utilizado por uma loja de 
 * suprimentos de informática para representar uma fatura de um item vendido 
 * na loja. Uma fatura deve incluir as seguintes informações como atributos
 * 
 * > número do item faturado, 
 * > descrição do item, 
 * > quantidade comprada do item
 * > preço unitário do item.
 * 
 * Sua classe deve ter um construtor que inicialize os quatro atributos. 
 * Se a quantidade não for positiva, ela deve ser configurada como 0. 
 * Se o preço por item não for positivo ele deve ser configurado como 0.0.
 * Forneça um método set e um método get para cada variável de instância.
 * Além disso, forneça um método chamado getInvoiceAmount que calcula o valor
 * da fatura (isso é, multiplica a quantidade pelo preço por item) e depois
 * retorna o valor como um double.
 ****************************************************************************/

/**
 *
 * @author CaetanoMatheus
 */
public class Invoice {
    
    //Attributes
    private String itemFaturado;
    private String descricao;
    private short quantidade;
    private double preco;

    //Constructor
    public Invoice(String itemFaturado, String descricao, short quantidade, 
            double preco){
        this.itemFaturado = itemFaturado;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
        
        if (this.quantidade < 0)
            this.quantidade = 0;
        if (this.preco < 0)
            this.preco = 0;
    }
    
    //Methods
    public double getInvoiceAmount(){
        return this.preco * this.quantidade;
    }
        
    //Getters and Setters
    public String getItemFaturado() {
        return itemFaturado;
    }

    public void setItemFaturado(String itemFaturado) {
        this.itemFaturado = itemFaturado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public short getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(short quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
}