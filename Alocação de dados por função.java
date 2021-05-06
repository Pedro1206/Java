import java.util.Scanner;
 
public class av1 {
	 
	public static class Professores{
	
		private String nome;
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
   }
	
	public static class Alunos{
		
		private String nome;
		
		public String getNome() {
			return nome;
		}
		public void setNome (String nome) {
			this.nome = nome;
		}
	
		}
	
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a;
		
		System.out.println("Escolha entre (1)Professor ou (2)Aluno");
		a = ler.nextInt();
		
		if (a == 1) {
			op1(a);
		}
		else if (a == 2) {
			op2(a);
		}
		else {
			System.out.printf("%s não é valido", a);
		}
	}

	
	public static void op1(int a) {
		Scanner ler = new Scanner(System.in);
		Professores prof[] = new Professores[5];
		
		for (int i = 0; i < prof.length; i++) {
			prof[i] = new Professores();
		}
		
		for (int i = 0; i < prof.length; i++) {
			System.out.printf("Diga o nome do %sº Professor: \n", i+1, i+i );
			prof[i].setNome(ler.next());
		}
		for (int i = 0; i < prof.length; i++) {
			System.out.printf("Nome do %d professor: %s \n", i+1, prof[i].getNome());
		}
		
		return;
	}


	public static void op2(int a) {
		Scanner ler = new Scanner(System.in);
		Alunos alu[] = new Alunos [10];
		
		for (int i = 0; i < alu.length; i++) {
			alu[i] = new Alunos();
		}
		for (int i = 0; i < alu.length; i++) {
			System.out.printf("Diga o nome do %sº Aluno: \n", i+1, i+i );
			alu[i].setNome(ler.next());
		}
		for (int i = 0; i < alu.length; i++) {
			System.out.printf("Nome do %d Aluno: %s \n", i+1, alu[i].getNome());
	}

}

}

		


