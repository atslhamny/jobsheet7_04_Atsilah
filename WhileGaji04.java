import java.util.Scanner;

public class WhileGaji04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int JumlahKaryawan;
        int JumlahJamLembur;
        double gajiLembur = 0;
        double totalGajiLembur = 0;
        String Jabatan = "";

        System.out.print("Masukkan Jumlah Karyawan: ");
        JumlahKaryawan = input.nextInt();
        int i = 0;

        while (i < JumlahKaryawan) {
            System.out.println("Pilihan Jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan Jabatan Karyawan ke-" + (i+1) + ": ");
            Jabatan = input.next();
            System.out.print("Masukkan Jumlah Jam Lembur: ");
            JumlahJamLembur = input.nextInt();
            i++;

            if (Jabatan.equalsIgnoreCase("Direktur")) {
                continue;
            } else if (Jabatan.equalsIgnoreCase("Manajer")){
                gajiLembur = JumlahJamLembur * 100000;
            } else if(Jabatan.equalsIgnoreCase("Karyawan")){
                gajiLembur = JumlahJamLembur * 75000;
            }
            totalGajiLembur += gajiLembur;

            System.out.println("Total Gaji Lembur: " + totalGajiLembur);
        }

    }
}
