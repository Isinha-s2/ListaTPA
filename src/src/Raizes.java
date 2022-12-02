import java.util.Scanner;
public class Raizes {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	       
	       
	        final int x = 10;
	        double[] a, b;

	      
	        a = new double[x];
	        b = new double[x];

	        
	        for (int i = 0; i < x; i++) {
	            System.out.println("Insira o valor " + (i + 1) + ":");
	            a[i] = in.nextInt();
	            b[i] = Math.sqrt(a[i]);
	        }

	        for (int i = 0; i < x; i++) {
	            if (i == 0) {
	                System.out.print("Vetor A = ["  + a[i] + ", ");
	            } else if (i == (x - 1)) {
	                System.out.print(a[i] + "]\n");
	            } else {
	                System.out.print(a[i] + ", ");
	            }
	        }
	        for (int i = 0; i < x; i++) {
	            if (i == 0) {
	                System.out.print("Vetor B = [" + b[i] + ", ");
	            } else if (i == (x - 1)) {
	                System.out.print( b[i] + "]");
	            } else {
	                System.out.print(b[i] + ", ");
	            }
	        }

	}

}
