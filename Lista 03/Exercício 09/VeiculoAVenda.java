
import java.util.Date;

/*****************************************************************************
 * 
 *
 * Escreva uma classe VeiculoAVenda que represente informações básicas sobre um
 * veículo genérico que esteja à venda, como tipo, ano e preçoDeVenda, com um 
 * construtor para inicializar estes valores e um método toString adequado.
 * Escreva também um enumerador para os diversos tipos de veículos (automóveis,
 * caminhões, motocicletas, etc.). 
 * 
 * /


/**
 *
 * @author CaetanoMatheus
 */
public class VeiculoAVenda {
    
    /**************************************************************************
     * Attributes
     *************************************************************************/
    private String cor;
    private String modelo;
    private String tipo;
    private Date ano;
    private float precoDeVenda;
    private byte tipoDeVeoculo;

     /*************************************************************************
     * Constructor 
     *************************************************************************/
    public VeiculoAVenda(String cor, String modelo, String tipo, Date ano, 
            float precoDeVenda) {
        this.cor = cor;
        this.modelo = modelo;
        this.tipo = tipo;
        this.ano = ano;
        this.precoDeVenda = precoDeVenda;
    }

    /*************************************************************************
     * Methods 
     *************************************************************************/
    @Override
    public String toString() {
        return "VeiculoAVenda{" + "cor=" + cor + ", modelo=" + modelo + ", "
                + "tipo=" + tipo + ", ano=" + ano + ", precoDeVenda=" 
                + precoDeVenda + '}';
    }
    
    
}
