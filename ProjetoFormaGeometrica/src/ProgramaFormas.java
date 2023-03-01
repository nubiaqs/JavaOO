
public class ProgramaFormas {
	    public static void main(String[] args) {
	        FormaGeometrica forma1 = new Retangulo(5, 3);
	        forma1.exibirInfo();
	        System.out.println("Área: " + ((Forma2D) forma1).calcularArea());
	        System.out.println("Perímetro: " + ((Forma2D) forma1).calcularPerimetro());
	        
	        System.out.println("---------------------- ");
	        
	        FormaGeometrica forma2 = new Paralelepipedo(4, 3, 2);
	        forma2.exibirInfo();
	        System.out.println("Volume: " + ((Forma3D) forma2).calcularVolume());
	        
	        System.out.println("---------------------- ");
	        
	        FormaGeometrica forma3 = new Cubo(4);
	        forma3.exibirInfo();
	        System.out.println("Área: " + ((Forma2D) forma3).calcularArea());
	        System.out.println("Perímetro: " + ((Forma2D) forma3).calcularPerimetro());
	        System.out.println("Volume: " + ((Forma3D) forma3).calcularVolume());
	    }
	}

