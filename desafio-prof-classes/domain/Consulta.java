public class Consulta implements TipoConsulta {

	private Date dataConsulta;
	private Paciente paciente;
	private Medico medico;
	private LocalTime hora;
	private TipoConsulta tipoConsulta;

	public Consulta(
		Date dataConsulta,
		Paciente paciente,
		Medico medico,
		LocalTime hora,
		TipoConsulta tipoConsulta
	) {
		this.dataConsulta = dataConsulta;
		this.paciente = paciente;
		this.medico = medico;
		this.hora = hora;
		this.tipoConsulta = tipoConsulta;
	}

	public Tipo getDataConsulta() {
		return dataConsulta;
	}
	
	public Tipo setDataConsulta(Tipo dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	
	// ---
	
	public Tipo getPaciente() {
		return paciente;
	}
	
	public Tipo setPaciente(Tipo paciente) {
		this.paciente = paciente;
	}

	// ---
	
	public Tipo getMedico() {
		return medico;
	}
	
	public Tipo setMedico(Tipo medico) {
		this.medico = medico;
	}
	
	// ---

	public Tipo getHora() {
		return hora;
	}
	
	public Tipo setHora(Tipo hora) {
		this.hora = hora;
	}
	
	// ---
	
	public Tipo getTipoConsulta() {
		return tipoConsulta;
	}
	
	public Tipo setTipoConsulta(Tipo tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}

	public void reagendarPaciente(Paciente paciente, Medico medico) {
		
	}
	
}