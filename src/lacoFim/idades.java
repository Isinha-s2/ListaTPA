package lacoFim;

import java.util.Scanner;

public class idades {
	

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int  i=1, idNo, idVe, id ; 
		String nomeN, nomeV, nome;

        System.out.println("Escreva o nome do usu�rio 1:" );
        nome = new String();
        nomeN = nome;
        nomeV = nome;
        System.out.println("Escreva a idade do usu�rio 1:"); 
        id = in.nextInt ();
        idNo = in.nextInt () ;
        idVe = in.nextInt () ;

        while ( i <= 9 ) {
           System.out.println("Escreva o nome do usu�rio" + i + ":");
           nome = new String();
           System.out.println( "Escreveu a idade do usu�rio" + i + ":"); 
            id = in.nextInt ();
            if ( id < idNo ){
                nomeN = nome ;
                idNo = id ;
            } else if ( id > idVe ) {
                nomeV = nome ;
                idVe = id ;
            }
            i++;
        }
        System.out.println("O mais velho � " +nomeV+ " com " + idVe + " anos." );
        System.out.println("O mais novo � " +nomeN+ " com " + idNo + " anos. ");
    }

}


