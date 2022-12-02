import java.util.Scanner;
public class Inverso {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);

	        final int x = 10;
	        int[] a, b;

	        a = new int[x];
	        b = new int[x];

	        for (int i = 0; i < x; i++) {
	            System.out.println("Digite o valor " + (i + 1) + ":");
	            a[i] = in.nextInt();
	        }

	        for (int i = 0; i < x; i++) {
	            b[i] = a[x - i - 1];
	        }

	        for (int i = 0; i < x; i++) {
	            if (i == 0) {
	                System.out.print("Vetor A = [" + a[i] + ", ");
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
	                System.out.print(b[i] + "]");
	            } else {
	                System.out.print(b[i] + ", ");
	            }
	        }
	}

}
