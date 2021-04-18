package lab06;

import java.util.HashMap;


public class DadosCadastro {
	
	private Pessoa pessoa;
	private HashMap<String, Pessoa> pessoas;
	private String cpf;
	private Vacina vacina;
	
	public DadosCadastro() {
		this.pessoas = new HashMap<String, Pessoa>();	
	}
	
	public void cadastraPessoa(String cpf, Pessoa p) {
		pessoas.put(cpf, p);
	}
	
	public Pessoa getPessoa(String cpf) {
		 for (String chave: pessoas.keySet() ) {
			 if (chave.equals(cpf)) {
				 return pessoas.get(cpf);
			 }
		 }
		 throw new RuntimeException("Pesssoa não cadastrada!");	
	}
	
	public HashMap<String, Pessoa> getCadastrados() {
		return pessoas;
	}

	public void setVacina(Vacina vacina, Pessoa p) {
		vacina.consulta(p);
		vacina.estagio(p);
	}
	
}
