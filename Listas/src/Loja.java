import java.util.ArrayList;

public class Loja {
	public static void main(String[] args) {
		ArrayList<Produto> lista;
		lista = new ArrayList<Produto>();
		
		lista.add(new Produto(1, "computado", 1500));
		lista.add(new Produto(2, "mouse", 50));
		lista.add(new Produto(3, "teclado", 100));
		lista.add(new Produto(4, "impressora", 500));
		
		for (Produto p: lista) {
			System.out.println(p);
			
		}
	}
}
