import java.util.Scanner;
public class NumMenorMaior {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        final int x = 10;
        int[] a;
        int menor, maior = 0;

        a = new int[x];

        for (int i = 0; i < x; i++) {
            System.out.println("Insira o valor " + (i + 1) + ":");
            a[i] =in.nextInt();
        }

        menor = a[0];

        for (int i = 0; i < x; i++) {
            if (a[i] > maior) {
                maior = a[i];
            } else if (a[i] < menor) {
                menor = a[i];
            }
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

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

	}

}
