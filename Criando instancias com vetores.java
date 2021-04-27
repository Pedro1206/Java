import java.util.Scanner;

public class aula5 {
	
	public class Pessoas {
		
		public String nome;
		public int  idade;
		public float peso;
		
		Pessoas() {
			System.out.println("Criado com sucesso!");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Pessoas indi[] = new Pessoas[5];
		
		for (int i = 0; i < indi.length; i++) {
			indi[i] = new Pessoas(); 
			
		}
		for (int i = 0; i < indi.length; i++) {
			System.out.printf("Dados da Pessoa \n", i+1);
			System.out.printf("Informe o nome da Pessoa: ");
			indi[i].nome = ler.next();
			System.out.printf("Informe a idade da pessoa: ");
			indi[i].idade = ler.nextInt ();
			System.out.printf("informe o peso da pessoa ");
			indi[i].peso = ler.nextInt();
			
		}
	}
}
