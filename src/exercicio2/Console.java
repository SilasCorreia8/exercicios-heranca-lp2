
package exercicio2;

public class Console extends Jogos{

    private String marca;
    private double tamanhoGB;

    public Console(String nome, int classificacao, double desconto, double preco,
            String marca, double tamanhoGB) {
        
        super(nome, classificacao, desconto, preco);
        this.marca = marca;
        setTamanhoGB(tamanhoGB);
        
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanhoGB() {
        return tamanhoGB;
    }

    public void setTamanhoGB(double tamanhoGB) {
        this.tamanhoGB = (tamanhoGB < 0) ? 0: tamanhoGB;
    }

    public double calculaPrecoTotal() {
        return super.calcPrecoTotal();
    }
    
    @Override
    public String toString() {
        
        return String.format("%s \n%s\n%s: %s\n%s: %.1f", 
                "Jogo",
                super.toString(),
                "Marca", marca,
                "Tamanho(GB)", tamanhoGB);
        
    }
    
    
    
}
