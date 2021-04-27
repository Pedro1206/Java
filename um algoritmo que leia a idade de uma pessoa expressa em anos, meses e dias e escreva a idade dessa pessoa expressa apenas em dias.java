//  2

import java.util.Locale;
import java.util.Scanner;

public class aula4_2{
	
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
		int a;
		int m;
		int d;
		
		System.out.println("Diga os anos:");
		a = ler.nextInt();
		System.out.println("Diga os meses:");
		m = ler.nextInt();
		System.out.println("Diga os dias:");
		d = ler.nextInt();
		
		resultado(a,m,d);
	}
	public static void resultado(int a, int m, int d) {
		int resultado;
		int somaAno;
		int somaMes;
		
		somaAno = a * 365;
		somaMes = m * 30;
		resultado = somaAno + somaMes + d;
		System.out.printf("O resultado é %d Dias", resultado);
	}
}
