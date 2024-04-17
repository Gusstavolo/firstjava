package atividade.alura.pessoas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Crie uma classe Pessoa com atributos como nome, idade, e um método toString que represente esses atributos.
        No método main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.
        Adicione pelo menos três pessoas à lista utilizando o método add.
        Imprima o tamanho da lista utilizando o método size.
        Imprima a primeira pessoa da lista utilizando o método get.
        Imprima a lista completa */

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa("Goku", 18);
        Pessoa pessoa2 = new Pessoa("Rodrigo", 30);
        Pessoa pessoa3 = new Pessoa("Manu", 17);

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + pessoas.size());
        System.out.println("Primeira Pessoa da lista: " + pessoas.get(0));

        System.out.println("Lista de Pessoas:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}
