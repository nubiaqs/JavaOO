
public class Cubo extends FormaGeometrica implements Forma2D, Forma3D  {
	    private double lado;
	    
	    public Cubo(double lado) {
	        this.lado = lado;
	    }
	    
	    public void exibirInfo() {
	        System.out.println("Cubo de lado " + lado);
	    }
	    
	    public double calcularArea() {
	        return 6 * lado * lado;
	    }
	    
	    public double calcularPerimetro() {
	        return 14 * lado;
	    }
	    
	    public double calcularVolume() {
	        return lado * lado * lado;
	        
	    }
	}

