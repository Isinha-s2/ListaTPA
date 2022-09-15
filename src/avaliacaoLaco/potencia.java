package avaliacaoLaco;

import java.util.Scanner;


public class potencia {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
			int e = ler.nextInt();
			int b = ler.nextInt();
			int res = 1;
				
				while (e>0) {
					res = res * b;
					e = e - 1;
				}
				System.out.println("O resultado é " + res);

	}

}
