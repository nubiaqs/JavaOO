import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Leitor {
	public static ArrayList<Filme> lerAcervo(String nomeArquivo) {
        ArrayList<Filme> acervo = new ArrayList<>();
        try {
        	
            BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                String nome = dados[0];
                int ano = Integer.parseInt(dados[1]);
                String genero = dados[2];
                int duracao = Integer.parseInt(dados[3]);
                int classificacao = Integer.parseInt(dados[4]);
                Filme filme = new Filme(nome, ano, genero, duracao, classificacao);
                acervo.add(filme);
            }
            
            br.close();
        } catch (IOException ex) {
            System.out.println("Erro ao ler o acervo.");
            System.out.println(ex.getMessage());
        }
        return null;
        
    }
}
