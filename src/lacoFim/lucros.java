package lacoFim;

import java.util.Scanner;

public class lucros {

	public static void main(String[] args) {
		Scanner leitura = new Scanner (System.in);
		
		int  i=1, a=2; 
		double lucro, valor, venda;
		String res;
        
		while ( i < a ){
           System.out.println("Digite o valor do produto:" );
             valor = leitura.nextDouble();

           System.out.println("Digite a margem de lucro do produto em %:" );
            lucro = leitura.nextDouble();

            venda  = (( lucro / 100 ) * valor ) + valor ;
            System.out.println("O produto foi vendido por: R$" + venda ); 

            System.out.println("Deseja continuar a executar? (S/N)" ); 
            res = new String ();

            if ( res . equalsIgnoreCase ( "N" )) {
                a = 1 ;
            } else  if ( res . equalsIgnoreCase ( "S" )) {
                System.out.println("A execução vai funcionar");
            } else {
                System.out.println("Resposta inválida");
                a = 1 ;
            }
        }

	}

}
