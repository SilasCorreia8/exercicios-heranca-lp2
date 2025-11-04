package exercicio1;


import exercicio1.ContaCorrente;


public class ContaVip extends ContaCorrente {
    
    //Constructor
    public ContaVip(double depositar, double sacar, double saldo) {
        super(depositar, sacar, saldo);
    }
    
    @Override
    public double saldoAtual() {
        return (super.getDepositar() - super.getSacar() + super.getSaldo()) * 0.999;
    }
    
    @Override
    public String toString() {
        return String.format("%s",
                super.toString());
    }
    
}
