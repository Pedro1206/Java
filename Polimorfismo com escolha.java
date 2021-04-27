import java.util.Scanner;

public class aula6_2 {

// classe principal
	
	public static class Mamifero {
		public String nome;
		
		public Mamifero(String nome) {
			this.nome = nome;
		}
		public void locomover() {
			
		}
	}
// classes que herdam da principal	
	public static class Macaco extends Mamifero {
		public Macaco(String nome) {
			super(nome);
		}
		public void locomover() {
			System.out.print("Pulando entre as árvores \n");
		}
	}
	public static class Homem extends Mamifero {
		public Homem(String nome) {
			super(nome);
		}
		public void locomover() {
			System.out.print("Andar \n");
		}
	}
	public static class Baleia extends Mamifero {
		public Baleia(String nome) {
			super(nome);
		}
		public void locomover() {
			System.out.print("Nadar \n");
		}
	}
// programa principal	
	public static  void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
//entrada de dados		
		System.out.println("Escolha entre Macaco, Baleia e Homem: ");
		String A = ler.next();
		
	
		if (A == "Macaco") {
			System.out.print(Macaco.class);
		}
		if ( A == "Baleia") {
			System.out.print(Baleia.class);
		}
		if ( A == "Homem") {
			System.out.print(Homem.class);
		}
		else {
			System.out.print(" não é valido");
		}
	}
}
