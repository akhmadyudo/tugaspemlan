package TugasPemlan;
 // R. Akhmad Kusumo Yudo
 // 235150407111062
import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa {
    private String nim;
    private String nama;
    private String alamat;

    public Mahasiswa(String nim, String nama, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}

public class Tugas1 {

    public static void main(String[] a) {
        ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean next;
        do {
            System.out.print("masukkan nim : ");
            String nim = scanner.nextLine();

            System.out.print("masukkan nama : ");
            String nama = scanner.nextLine();

            System.out.print("masukkan alamat: ");
            String alamat = scanner.nextLine();

            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat);
            mahasiswas.add(mahasiswa);

            System.out.print("tambah lagi? (y/n): ");
            String tambah = scanner.nextLine();
            next = tambah.equalsIgnoreCase("y");

        } while (next);

        System.out.println("==================================");
        for (Mahasiswa mahasiswa : mahasiswas) {
            System.out.println(mahasiswa.getNim() + " | " + mahasiswa.getNama() + " | " + mahasiswa.getAlamat());
        }
    }
}