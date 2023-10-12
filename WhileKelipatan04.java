import java.util.Scanner;

/**
 * WhileKelipatan04
 */
public class WhileKelipatan04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kelipatan, jumlah = 0,counter = 0, i = 1;

        System.out.print("Masukkan Bilangan Kelipatan (1-9): ");
        kelipatan = input.nextInt();

        while (i <= 50) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
            i++;
        }
        System.out.printf("Banyaknya Bilangan %d dari 1 - 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 - 50 adalah %d\n", kelipatan, jumlah);
        double avg = (double) jumlah / counter;
        System.out.printf("Hasil Rata Rata adalah " + avg);
    }
}