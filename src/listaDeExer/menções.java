package listaDeExer;

import java.util.Scanner;

public class menções {

	public static void main(String[] args) {
		   Scanner leitura = new Scanner(System.in);
		   
		   	int MB, B, R, I;
		   
	        System.out.println("Quantos alunos receberam MB?");
	        MB = leitura.nextInt();
	        System.out.println("Quantos alunos receberam B?");
	        B = leitura.nextInt();
	        System.out.println("Quantos alunos receberam R?");
	        R = leitura.nextInt();
	        System.out.println("Quantos alunos receberam I?");
	        I = leitura.nextInt();

	        int total = MB + B + R + I;
	        double pMB, pB, pR, pI;
	        
	        pMB = (double) MB/total * 100;
	        pB =  (double) B/total * 100;
	        pR =  (double) R/total * 100;
	        pI =  (double) I/total * 100;

	        System.out.println("De qual menção deseja saber a porcentagem? "+" Digite a numeração correspondente: MB (1) B (2) R (3) I (4)");
	        int nota = leitura.nextInt();

	        switch (nota) {
	            case 1:
	                System.out.println("A porcentagem é de: " + pMB + "%");
	                break;
	            case 2:
	                System.out.println("A porcentagem é de: " + pB + "%");
	                break;
	            case 3:
	                System.out.println("A porcentagem é de: " + pR + "%");
	                break;
	            case 4:
	                System.out.println("A porcentagem é de: " + pI + "%");
	                break;
	            default:
	                System.out.println("Número inválido");
	        }

	    }

	}

