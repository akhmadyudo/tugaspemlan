package tugas3pemlan;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        char lagi;

        do {
            System.out.println("===APLIKASI KHS MAHASISWA===");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Cetak KHS");
            System.out.println("3. Keluar");
            System.out.print("Silahkan Pilih Nomor Layanan: ");
                lagi = in.next().charAt(0);

                switch (lagi) {
                    case '1':
                        System.out.print("Masukkan nama mahasiswa: ");
                        String namaMahasiswa = in.next();
                        System.out.print("Masukkan NIM mahasiswa: ");
                        String nimMhs = in.next();

                        Mahasiswa mahasiswaBaru = new Mahasiswa(nimMhs, namaMahasiswa);

                        char tambahLagi;
                            do {
                                System.out.print("Kode mata kuliah: ");
                                String kodeMK = in.next();
                                System.out.print("Nama mata kuliah: ");
                                String namaMK = in.next();
                                System.out.print("Nilai mata kuliah (dalam angka): ");
                                double nilai = in.nextDouble();
                                Matkul mk = new Matkul(kodeMK, namaMK, nilai);
                                mahasiswaBaru.addMatKul(mk);
                                System.out.println("Apakah ingin menambah matkul? y/n");
                                tambahLagi = in.next().charAt(0);
                            } while (tambahLagi=='y' || tambahLagi == 'y');
                            daftarMahasiswa.add(mahasiswaBaru);
                            System.out.println("Sukses memasukkan data mahasiswa.\nSilahkan pilih opsi nomor 2 untuk mencetak ulang KHS");

                    case '2':
                        if (daftarMahasiswa.isEmpty()) {
                            System.out.println("Mohon untuk memasukkan data yang tepat terlebih dahulu!");
                        } else {
                            for (Mahasiswa mhs : daftarMahasiswa) {
                                mhs.cetakKHS();
                            }
                        }
                        break;

                    case '3': System.out.println("Terima kasih telah menggunakan layanan ini.\nSampai jumpa lagi.");
                    break;

                    default: System.out.println("Harap pilih angka 1-3 dengan layanan sesuai keterangan yang ada!");
                }
        } while (lagi != '3'); in.close();
    }
}
