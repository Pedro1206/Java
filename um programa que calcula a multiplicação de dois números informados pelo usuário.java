import java.util.Locale;
import java.util.Scanner;

public class aula4_3{
	
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
		int a;
		int b;
		System.out.println("Diga o primeiro numero:");
		a = ler.nextInt();
		System.out.println("diga o segundo numero");
		b = ler.nextInt();
		
		resultado (a,b);
	}
	public static void resultado(int a, int b){
		int resultado;

		resultado = a * b;
		System.out.printf("O resultado é %d", resultado);
	}
}
