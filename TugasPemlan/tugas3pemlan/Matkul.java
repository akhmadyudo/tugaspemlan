package tugas3pemlan;

public class Matkul {
    private String kodeMK;
    private String namaMK;
    private double nilai;

    public Matkul(String kodeMK, String namaMK, double nilai){
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.nilai = nilai;
    }
    public String getKodeMK() {return kodeMK;}
    public void setKodeMK(String kodeMK) {this.kodeMK = kodeMK;}
    public String getNamaMK() {return namaMK;}
    public void setNamaMK(String namaMK) {this.namaMK = namaMK;}
    public String getNilaiHuruf() {
        if (nilai >= 80) {
            return "A";
        } else if (nilai >= 70) {
            return "B";
        } else if (nilai >= 60) {
            return "C";
        } else if (nilai >= 50) {
            return "D";
        } else {
            return "E";
        }
    }
    public void setNilai(double nilai) {this.nilai = nilai;}
 }

