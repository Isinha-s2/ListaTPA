package avaliacaoLaco;

import java.util.Scanner;

public class fator {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
			int f = ler.nextInt();
			int result = 1;
				
				while (f>0) {
					result = result * f;
					f = f - 1;
				}
				System.out.println("O resultado é " + result);
	
	}

}
