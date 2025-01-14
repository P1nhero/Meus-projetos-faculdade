package pesca_esportiva;

public class Main {
	
	public static void main(String[]args) {
		Local local_1 = new Local("Tv.Santa luzia", "Oriximiná",
				"68270-000","-003344423","92933923");
		
		Local local_2 = new Local();
		
		local_1.imprimir();
		System.out.println("");
		local_2.imprimir();
		
		Competicao competicao = new Competicao("OrixiPesca","25/02/2025", local_1);	
		Competicao competicao_1 = new Competicao("OrixiPesca","25/02/2025",local_2);
	}

}
