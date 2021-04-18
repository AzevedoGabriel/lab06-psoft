package lab06;

public class HabilitaSegundaDose extends Vacina{
	
	private DadosCadastro dados = new DadosCadastro();
	
	public void estagio(Pessoa pessoa) {
		dados.setVacina(new FinalizaVacinacao(), pessoa);
		pessoa.setEstagioVacina("Habilitada para segunda Dose.");
	}
}
