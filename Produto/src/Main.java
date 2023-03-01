
public class Main {
		public static void main(String[] args) {

			Produto produto = new Produto(1, "Garrafinha do Isidro", 200.00);

			Cliente cliente = new Cliente("Professor Isidro", "123.456.789-00", "joao.silva@gmail.com");

			Pedido pedido = new Pedido(1, "15/02/2023", produto.getPreco(), cliente, produto);

			System.out.println("Pedido nº " + pedido.getNumero());
			System.out.println("Data: " + pedido.getData());
			System.out.println("Cliente: " + pedido.getCliente().getNome());
			System.out.println("Produto: " + pedido.getProduto().getNome());
			System.out.println("Valor Total: R$" + pedido.getValorTotal());
		}
	}


