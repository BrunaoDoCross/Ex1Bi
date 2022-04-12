package program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Pessoa> lista = new ArrayList<>();
		Pessoa p;
		System.out.print("Quantas pessoas deseja adicionar na lista? ");
		int q = sc.nextInt();
		for (int i = 1; i <= q; i++) {
			System.out.println("\n\nPessoa #" + i);
			System.out.print("Pessoa física ou jurídica? F/J: ");
			char pes = sc.next().charAt(0);
			if (pes == 'f' || pes == 'F') {
				double renda = -1;
				System.out.print("Nome da pessoa: ");
				String nome = sc.next();
				sc.nextLine();
				while (renda < 0) {
					System.out.print("Renda: ");
					renda = sc.nextDouble();
					if (renda < 0) {
						System.out.print("Digite um valor válido para a renda...");
					}
				}
				System.out.print("CPF: ");
				String cpf = sc.next();
				sc.nextLine();
				p = new PessoaFisica(nome, renda, cpf);
				lista.add(p);
			} else {
				double renda = -1;
				System.out.print("Nome da empresa: ");
				String nome = sc.next();
				sc.nextLine();
				while (renda < 0) {
					System.out.print("Renda: ");
					renda = sc.nextDouble();
					if (renda < 0) {
						System.out.println("Digite um valor válido para a renda...");
					}
				}
				System.out.print("CNPJ: ");
				String cnpj = sc.next();
				sc.nextLine();
				p = new PessoaJuridica(nome, renda, cnpj);
				lista.add(p);
			}
		}

		Comparator<Pessoa> comparador = new Comparator<Pessoa>() {
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.getNome().compareTo(o2.getNome());
			}
		};
		Collections.sort(lista, comparador);

		System.out.println("\n\nLista de pessoas físicas e júridicas ordenadas alfabeticamente: ");
		for (Pessoa pessoa : lista) {
			System.out.println(pessoa);
		}
		sc.close();

	}

}
