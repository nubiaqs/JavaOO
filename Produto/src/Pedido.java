
public class Pedido {
	private int numero;
	private String data;
	private double valorTotal;
	private Cliente cliente;
	private Produto produto;

	public Pedido(int numero, String data, double valorTotal, Cliente cliente, Produto produto) {
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
		this.cliente = cliente;
		this.produto = produto;
	}

	public int getNumero() {
		return numero;
	}

	public String getData() {
		return data;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Produto getProduto() {
		return produto;
	}
}

