// 1 

import java.util.Locale;
import java.util.Scanner;

public class aula4 {
	
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
		int N;
		System.out.println("Diga o numero:");
		N = ler.nextInt();
		
		if ( N > 0){
			System.out.printf("%d é positivo", N);		
		}
		else if (N < 0) {
			System.out.printf("%d é negativo", N);
		}
		else {
			System.out.printf("%d é zero", N);
		}	
	}
	
}


