import java.util.Scanner;

public class DoWhileCuti04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jatahCuti;
        int jumlahHari;
        String konfirmasi = "";

        System.out.print("Jatah cuti: ");
        jatahCuti = input.nextInt();
         do {
            System.out.print("Apakah Anda ingin Mengambil cuti (Ya/Tidak) ? ");
            konfirmasi = input.next();

            if (konfirmasi.equalsIgnoreCase("Ya")) {
                System.out.print("Jumlah Hari: ");
                jumlahHari = input.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa Jatah Cuti: " + jatahCuti);
                    
                } else {
                    System.out.println("Sisa Jatah Cuti Anda Tidak Mencukupi");
                    break;
                }
            }
         } while (jatahCuti > 0);
    }
}
