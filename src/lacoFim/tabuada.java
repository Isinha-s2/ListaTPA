package lacoFim;

import java.util.Scanner;

public class tabuada {
	 	public  static  void  main ( String [] args ) {
	 		Scanner in = new  Scanner ( System . in );

	 		int  i=1, n, res; 

	 		System.out.println("Digite um n�mero e obtenha a sua tabuada:");
	 		n = in.nextInt();
	 		while (i<=10){
	 			res = n*i;
	 			System.out.println(n+"x"+i+"="+res);
	 			i++;
	 		}
         

	}

}
