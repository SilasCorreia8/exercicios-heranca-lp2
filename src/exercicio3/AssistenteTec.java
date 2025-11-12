
package exercicio3;

public class AssistenteTec extends Funcionario{
    
    private double bonus;
    private int matricula;

    public AssistenteTec(String nome, double salario, int aumento,
            double bonus, int matricula) {

        super(nome, salario, aumento);
        setBonus(bonus);
        this.matricula = matricula;
        
    }
    
    //Metodos
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = (bonus < 0 ) ? 0: bonus;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public double aumentoSalarial(double salario) {
        return super.aumentoSalarial(salario) + getBonus();
    }
    
    @Override
    public double salarioAnual() {
        return ( super.getSalario() * 13) + getBonus();
    }
    
    @Override
    public String toString() {
        
        return String.format("%s \n%s: %.2f \n%s: %s",
                super.toString(),
                "Bonus", bonus,
                "Matricula", matricula);
        
    }
     
}
