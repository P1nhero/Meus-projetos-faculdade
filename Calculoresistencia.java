package calculoresitencia;

import java.util.Scanner;

public class Calculoresistencia {

	public static void main(String[] args) {
		
		double r1,r2,r3;
		
		 Scanner ler = new Scanner(System.in);
		 
		 System.out.println("INFORME O VALOR DAS RESIST�NCIA!");
		 System.out.println("Valor Resist�ncia 1 = ");
		 r1 = ler.nextDouble();
		 System.out.println("Valor Resist�ncia 2 = ");
		 r2 = ler.nextDouble();
		 System.out.println("Valor Resist�ncia 3 = ");
		 r3 = ler.nextDouble();
		 
		 System.out.println("ESCOLHA A OP��O!");
		 System.out.println(" [1] ");
		 System.out.println(" [2] ");
		 
		 int opcao = ler.nextInt();
		 
		 double resistencia;
		 
		 if(opcao == 1) {
			 resistencia = r1 + r2 + r3;
		 }else {
			 resistencia = (1/r1)+(1/r2)+(1/r3);
		 }
		
		 System.out.println("Resist�ncia Total � igual a "+resistencia);
		 

	}

}
