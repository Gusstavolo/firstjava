package atividade.alura.produtos;

public class Produto {
    private String nome;
    private Double preco;
    private int quantidade;

    public Produto(String nome,Double preco,int quantidade, String dataValidade ){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    @Override
    public String toString() {
        return "Produto: " + nome + " Preço: " + preco + " Quantidade: " + quantidade;
    }
}
