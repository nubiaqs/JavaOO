
public class Biblioteca {

	public static void main(String[] args) {
		Livro book = new Livro();
		book.setAno (1997);
		book.setAutor (" Nubia Quirino ");
		book.setCategoria ("Carreira");
		book.setEstante (5);
		book.setPrateleira (7);
		book.setTitulo ("Alexander McQueen ");
		book.informaçoes();
		book.setEmprestado (true);
		book.informaçoes();
		
	}

}
