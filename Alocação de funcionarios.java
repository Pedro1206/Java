import java.util.Scanner;

public class Trabalho_2{
		
	public static class Funcionarios {
		
		public String nome;
		public double salario;
		public int dia;
		public int mes;
		public int ano;
		
		public  void Aniversario() {
			
			if ( mes == 04) {
				System.out.printf("%d faz aniversario este mes", nome);
			}
		}
		
		public Funcionarios (String nome, double salario, int dia, int mes,int  ano ) {
			this.nome = nome;
			this.salario = salario;
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}		
	}
	
	public static class Gerente extends Funcionarios {
		public Gerente(String nome, double salario, int dia, int mes,int  ano ) {
			super(nome, salario, dia, mes, ano);
		}
	}
		public static class Atendente extends Funcionarios {
			public Atendente(String nome, double salario, int dia, int mes,int  ano ) {
				super(nome, salario, dia, mes, ano);
			}
		}
		
	public static void main(String[] args) {
		Funcionarios funcionario1 = new Funcionarios("Pedro", 765.85, 12, 06, 2000);
		Gerente gerente1 = new Gerente("Joao", 1000.89, 14, 10, 1987);
		Atendente atendente1 = new Atendente("Maria", 665.78, 18, 11, 1999);
		
		System.out.printf("Nome do Funcionario: %s\n", funcionario1.nome);
		System.out.printf("Salario do Funcionario: %s\n", funcionario1.salario);
		System.out.printf("Data de aniversario do Funcionario: %s/%s/%s\n\n\n", funcionario1.dia, funcionario1.mes, funcionario1.ano);

		System.out.printf("Nome do Gerente: %s\n", gerente1.nome);
		System.out.printf("Salario do Gerente: %s\n", gerente1.salario);
		System.out.printf("Data de aniversario do Gerente: %s/%s/%s\n\n\n", gerente1.dia, gerente1.mes, gerente1.ano);
		
		System.out.printf("Nome do Atendente: %s\n", atendente1.nome);
		System.out.printf("Salario do Atendente: %s\n", atendente1.salario);
		System.out.printf("Data de aniversario do Atendente: %s/%s/%s\n\n\n", atendente1.dia, atendente1.mes, atendente1.ano);
		
	}
}
		
		
