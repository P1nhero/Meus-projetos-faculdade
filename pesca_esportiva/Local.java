package pesca_esportiva;

public class Local {
	//Atributos
	String endereco;
	String cidade;
	String cep;
	String latitude;
	String longitude;
	
	//Construtor
	Local(String endereco, String cidade, String cep,
			String latitude, String longitude) {
		//Inicializando os Atributos
		this.endereco = endereco;
		this.cidade = cidade;
		this.cep = cep;
		this.latitude = latitude;
		this.longitude = longitude;
	}
}
	Local(){//Declarando um objeto de teste
		this.endereco = "Rua 1";
		this.cidade = "nenhuma";
		this.cep = "000-000";
		this.latitude = "000-000-000";
		this.longitude = "000-000-000";
				
	}
	

	//Métodos
	public void imprimir() {
		System.out.println("Endereço = "+this.endereco);
		System.out.println("Cidade = "+this.cidade);
		System.out.println("Cep = "+this.cep);
		System.out.println("Latitude = "+this.latitude);
		System.out.println("Longitude = "+this.endereco);
		
	}
	
	public void checarcep(); {
		
	}
