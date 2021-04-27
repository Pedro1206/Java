import java.util.Scanner;

public class aula6 {
	
	public static class Pessoas {
		
		private String nome;
		private int dataN;
		private double peso;
		private String escolaridade;
		private  int idade;
	
		
		
		public String getNome () {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getDataN() {
			return dataN;
		}
		public void setDataN(int dataN) {
			this.dataN = dataN;
			this.idade = idade;
		}
		public double getPeso() {
			return peso;
		}
		public void setPeso(double peso) {
			this.peso = peso;
		}
		public String getEscolaridade() {
			return escolaridade;
		}
		public void setEscolaridade(String escolaridade) {
			this.escolaridade = escolaridade;
		}
		public int getIdade() {
			return 2021 - idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		Pessoas indi [] = new Pessoas [1]; // Defini como 1 para facilitar a demonstração
		
		for (int i = 0; i < indi.length; i++) {
			indi[i] = new Pessoas ();
		}
		for (int i = 0; i <indi.length; i++) {
			System.out.printf("======Dados das Pessoas=====\n", i+1);
			System.out.printf("Informe o nome: ");
			indi[i].setNome(ler.next());
			System.out.printf("Infome o Ano de nascimento: ");
			indi[i].setDataN(ler.nextInt());
			System.out.printf("Informe o Ano novamente:  "); //não consegui usar o de cima
			indi[i].setIdade(ler.nextInt());
			System.out.printf("Informe o peso: ");
			indi[i].setPeso(ler.nextDouble());
			System.out.printf("Infomr a Escolaridade: ");
			indi[i].setEscolaridade(ler.next());
		
		}
		for (int i = 0; i < indi.length; i++) {
			System.out.printf("===== Dados das Pessoas cadastradas =====\n");
			System.out.printf("Nome: %s \n", indi[i].getNome());
			System.out.printf("Ano de nascimento: %s \n", indi[i].getDataN());
			System.out.printf("Peso: %s \n", indi[i].getPeso());
			System.out.printf("Escolaridade: %s \n", indi[i].getEscolaridade());
			System.out.printf("Idade: %s \n", indi[i].getIdade());
		}
			
	}
	}
}
