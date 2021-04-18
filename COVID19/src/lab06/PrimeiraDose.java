package lab06;

public class PrimeiraDose extends Vacina {
	
	private DadosCadastro dados = new DadosCadastro();
	
	public void estagio(Pessoa pessoa) {
		dados.setVacina(new TomouPrimeiraDose(), pessoa);
		pessoa.setEstagioVacina("Tomou primeira dose. Daqui 20 dias retornar para segunda dose.");
		
	}
}
