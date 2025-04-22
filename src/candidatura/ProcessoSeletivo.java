package candidatura;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import infodocandidato.Candidato;

public class ProcessoSeletivo {

	private static final double SALARIO_MAXIMO = 2000.0;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {

			List<Candidato> candidatosAprovados = new ArrayList<>();

			int opcao;

			do {

				System.out.println("\n1. Cadastrar candidato");
				System.out.println("2. Listar candidatos aprovados");
				System.out.println("0. Sair");

				opcao = sc.nextInt();
				sc.nextLine();

				switch (opcao) {

				case 1:
					
					System.out.print("Nome: ");
					String nome = sc.nextLine();

					System.out.print("Idade: ");
					int idade = sc.nextInt();
					sc.nextLine();

					System.out.print("Cargo desejado: ");
					String cargo = sc.nextLine();

					System.out.print("\nPretensão salarial (R$) ");
					double salarioPretendido = Candidato.ValorPretendido();
					System.out.printf("\nPretensão salario gerada: R$ %.2f", salarioPretendido);
					

					if (salarioPretendido <= SALARIO_MAXIMO) {

						candidatosAprovados.add(new Candidato(nome, idade, cargo, salarioPretendido));
						
						System.out.println("\nAprovado");
					}else{

						System.out.println("\nRecusado");
					}
					
					break;

				case 2:
					
					System.out.println("Candidatos aprovados");
					if (candidatosAprovados.isEmpty()) {

						System.out.println("Nenhum aprovado até o momento");

					}else{

						for (Candidato c : candidatosAprovados) {
							System.out.println(c);
						}
					}
					
					break;

				}

			} while (opcao != 0);

		}

	}

}
