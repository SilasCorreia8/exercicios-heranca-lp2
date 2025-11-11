
package exercicio3;

public class Funcionario {
    
    //Atributos
    private String nome;
    private double salario;
    private int aumento;
    
    //Constructor
    public Funcionario(String nome, double salario, int aumento) {
        this.nome = nome;
        setSalario(salario);
        setAumento(aumento);
    }
    
    //Metodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = (salario < 0) ? 0: salario;
    }

    public int getAumento() {
        return aumento;
    }

    public void setAumento(int aumento) {
        this.aumento = (aumento < 0) ? 0: aumento;
    }
    
    //Calculo para aumento salarial
    public double aumentoSalarial(double aument) {
        return this.salario = (this.salario * (1+(aument/100))); 
    }
    
    //Calculo para salario anual
    public double salarioAnual() {
        return getSalario() * 13;
    }

    @Override
    public String toString() {
        return String.format("%s: %s\n%s: %.2f\n%s: %s\n%s: %.2f\n%s: %.2f",
                "Nome", this.nome,
                "Salario", this.salario,
                "Aumento", this.aumento,
                "Salario Atualizado", aumentoSalarial(getAumento()),
                "Salario Anual", salarioAnual());
    }
    
    
    
}
