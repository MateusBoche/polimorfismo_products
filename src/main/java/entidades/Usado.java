package entidades;

public class Usado extends Produto {
    private String data;


    public Usado(String data) {
        this.data = data;
    }

    public Usado(String nome, double preco, String data) {
        super(nome, preco);
        this.data = data;
    }

    @Override
    public String precotag(){
        return "nome: " +super.getNome()  +"\n" + "preco: " + super.getPreco() +"\n" +"data de manufatura: " + data;
    }
}
