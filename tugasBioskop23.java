import java.util.Scanner;

public class tugasBioskop23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalTiketTerjual = 0;
        double totalPendapatan = 0;
        int hargaTiket = 50000;
        char pilihanLanjut;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            int jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan ulang!");
                continue;
            }

            totalTiketTerjual += jumlahTiket;
            double hargaTotal = jumlahTiket * hargaTiket;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double totalBayar = hargaTotal - (hargaTotal * diskon);
            totalPendapatan += totalBayar;

            System.out.println("Total yang harus dibayar: Rp " + totalBayar);
           

            System.out.print("\nApakah ingin input transaksi pelanggan lain? (y/t): ");
            String input = sc.next();
            if (input.equalsIgnoreCase("t") || input.equalsIgnoreCase("n")) {
                break;
            }
        } while (true);

        System.out.println("\n--- Rekap Penjualan Tiket Bioskop ---");
        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total pendapatan satu hari: Rp " + totalPendapatan);
    }
}