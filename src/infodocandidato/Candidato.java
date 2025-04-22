package infodocandidato;

import java.util.concurrent.ThreadLocalRandom;

public class Candidato {

	String nome;
	int idade;
	String cargo;
	double salarioPretendido = ValorPretendido(); 

		public Candidato(String nome, int idade, String cargo, double salarioPretendido) {

		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.salarioPretendido = salarioPretendido;
	}

		public String toSring() {
			return "Nome: " + nome + 
				   "Idade: " + idade +
				   "Cargo" + cargo + 
				   "Pretensão salarial: R$ %.2f " + salarioPretendido; 
			
		}
		
	public static double ValorPretendido () {
		
		return ThreadLocalRandom.current().nextDouble(1800, 2200);		
	}
}
