package nurawiguna.sesi4;

import java.util.*;

public class diskusi4 {
    public static void main(String[] args) {
        // Ini Percabangan
        System.out.println("---- Ini adalah Percabangan dengan if condition ----");
        nilaiuas();

        // ini adalah perulangan
        System.out.println("---- Ini adalah Perulangan dengan for ----");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }
        
    }

    public static void nilaiuas() {
        int uas = 84;
        char grade;
        String MataKuliah = "Pemrograman Berbasis Desktop";

        if (uas >= 85) {
            grade = 'A';
        } else if (uas >= 70 && uas <= 84) {
            grade = 'B';
        } else if (uas >= 60 && uas <= 69) {
            grade = 'C';
        } else if (uas >= 50 && uas <= 59) {
            grade = 'D';
        } else {
            grade = 'E';
        }
        System.out.println("\nMata Kuliah : " + MataKuliah);
        System.out.println("Nilai UAS" + "\t" + ": " + uas);
        System.out.println("Grade" + "\t" + "\t" + ": " + grade + "\n");
    }
}
