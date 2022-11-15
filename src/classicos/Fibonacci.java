package classicos;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner (System.in);
			int n = sc.nextInt(), result = 1, anterior = 0;
			
			System.out.print(result + " | ");
			for (int i = 1; i < n; i++) {
				result = result + anterior;
				anterior = result - anterior;
				System.out.print(result + " | ");
			}
	}

}
