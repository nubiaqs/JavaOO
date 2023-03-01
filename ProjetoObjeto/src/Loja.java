
public class Loja {
	public static void main(String[] args) {
	Carro c1 = new Carro();
	c1.setMarca ("Checrolet");
	c1.setModelo ("Corsa");
	c1.setAno (2002);
	c1.setCor ("Vermelho com vermelho fosco");
	c1.setPreco (6800);
	
	Carro c2 = new Carro();
	c2.setMarca ("Porche");
	c2.setModelo ("Cayenne");
	c2.setAno (2023);
	c2.setCor ("Prata");
	c2.setPreco (2500000);
	
	
	c1.exibirAnuncio();
	System.out.println("O valor do seguro para jovens é de: "+c1.calcularSeguro(0));
	System.out.println("O valor do seguro para adultos é de: "+c1.calcularSeguro(1));
	System.out.println("O valor do seguro para idosos é de: "+c1.calcularSeguro(2));
	
	c2.exibirAnuncio();
	
	
	}
}
