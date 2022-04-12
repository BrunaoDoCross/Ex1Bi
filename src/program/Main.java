package program;

import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa = null;
		System.out.println("Pessoa física ou jurídica? F/J");
		char pes = sc.next().charAt(0);
		if (pes == 'f' || pes == 'F') {
			double renda = -1;
			System.out.println("Nome da pessoa: ");
			String nome = sc.next();
			while (renda < 0) {
				System.out.println("Renda: ");
				renda = sc.nextDouble();
				if (renda < 0) {
					System.out.println("Digite um valor válido para a renda...");
				}
			}
			System.out.println("CPF: ");
			String cpf = sc.next();
			pessoa = new PessoaFisica(nome, renda, cpf);
			;
		} 
		else {
			double renda = -1;
			System.out.println("Nome da empresa: ");
			String nome = sc.next();
			while (renda < 0) {
				System.out.println("Renda: ");
				renda = sc.nextDouble();
				if (renda < 0) {
					System.out.println("Digite um valor válido para a renda...");
				}
			}
			
			System.out.println("CNPJ: ");
			String cnpj = sc.next();
			pessoa = new PessoaJuridica(nome, renda, cnpj);

		}
		
		System.out.println(pessoa);
		sc.close();

	}

}
