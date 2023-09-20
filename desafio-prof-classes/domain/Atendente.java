public class Atendente extends Pessoa implements OperacoesService {
	
	private Cargo cargo;
	
	public Atendente(
		String nome,
		Date dataNascimento,
		String cpf,

		Cargo cargo
	) {
		super(nome, dataNascimento, cpf);
		this.cargo = cargo;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public Cargo setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	// ---------------

	public Consulta agendarConsulta(Medico medico, Paciente paciente) {
		return null;
	}

	public void CadastrarDados(Paciente paciente) {
		
	}

	@Override
	public Consulta agendarConsulta(Medico medico, LocalDateTime data){
    medico.adicionarAgenda(data);
  }
	
}