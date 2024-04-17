package atividade.alura.pessoas;

public class Pessoa {
    private String Nome;
    private int Idade;

    public Pessoa(String Nome, int Idade) {
        this.Nome = Nome;
        this.Idade = Idade;
    }

    @Override
    public String toString() {
        return "Nome: " + Nome + " Idade: " + Idade;
    }
}
