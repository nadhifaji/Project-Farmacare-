/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;
/**
 *
 * @author Alfiatul Rofiah
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    private String golongan;
    private String prodi;
    private double uts;
    private double uas;

// Constructor
    public Mahasiswa(String nama, String nim, String golongan, 
    String prodi, double uts, double uas) {
        this.nama = nama;
        this.nim = nim;
        this.golongan = golongan;
        this.prodi = prodi;
        this.uts = uts;
        this.uas = uas;
    }
// Setter dan Getter (Encapsulation)
    public double getUts() {
        return uts;
    }
    public void setUts(double uts) {
        this.uts = uts;
    }
    public double getUas() {
        return uas;
    }
    public void setUas(double uas) {
        this.uas = uas;
    }

    // Method menghitung rata-rata nilai
    public double rataRataNilai() {
        // Rumus rata-rata = (UTS + UAS) / 2
        return (uts + uas) / 2;
    }

  
// Method menampilkan data mahasiswa
    public void cetakData() {
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama      : " + nama);
        System.out.println("NIM       : " + nim);
        System.out.println("Golongan  : " + golongan);
        System.out.println("Prodi     : " + prodi);
        System.out.println("Nilai UTS : " + uts);
        System.out.println("Nilai UAS : " + uas);
        System.out.println("Rata-rata : " + rataRataNilai());
        System.out.println("---------------------------");
    }
}

