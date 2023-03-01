
public class Retangulo extends FormaGeometrica implements Forma2D{
	    private double base;
	    private double altura;
	    
	    public Retangulo(double base, double altura) {
	        this.base = base;
	        this.altura = altura;
	    }
	    
	    public void exibirInfo() {
	        System.out.println("Retângulo de base " + base + " e altura " + altura);
	    }
	    
	    public double calcularArea() {
	        return base * altura;
	    }
	    
	    public double calcularPerimetro() {
	        return 2 * (base + altura);
	        
	    }
	}

