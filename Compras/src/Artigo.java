
public class Artigo {

	public String nome;
    public double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Artigo() {
    }

    public Artigo(String nome, double preco) {
        // TODO Auto-generated constructor stub
        this.nome = nome;
        this.preco = preco;
    }

    public void setpreco(double preco) {
        this.preco = preco;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }


}
