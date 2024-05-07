package entidades;

public class Importado extends Produto{
    private double taxa;

    public Importado(double taxa) {
        this.taxa = taxa;
    }

    public Importado(String nome, double preco, double taxa) {
        super(nome, preco);
        this.taxa = taxa;
    }

    public double totalPreco(){
        return super.getPreco() + taxa;
    }

    @Override
    public String precotag(){
        return "nome: " + super.getNome() +"\n" + "preco: " + totalPreco() +"\n" +"taxa: " + taxa;
    }

}
