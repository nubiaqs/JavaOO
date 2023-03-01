
public class Empreiteiro extends Funcionario{
	    private double valorEmpreita;

	    public Empreiteiro(String nome, int numRegistro, double valorEmpreita) {
	        super(nome, numRegistro);
	        this.valorEmpreita = valorEmpreita;
	    }

	    public double getValorEmpreita() {
	        return valorEmpreita;
	    }

	    public void setValorEmpreita(double valorEmpreita) {
	        this.valorEmpreita = valorEmpreita;
	    }

	    @Override
	    public double calcularSalario() {
	        return valorEmpreita;
	    }
	}

