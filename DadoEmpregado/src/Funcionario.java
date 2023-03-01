
public class Funcionario {
	private String nome;
	private String cargo;
	private double salario;
	 
	    public Funcionario(String nome, String cargo, double salario) {
	        this.nome = nome;
	        this.cargo = cargo;
	        this.salario = salario;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getCargo() {
	        return cargo;
	    }

	    public void setCargo(String cargo) {
	        this.cargo = cargo;
	    }

	    public double getSalario() {
	        return salario;
	    }

	    public void setSalario(double salario) {
	        this.salario = salario;
	    }

	    public String imprimir() {
	        return "Nome: " + nome + ", Cargo: " + cargo + ", Salario: R$" + String.format("%.2f", salario);
	    }

	    public void aumentarSalario(double percentual) {
	        salario += salario * (percentual/100);
	    }
	}
