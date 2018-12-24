/** ***************************************************************************
 *
 * A fim de representar empregados em uma firma, crie uma classe chamada
 * Empregado que inclui as três informações a seguir como atributos:
 *
 * > um primeiro nome
 * > um sobrenome
 * > um salário mensal.
 *
 * Sua classe deve ter um construtor que inicializa os três atributos.
 * Forneça um método set e get para cada atributo. Se o salário mensal não for
 * positivo, configure-o como 0.0. Crie um método que exiba o salário anual
 * e um que dê 10% de aumento no salário.
 *
 *************************************************************************** */
/**
 *
 * @author CaetanoMatheus
 */
public class Empregado {

    // Attributes
    private String primeiroNome;
    private String sobrenome;
    private double salario;

    // Constructor
    public Empregado(String primeroNome, String sobrenome, double salario) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.salario = salario;

        if (this.salario < 0) {
            this.salario = 0;
        }
    }

    // Methods
    public void exibirSalarioAnual() {
        System.out.println("NOME: " + this.primeiroNome + " " + this.sobrenome
                + "\nSALÁRIO: R$" + (this.salario * 12));
    }

    public void aumentoSalarial() {
        this.salario += (this.salario * 10 / 100);
    }

    // Getters and Setters
    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
