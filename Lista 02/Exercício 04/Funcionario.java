/*****************************************************************************
 * 
 * Escreva uma classe “Funcionário” com os atributos matricula (int), 
 * nome (String), departamento (int), salário (float) e função (String).
 * Adicione na classe um construtor que receba todos os parâmetros para 
 * inicializar os dados de um funcionário.
 * 
 ****************************************************************************/
package lista.de.exercícios.pkg02;

/**
 *
 * @author CaetanoMatheus
 */
public class Funcionario {

    /*************************************************************************
     * Attributes
     ************************************************************************/
    private int matricula;
    private String nome;
    private int departamento;
    private float salario;
    private String funcao;
    
    /*************************************************************************
     * Constructor
     ************************************************************************/
    public Funcionario(int matricula, String nome, int departamento,
            float salario, String funcao){
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.funcao = funcao;
    }
}
    
