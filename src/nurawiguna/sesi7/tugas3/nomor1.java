package nurawiguna.sesi7.tugas3;

class Encapsulation {
    private String nama;
    private int nim;

    public String getNama() {
        return this.nama;
    }

    public void ModifNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return this.nim;
    }

    public void ModifNim(int nim) {
        this.nim = nim;
    }
}

public class nomor1 {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.ModifNim(1420123);
        obj.ModifNama("Mahasiswa");
        System.out.println("Nama: " + obj.getNama());
        System.out.println("NIM: " + obj.getNim());
    }
}
