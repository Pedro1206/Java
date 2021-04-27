import java.util.Scanner;

public class aula7 {
	
	public abstract class OPmatematica {
		public abstract int calcular( int x, int y);
	}
	
	public static class Soma extends OPmatematica { 
		public int calcular (int x, int y) {
			return x + y;
		}	
	}
	
	public static class Subtracao extends OPmatematica {
		public int calcular(int x, int y) {
			return x - y;
		}
	}

	public static class Multi extends OPmatematica { 
		public int calcular (int x, int y) {
			return x * y;
		}	
	}

	public static class Divi extends OPmatematica { 
		public int calcular (int x, int y) {
			return x / y;
		}	
	}

	public static  void main(String[] args) {
		Scanner ler = new Scanner(System.in);

	System.out.println("=======INSIRA OS VALORES===\n");
	System.out.println("Prinmeiro valor: ");
	int x = ler.nextInt();
	System.out.println("Segundo valor: ");
	int y = ler.nextInt();
	
	if ( x  == 0) {
		System.out.print("0 não é valido");
	}
	if ( y  == 0) {
		System.out.print("0 não é valido");
	}
	else {
		System.out.print("Soma: \n");
		System.out.print(x);
		System.out.print("+");
		System.out.print(y);
		System.out.print("=");
		System.out.print(x+y);
		
		System.out.print("\nSubtracao: \n");
		System.out.print(x);
		System.out.print("-");
		System.out.print(y);
		System.out.print("=");
		System.out.print(x-y);
		
		System.out.print("\nDivisao: \n");
		System.out.print(x);
		System.out.print("/");
		System.out.print(y);
		System.out.print("=");
		System.out.print(x/y);
		
		System.out.print("\nMultiplicasao: \n");
		System.out.print(x);
		System.out.print("*");
		System.out.print(y);
		System.out.print("=");
		System.out.print(x*y);
	
	}
}
}
