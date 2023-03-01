
public class Produto {
	private int codigo;
	private String nome;
	private int preco;
	

	public Produto(int codigo, String nome, int preco) {
	super();
	this.codigo = codigo;
	this.nome = nome;
	this.preco = preco;
}

	public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getPreco() {
	return preco;
}

public void setPreco(int preco) {
	this.preco = preco;
}

	public boolean equals(Object obj) {
		if (obj instanceof Produto) {
			Produto outro = (Produto)obj;
			return this.codigo == outro.codigo && this.nome.equals(outro.nome)&& this.preco == outro.preco; 
		}
		return false;
	}

	public int hashCode() {
		return this.codigo;
	}
}