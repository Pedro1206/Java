import java.util.Locale;

public class classes {
	
	public static class Pessoas {
		
		public String nome;
		public int  idade;
		public float peso;
		
		public void andar() { 			
		}
		public void dormir() { 
		}	
	}
	
	public static class ContaBank {
		
		public String nome;
		public int agencia;
		public int idconta;
		public float saldo;
		
		public void saque() {
			}
		public void transferencia() {			
		}
	}
	
	public static void main(String[] args) {
		
		Pessoas pessoa1 = new Pessoas();
		pessoa1.nome = "Juliana";
		pessoa1.idade = 23;
		pessoa1.peso = 75;
		
		Pessoas pessoa2 = new Pessoas();
		pessoa2.nome = "Carlos";
		pessoa2.idade = 39;
		pessoa2.peso = 72;
		
		Pessoas pessoa3 = new Pessoas();
		pessoa3.nome = "Ericka";
		pessoa3.idade = 15;
		pessoa3.peso = 80;
		
		
		ContaBank conta1 = new ContaBank();
		conta1.nome = "Maria";
		conta1.agencia = 8974;
		conta1.idconta = 0002345;
		conta1.saldo = 4500;
		
		ContaBank conta2 = new ContaBank();
		conta2.nome = "João";
		conta2.agencia = 3976;
		conta2.idconta = 78450;
		conta2.saldo = 8500;
		
		ContaBank conta3 = new ContaBank();
		conta3.nome = "Jéssica";
		conta3.agencia = 3806;
		conta3.idconta = 17845;
		conta3.saldo = 5500;
	}
	
}
