package listaDeExer;

import java.util.Scanner;

public class jogofu {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int aulaf;
		
		System.out.println("Entre com um n�mero inteiro para saber a "+" que classifica��o a idade corresponde");
		aulaf = in.nextInt();
		switch(aulaf) {
			case 6:
				System.out.println("dente de leite");
				break;
			case 7:
				System.out.println("Junior");
				break;
			case 8:
				System.out.println("J�nior max");
				break;
			case 9:
				System.out.println("J�nior Master");
				break;
			case 10:
				System.out.println("Master");
			default:
				System.out.println("n�mero inv�lido");
		}
		
		

	}

}
