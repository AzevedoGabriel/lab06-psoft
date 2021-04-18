package lab06;

public class Pessoa {
	
	private String nome;
	private String idade;
	private String cpf;
	private String endereco;
	private String cartaoSUS;
	private String email;
	private String telefone;
	private String profissao;
	private String comorbidade;
	private boolean aprovado;
	private String estagioVacina;

	public Pessoa (String nome, String idade, String cpf, String endereco, String cartaoSUS, String email, String telefone, String profissao, String comorbidade) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.endereco = endereco;
		this.cartaoSUS = cartaoSUS;
		this.email = email;
		this.telefone = telefone;
		this.profissao = profissao;
		this.comorbidade = comorbidade;
		this.aprovado = false;
		this.estagioVacina = "Não habilitado!";
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCartaoSUS() {
		return cartaoSUS;
	}

	public void setCartaoSUS(String cartaoSUS) {
		this.cartaoSUS = cartaoSUS;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getComorbidade() {
		return comorbidade;
	}

	public void setComorbidade(String comorbidade) {
		this.comorbidade = comorbidade;
	}
	
	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public boolean isAprovado() {
		aprovado = false;
		return aprovado;
	}

	public void setAprovado() {
		this.aprovado = true;
	}

	public String getEstagioVacina() {
		return estagioVacina;
	}

	public void setEstagioVacina(String estagioVacina) {
		this.estagioVacina = estagioVacina;
	}
	
	public String toString() {
		return this.nome + " - " + this.cpf + " - " + this.idade + " - " + this.endereco + " - " + this.comorbidade + " - " +
				this.email + " - " + this.cartaoSUS + " - " + this.profissao + " - " + this.estagioVacina;
	}
	
}
