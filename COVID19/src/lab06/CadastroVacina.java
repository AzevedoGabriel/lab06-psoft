package lab06;

import java.util.Scanner;

public class CadastroVacina {
	
	private static Pessoa pessoa;
	private static DadosCadastro cadastro;
	private static Vacina v = new Vacina();

	public static void main(String[] args) {
		
		cadastro = new DadosCadastro();
		boolean situacao = true;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Bem vindo, efetue o seu cadastro");
		System.out.println("######################");
		System.out.println("O que gostaria de fazer: ");
		while (situacao) {
			System.out.println("[1] Cadastro - [2] Alterar Dado - [3] Visualizar Situação - [4] Finalizar");
			String resposta = sc.nextLine();
			if (resposta.equals("1")) {
				System.out.print("Nome Completo: ");
				String nome = sc.nextLine();
				System.out.print("Idade: ");
				String idade = sc.nextLine();
				System.out.print("CPF: ");
				String cpf = sc.nextLine();
				System.out.print("Endereço: ");
				String endereco = sc.nextLine();
				System.out.print("Nº Cartão SUS: ");
				String cartaoSUS = sc.nextLine();
				System.out.print("Email: ");
				String email = sc.nextLine();
				System.out.print("Telefone: ");
				String telefone = sc.nextLine();
				System.out.print("Profissão: ");
				String profissao = sc.nextLine();
				System.out.print("Possui comorbidade?  ");
				String resp = sc.nextLine();
				String comorbidade;
				if (resp.equals("Sim")) {
					System.out.print("Qual(is)?" );
					comorbidade = sc.nextLine();
				} else {
					comorbidade = "Nenhuma";
				}
				pessoa = new Pessoa(nome, idade, cpf, endereco, cartaoSUS, email, telefone, profissao, comorbidade);
				cadastro.cadastraPessoa(cpf, pessoa);
				cadastro.setVacina(v, pessoa);
				System.out.println("Cadastro realizado com sucesso!");
			} else if (resposta.equals("2")) {
				System.out.print("Informe seu CPF: ");
				String cpf = sc.nextLine();
				pessoa = cadastro.getPessoa(cpf);
				System.out.print("Qual dado a ser alterado? ");
				String dado = sc.nextLine();
				String newDado;
				if (dado.equals("Nome")) {
					System.out.print("Novo nome: ");
					newDado = sc.nextLine();
					pessoa.setNome(newDado);
				} else if (dado.equals("CPF")) {
					System.out.print("Novo CPF: ");
					newDado = sc.nextLine();
					pessoa.setCpf(newDado);
				} else if (dado.equals("Idade")) {
					System.out.print("Nova Idade: ");
					newDado = sc.nextLine();
					pessoa.setIdade(newDado);
				} else if (dado.equals("Endereço")) {
					System.out.print("Novo Endereço: ");
					newDado = sc.nextLine();
					pessoa.setEndereco(newDado);
				} else if (dado.equals("Email")) {
					System.out.print("Novo Email: ");
					newDado = sc.nextLine();
					pessoa.setEmail(newDado);
				} else if (dado.equals("Cartão SUS")) {
					System.out.print("Novo Nº do Catão SUS: ");
					newDado = sc.nextLine();
					pessoa.setCartaoSUS(newDado);
				} else if (dado.equals("Telefone")) {
					System.out.print("Novo Telefone: ");
					newDado = sc.nextLine();
					pessoa.setTelefone(newDado);
				} else if (dado.equals("Profissão")) {
					System.out.print("Nova Profissão: ");
					newDado = sc.nextLine();
					pessoa.setProfissao(newDado);
				} else if (dado.equals("Comorbidade")) {
					System.out.print("Alter a comorbidade: ");
					newDado = sc.nextLine();
					pessoa.setComorbidade(newDado);
				}
				
				System.out.println("Seus dados foram atualizados!");
			} else if (resposta.equals("4")) {
				situacao = false;
			} else if (resposta.equals("3")) {
				System.out.print("Informe seu CPF: ");
				String cpf = sc.nextLine();
				pessoa = cadastro.getPessoa(cpf);
				System.out.println(pessoa.toString());
			}
			
		}
		

	}

}
