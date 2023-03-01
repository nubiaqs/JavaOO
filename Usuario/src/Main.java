
public class Main {
	    public static void main(String[] args) {
	        Permissao permissao = new Permissao(1, "Administradora Nubia Master top");
	        Usuario usuario = new Usuario("pipipi popopo", "senha123", permissao);

	        System.out.println("Usuário: " + usuario.getLogin());
	        
	        System.out.println("Senha: " + usuario.getSenha());
	        
	        System.out.println("Permissão: " + usuario.getPermissao().getNomePermissao());
	    }
	}

