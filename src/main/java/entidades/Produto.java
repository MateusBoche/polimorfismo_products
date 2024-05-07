package entidades;

public class Produto {
    private String nome;
    private double preco;


    public Produto(){

    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String precotag(){
        return "nome: " + nome +"\n" + "preco: " + preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
