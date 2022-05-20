package nurawiguna.sesi5.tugas2;

public class Bilangan {
    public static void main(String[] args) {
        // Sebelum
        System.out.println("-- Sebelum di Modifikasi --");
        System.out.print("Bilangan Ganjil dari 1 - 30 : ");
        for (int x = 1; x <= 30; x++) {
            if (x % 2 == 1)
                System.out.print(" " + x);
        }

        // Sesudah
        System.out.println("\n-- Sesudah di Modifikasi --");
        System.out.print("Bilangan Genap dari 1 - 30  : ");
        for (int x = 1; x <= 30; x++) {
            if (x % 2 == 0)
                System.out.print(" " + x);
        }
    }
}
