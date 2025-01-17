package transportadora;

public class Pacote {
	private double peso;
	private double volume;
	private String codigo;
	private String tamanho;
	private double valor_estimado;
	private String descricao;
	
	Pacote(double peso,double volume, String codigo,String tamanho,double valor_estimado, String descricao){
		this.peso=peso;
		this.volume = volume;
		this.codigo=codigo;
		this.tamanho=tamanho;
		this.valor_estimado=valor_estimado;
		this.descricao=descricao;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPeso() {
		return this.peso;
	}
	
	public void setVolume(double volume) {
		this.volume=volume;
	}
	public double getVolume() {
		return this.volume;
	}
	
	public void setCodigo(String codigo) {
		this.codigo=codigo;
	}
	public String getCodigo() {
		return this.codigo;
	}
	public void setTamanho(String tamanho) {
		this.tamanho=tamanho;
	}
	public String getTamanho() {
		return this.tamanho;
	}
	public void setValor_estimado(double valor_estimado) {
		this.valor_estimado=valor_estimado;
	}
	public double getValor_estimado() {
		return this.valor_estimado;
	}
	public void setDescricao(String descricao) {
		this.descricao=descricao;
	}
	public String getDescricao() {
		return this.descricao;
	}

}
