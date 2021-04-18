package lab06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Habilita extends Vacina {
	
	private List<String> profissoes = new ArrayList<>();
	private List<String> comorbidades = new ArrayList<>();
	private DadosCadastro dados = new DadosCadastro();
	private Pessoa pessoa;
	
	public Habilita() {
		this.profissoes.add("Médico");
		this.profissoes.add("Enfermeiro");
		this.profissoes.add("Policial");
		this.profissoes.add("Jogador de Futebol");
		this.comorbidades.add("Diabetes");
		this.comorbidades.add("Obesidade");
		this.comorbidades.add("Problema Cardiovascular");
	}
	
	public void consulta(Pessoa pessoa) {
		if (Integer.parseInt(pessoa.getIdade()) >= 60) {
			pessoa.setAprovado();
			dados.setVacina(new PrimeiraDose(), pessoa);
			pessoa.setEstagioVacina("Habilitado primeira Dose.");
		} else {
			for (String profissao: profissoes) {
				if (pessoa.getProfissao().equals(profissao)) {
					pessoa.setAprovado();
					dados.setVacina(new PrimeiraDose(), pessoa);
					pessoa.setEstagioVacina("Habilitado primeira Dose.");
				} else {
					for (String comorbidade: comorbidades) {
						if (pessoa.getComorbidade().equals(comorbidade)) {
							pessoa.setAprovado();
							dados.setVacina(new PrimeiraDose(), pessoa);
							pessoa.setEstagioVacina("Habilitado primeira Dose.");
						}
					}
				}
			}
			
		}
		
		
	}
	
}
