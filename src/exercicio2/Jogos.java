
package exercicio2;


public class Jogos {
    
    private String nome;
    private int classificacao; //Idade Permitida
    private double desconto;
    private double preco;
    
    public Jogos(String nome, int classificacao, double desconto, double preco) {
        this.nome = nome;
        setClassificacao(classificacao);
        setDesconto(desconto);
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = (classificacao < 0) ? 0: classificacao;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = (desconto < 0) ? 0: desconto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = (preco < 0) ? 0: preco;
    }
    
    //Metodo
    public double calcPrecoTotal() {
        return preco - (preco * desconto/100);
    }
    
    @Override
    public String toString() {
        
        return String.format("%s: %s\n%s: %s\n%s: %.0f%s\n%s: %.2f\n%s: %.2f",
                "Nome", nome,
                "Classificação", classificacao,
                "Desconto", desconto,"%",
                "Preço", preco,
                "Total", calcPrecoTotal());
        
    }
    
}
