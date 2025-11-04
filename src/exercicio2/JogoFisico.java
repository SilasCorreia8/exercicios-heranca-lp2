package exercicio2;

public class JogoFisico extends Jogos{

    private int tempoEntrega;
    
    public JogoFisico(String nome, int classificacao, double desconto,
            double preco, int tempoEntrega) {
        
        super(nome, classificacao, desconto, preco);
        this.tempoEntrega = tempoEntrega;
        
    }

    public int getTempoEntrega() {
        return tempoEntrega;
    }

    public void setTempoEntrega(int tempoEntrega) {
        this.tempoEntrega = (tempoEntrega < 0) ? 0: tempoEntrega;
    }   
    
    @Override
    public double calcPrecoTotal() {
        return super.calcPrecoTotal() + 20;
    }

    @Override
    public String toString() {
        return String.format("%s \n%s: %s", 
                super.toString(),
                "Tempo de Entrega", tempoEntrega); 
    }
    
    
    
}
