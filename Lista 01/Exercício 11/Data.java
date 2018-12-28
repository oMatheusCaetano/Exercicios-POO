/*****************************************************************************
 * 
 * Crie uma classe para representar datas. Represente uma data usando três
 * atributos: o dia, o mês, e o ano. Sua classe deve ter um construtor que
 * inicializa os três atributos e verifica a validade dos valores fornecidos.
 * Forneça um construtor sem parâmetros que inicializa a data com a data atual
 * fornecida pelo sistema operacional. Forneça um método set um get para cada 
 * atributo. Forneça o método toString para retornar uma representação da data
 * como string. Considere que a  data deve ser formatada mostrando o dia, o mês
 * e o ano separados por barra (/). Forneça uma operação para avançar 
 * uma data para o dia seguinte.
 * 
 *****************************************************************************/
package exercicio11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author CaetanoMatheus
 */
public class Data {
    
    /*************************************************************************
     * Attributes
     ************************************************************************/
    private int dia;
    private int mes;
    private int ano;
    private boolean bissexto;

    /*************************************************************************
     * Constructor
     ************************************************************************/
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        
        if(validarData() == false){
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }
    }
    
    public Data(){
        Calendar data = Calendar.getInstance();
        Date d = data.getTime();
        this.dia = d.getDate();
        this.mes = d.getMonth();
        this.ano = d.getYear();
    }
    
    /*************************************************************************
     * Methods
     ************************************************************************/
    private boolean validarBissexto(){
        if(this.ano % 4 == 0) {
            if(this.ano % 100 != 0)
                return true;
            else {
                if(this.ano % 400 == 0)
                    return true;
            }
        }
        return false;
    }
    
    private boolean validarData(){
        if(this.dia < 1 || this.dia > 31)
            return false;
        if(this.mes < 1 || this.mes > 12)
            return false;
        if(this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11 && 
                this.dia > 30)
            return false;
        if(this.mes == 2){
            if(validarBissexto() == false && this.dia > 28)
                return false;
            else if(validarBissexto() == true && this.dia > 29)
                return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
    
    public void avancarData(){
        this.dia++;
    }
            
    /*************************************************************************
     * Getters and Setters
     ************************************************************************/
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
            
            
            
            
            
            
            
            
            
            
            
            
    
}
