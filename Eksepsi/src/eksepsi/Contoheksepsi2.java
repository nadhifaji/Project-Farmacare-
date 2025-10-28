/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eksepsi;

public class Contoheksepsi2 {
    public static void main(String[] args) {
        int pembilang = 7;
        int penyebut = 0;

        try {
            int hasil = pembilang / penyebut; // SALAH
            System.out.println("Hasil = " + hasil);
        } catch (Exception e) {
            System.out.println("KESALAHAN: Terdapat pembagian dengan nol");
        }

        System.out.println("Statemen setelah blok try-catch");
    }
}
