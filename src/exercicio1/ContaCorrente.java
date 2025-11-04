package exercicio1;


public class ContaCorrente {

    //Atributo
    private double depositar;
    private double sacar;
    private double saldo;
    
    //Constructor
    public ContaCorrente(double depositar, double sacar, double saldo) {
        setDepositar(depositar);
        setSacar(sacar);
        setSaldo(saldo);
    } 
    
    //Metodos
    public double getDepositar() {
        return this.depositar;
    }
    
    public void setDepositar(double depositar) {
        this.depositar = (depositar > 0) ? depositar: 0;
    }
    
    public double getSacar() {
        return this.sacar;
    }
    
    public void setSacar(double sacar) {
        this.sacar = (sacar > 0) ? sacar: 0;
    }
    
    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = (saldo > 0) ? saldo: 0;
    }
    
    public double saldoAtual() {
        return (this.depositar - this.sacar + this.saldo) * 0.995;
    }
    
    @Override
    public String toString() {
        return String.format("%s: %.2f\n%s: %.2f\n%s: %.2f\n%s: %.2f",
                "Deposito", depositar,
                "Saque", sacar,
                "Saldo Anterior", saldo,
                "Saldo Atual", saldoAtual());
    }
}
