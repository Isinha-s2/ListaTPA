package lacoFim;

import java.util.Scanner;

public class inss {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int i=1;
		double s, inss;
		
		while (i <=4 ){
			System.out.println("Digite o "+i+"� sal�rio:");
			s = in.nextDouble();
			
			if (s < 2000){
				s = (s*0.085);
				System.out.println("O desconto do INSS � de: R$" +s);
			} else {
				s = (s*0.11);
				System.out.println("O desconto do INSS � de: R$" +s);
		}
		i++;
	}

  }
}
