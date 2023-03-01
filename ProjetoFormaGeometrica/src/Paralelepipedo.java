
public class Paralelepipedo extends FormaGeometrica implements Forma3D{
	    private double base;
	    private double altura;
	    private double profundidade;
	    
	    public Paralelepipedo(double base, double altura, double profundidade) {
	        this.base = base;
	        this.altura = altura;
	        this.profundidade = profundidade;
	    }
	    
	    public void exibirInfo() {
	        System.out.println("Paralelepípedo de base " + base + ", altura " + altura + " e profundidade " + profundidade);
	    }
	    
	    public double calcularVolume() {
	        return base * altura * profundidade;
	    }
	}

