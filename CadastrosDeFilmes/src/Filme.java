
public class Filme {
	private String nome;
	private int ano;
	private String genero;
	private int duracao;
	private int classificacao;

	public Filme(String nome, int ano, String genero, int duracao, int classificacao) {
		super();
		this.nome = nome;
		this.ano = ano;
		this.genero = genero;
		this.duracao = duracao;
		this.classificacao = classificacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	@Override
	public String toString() {
		return "Filme{" + "nome='" + nome + '\'' + ", ano=" + ano + ", genero='" + genero + '\'' + ", duracao="
				+ duracao + ", classificacao=" + classificacao + '}';
	}

	public char[] toCSV() {
		return null;
	}
}
