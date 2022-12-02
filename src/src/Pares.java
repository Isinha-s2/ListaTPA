import java.util.Scanner;
public class Pares {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        final int x = 10;
        int[] a;

        a = new int[x];

        for (int i = 0; i < x; i++) {
            System.out.println("digite o valor " + (i + 1) + ":");
            a[i] = in.nextInt();
        }

        for (int i = 0; i < x; i++) {
            if (i == 0) {
                System.out.print("Vetor A = [" + a[i] + ", ");
            } else if (i == (x - 1)) {
                System.out.println(a[i] + "]");
            } else {
                System.out.print(a[i] + ", ");
            }
        }

        System.out.println("Valores pares do vetor A:");
        for (int i = 0; i < x; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " | ");
            }
        }

	}

}
