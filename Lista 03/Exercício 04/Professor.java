/*****************************************************************************
 * 
 * Defina uma classe Professor com os dados: nome do professor, nome do 
 * departamento, data de admissão, número de registro. Inclua na classe um 
 * construtor para setar os dados e um método para imprimir o conteúdo
 *
 ****************************************************************************/

import java.util.Date;

/**
 *
 * @author CaetanoMatheus
 */
public class Professor {
    
    /*************************************************************************
     * Atributes
     ************************************************************************/
    private String nome;
    private String departamento;
    private Date admissao;
    private int registro;

    /*************************************************************************
     * Constructor
     ************************************************************************/
    public Professor(String nome, String departamento, Date admissao, int registro) {
        this.nome = nome;
        this.departamento = departamento;
        this.admissao = admissao;
        this.registro = registro;
    }
    
    /*************************************************************************
     * Method
     ************************************************************************/
    public void imprimeConteudo(){
        StringBuilder s = new StringBuilder();
        s.append("NOME: ");
        s.append(this.nome);
        s.append("\nDEPARTAMENTO: ");
        s.append(this.departamento);
        s.append("\nADMISSÃO: ");
        s.append(this.admissao);
        s.append("\nREGISTRO: ");
        s.append(this.registro);
        
        System.out.println(s.toString());
    }
    
}
