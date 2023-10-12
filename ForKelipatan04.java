import java.util.Scanner;

/**
 * ForKelipatan04
 */
public class ForKelipatan04 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        int kelipatan;
        int jumlah = 0;
        int counter = 0;

        System.out.print("Masukkan Bilangan Kelipatan (1-9) : ");
        kelipatan = input.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;  
            }
        }
        System.out.printf("Banyaknya Bilangan %d dari 1 - 50 adalah %d\n", kelipatan , counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 - 50 adalah %d\n", kelipatan, jumlah);
        double avg = (double) jumlah / counter;
        System.out.printf("Hasil Rata Rata adalah" + avg);
    }
}