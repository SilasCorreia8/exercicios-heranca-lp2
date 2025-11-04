package exercicio2;

public class JogoDigital extends Jogos{
    
    private String plataforma;
    private double tamanhoDow;
    
    public JogoDigital(String nome, int classificacao, double desconto,
            double preco, String plataforma, double tamanhoDow) {
        
        super(nome, classificacao, desconto, preco);
        this.plataforma = plataforma;
        setTamanhoDow(tamanhoDow);
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getTamanhoDow() {
        return tamanhoDow;
    }

    public void setTamanhoDow(double tamanhoDow) {
        this.tamanhoDow = (tamanhoDow < 0) ? 0: tamanhoDow;
    }
    
    @Override
    public double calcPrecoTotal() {
        
        return super.calcPrecoTotal();
        
    }
    
    @Override
    public String toString() {
        
        return String.format("%s \n%s: %s\n%s: %.1f", 
                super.toString(),
                "Plataforma", plataforma,
                "Download (GB)", tamanhoDow);
        
    }
    
}
