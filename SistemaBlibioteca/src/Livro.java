
public class Livro {
	private String titulo;
	private String autor;
	private int ano;
	private int estante;
	private String categoria;
	private boolean emprestado;
	private int prateleira;
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getEstante() {
		return estante;
	}

	public void setEstante(int estante) {
		this.estante = estante;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}

	public int getPrateleira() {
		return prateleira;
	}

	public void setPrateleira(int prateleira) {
		this.prateleira = prateleira;
	}

	public void informaçoes() {
		System.out.println("Título: "+ titulo);
		System.out.println("Autor: "+ autor);
		System.out.println("Categoria: "+ categoria);
		System.out.println("Ano de publicação: "+ ano);
		System.out.println("Prateleira: " + prateleira);
		if (emprestado == true) {
			System.out.println("Este livro já foi emprestado");
		}else {
			System.out.println("Este está disponivel");
			
		}
	}
}
