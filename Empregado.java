public class Empregado {
	protected String nome;
	protected String sobrenome;
	protected String cpf;

	public Empregado(String nome, String sobrenome, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}
	public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: ", 
            "Comissionado", nome, sobrenome,
            "CPF", cpf);
    }
}
