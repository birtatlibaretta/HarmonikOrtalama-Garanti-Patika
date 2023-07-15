import java.util.Scanner;

public class HarmonikOrtalama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dizideki sayıların sayısını giriniz: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Dizideki sayıları giriniz: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        double harmonicAverage = 0.0;

        for (int i = 0; i < n; i++) {
            harmonicAverage += 1.0 / array[i];
        }

        harmonicAverage /= n;

        System.out.println("Dizideki sayıların harmonik ortalaması: " + harmonicAverage);
    }
}
