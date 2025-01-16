package transportadora;

public class Veiculo {
	private String placa;
	private String modelo;
	private double capacidade;
	private boolean disponibilidade;
	private Motorista motorista;
	
	Veiculo (String placa, String modelo, double capacidade, boolean disponibilidade, Motorista motorista){
		this.placa = placa;
		this.modelo = modelo;
		this.capacidade = capacidade;
		this.disponibilidade = disponibilidade;
		this.motorista = motorista;
		
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getPlaca() {
		return this.placa;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return this.modelo;
	}
	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}
	public double getCapacidade() {
		return this.capacidade;
	}
	
	public void setDisponibildade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	public boolean getDisponibilidade() {
		return this.disponibilidade;
	}
	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
	public Motorista getMotorista () {
		return this.motorista;
	}

}
