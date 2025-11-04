package exercicio2;

public class JogoDigital extends Jogos{
    
    private String plataforma;
    private int tamanhoDow;
    
    public JogoDigital(String nome, int classificacao, double desconto,
            double preco, String plataforma, int tamanhoDow) {
        
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

    public int getTamanhoDow() {
        return tamanhoDow;
    }

    public void setTamanhoDow(int tamanhoDow) {
        this.tamanhoDow = (tamanhoDow < 0) ? 0: tamanhoDow;
    }
    
    @Override
    public double calcPrecoTotal() {
        
        return super.calcPrecoTotal();
        
    }
    
    public String toSting() {
        
        return String.format("%s \n%s: %s\n%s: %s\n%s: %.2f", 
                super.toString(),
                "Plataforma", plataforma,
                "Download (GB)", tamanhoDow,
                "Total a Pagar", calcPrecoTotal());
        
    }
    
}
