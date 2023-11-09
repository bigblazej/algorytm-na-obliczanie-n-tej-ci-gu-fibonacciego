import java.util.Scanner;

public class Ciag {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int i;

        System.out.println("Podaj liczbe:");
        i = r.nextInt();

        long[] tablica = new long[10000];
        tablica[0] = 0;
        tablica[1] = 1;
        for (int n = 2; n < i; n++) {
            tablica[n] = tablica[n - 1] + tablica[n - 2];
        }
        System.out.print(i + " liczba ciągu fibonacciego to: " + tablica[i - 1]);
    }
}