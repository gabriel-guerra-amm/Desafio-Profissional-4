public abstract class Pessoa {
	private String nome;
	private Date dataNascimento;
	private String cpf;

	public Pessoa(
		String nome,
		Date dataNascimento,
		String cpf
	) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
	}

	public String getNome() {
			return nome;
		}

		public String setNome (String nome) {
			this.nome = nome;
		}

		public Date getDataNascimento() {
			return dataNascimento;
		}

		public Date setDataNascimento (Date dataNascimento) {
			this.dataNascimento = dataNascimento;
		}

		public String getCpf() {
			return cpf;
		}

		public String setCpf (String cpf) {
			this.cpf = cpf;
		}
}