package atividade.alura.produtos;

import atividade.alura.pessoas.Pessoa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<>();
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Produto C", 12.75, 2, "2023-12-31");

        Produto produto1 = new Produto("leite",22.50,5, "22");
        Produto produto2 = new Produto("acuca",21.00,10, "22");
        Produto produto3 = new Produto("biscoito",2.50,3, "23");

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        System.out.println("Quantidade de produtos: " + produtos.size());
        System.out.println("Lista de Produtos: ");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
        System.out.println("Primeiro produto: " + produtos.get(0));

        System.out.println(produtoPerecivel);
    }
}
