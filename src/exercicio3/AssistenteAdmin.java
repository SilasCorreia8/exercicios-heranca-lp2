
package exercicio3;

public class AssistenteAdmin extends Funcionario {
    
    private String turno;
    private double adicionalNot;

    public AssistenteAdmin(String nome, double salario, int aumento, 
            String turno, double adicionalNot) {
        
        super(nome, salario, aumento);
        this.turno = turno;
        this.adicionalNot = adicionalNot;
        
    }

    //Metodos
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getAdicionalNot() {
        return adicionalNot;
    }

    public void setAdicionalNot(double adicionalNot) {
        this.adicionalNot = adicionalNot;
    }
    
    @Override
    public double aumentoSalarial(double salario) {
        return super.aumentoSalarial(salario) + getAdicionalNot();
    }
    
    @Override
    public double salarioAnual() {
        return ( super.getSalario() + getAdicionalNot() ) * 13;
    }
 
    @Override
    public String toString() {
        
        return String.format("%s \n%s: %s \n%s: %.2f", 
                super.toString(),
                "Turno", turno,
                "Adicional Noturno", adicionalNot);
        
    }
    
}
