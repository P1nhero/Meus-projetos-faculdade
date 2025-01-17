package transportadora;

public class Cliente {
	private String nome;
	private String cpf;
	private String endereco;
	private String contato;
	private String email;
	private String cep;
	
	Cliente(String nome,String cpf,String endereco,String contato,String email,String cep){
		this.nome=nome;
		this.cpf=cpf;
		this.endereco=endereco;
		this.contato=contato;
		this.email=email;
		this.cep=cep;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setCpf(String cpf) {
		this.cpf=cpf;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setEndereco(String endereco) {
		this.endereco=endereco;
	}
	public String getEndereco() {
		return this.endereco;
	}
	public void setContato(String contato) {
		this.contato=contato;
	}
	public String getContato() {
		return this.contato;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return this.email;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCep() {
		return this.cep;
	}
	public void cadastrar() {
		
	}

}
