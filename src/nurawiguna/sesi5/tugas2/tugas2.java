package nurawiguna.sesi5.tugas2;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga_beli, diskon, harga_bayar;

        System.out.print("Harga beli : Rp. ");
        harga_beli = input.nextInt();

        if (harga_beli >= 50000) {
            diskon = harga_beli * 20 / 100;
            harga_bayar = harga_beli - diskon;
            System.out.println("Selamat anda mendapatkan diskon sebesar 20%");
            System.out.println("Total harga yang akan anda bayar adalah Rp." + harga_bayar);
        } else {
            System.out.println("Anda tidak mendapatkan diskon");
            System.out.println("Total Harga yang akan anda bayar adalah Rp." + harga_beli);
        }
    }
}

