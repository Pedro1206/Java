import java.util.Scanner;

public class Trabalho{
	
	public static class Agenda {
		
		private String nome;
		private long telefone;
		private long endereco;
		
		public String getNome () {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public long getTelefone() {
			return telefone;
		}
		public void setTelefone(long telefone) {
			this.telefone = telefone;
		}
		public long getEndereco () {
			return endereco;
		}
		public void setEndereco(long  endereco) {
			this.endereco = endereco;
		}
	}
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		// Defini como 1 apenas para demonstração o correto é new Agenda[10]
		Agenda pessoas [] = new Agenda[1];
		
		for (int i = 0; i < pessoas.length; i++){
			pessoas[i] = new Agenda ();
		}
		for (int i = 0; i < pessoas.length; i++){
			System.out.printf("============Dados das Pessoa: %s========\n", i, i+1);
			System.out.printf("Informe o nome: ");
			pessoas[i].setNome(ler.next());
			System.out.printf("Informe o Telefone: ");
			pessoas[i].setTelefone(ler.nextLong());
			System.out.printf("Informe o CEP: ");
			pessoas[i].setEndereco(ler.nextLong());
		}
		
		for (int i = 0; i < pessoas.length; i++){
			System.out.printf("===== Dados das Pessoa: %s =====\n", i);
			System.out.printf("Nome: %s \n", pessoas[i].getNome());
			System.out.printf("Telefone:: %s \n", pessoas[i].getTelefone());
			System.out.printf("Endereço: %s \n", pessoas[i].getEndereco());
		}
	
	
	}
	
}
