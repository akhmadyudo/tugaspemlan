package tugas3pemlan;
import java.util.ArrayList;

public class Mahasiswa {
    private String nimMhs;
    private String namaMhs;
    private ArrayList<Matkul> matKul;

    public Mahasiswa(String nimMhs, String namaMhs) {
        this.nimMhs = nimMhs;
        this.namaMhs = namaMhs;
        this.matKul = new ArrayList<>();
    }

    public void addMatKul(Matkul mk) {
        matKul.add(mk);
    }

    public void cetakKHS() {
        System.out.println("===Data Mahasiswa===");
        System.out.println("Nama: " + namaMhs);
        System.out.println("NIM: " + nimMhs);
        System.out.println("====Hasil Studi====");

        for (Matkul mk : matKul) {
            System.out.println("Kode MK: " + mk.getKodeMK() +
                    "\nNama MK: " + mk.getNamaMK() +
                    "\nNilai: " + mk.getNilaiHuruf());
        }
    }
    public String getNimMhs() {return nimMhs;}

    public void setNimMhs(String nimMhs) {this.nimMhs = nimMhs;}
    public String getNamaMhs() {return namaMhs;}
    public void setNamaMhs(String namaMhs) {this.namaMhs = namaMhs;}

}
