/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eksepsi;

/**
 *
 * @author MEYSILA FEBIANA
 */
public class ContohMultiEksepsi {
    public static void cobaEksepsi(int pembilang, int penyebut) {
        try {
            int hasil = pembilang / penyebut;
            System.out.println("Hasil bagi: " + hasil);
            int[] Arr = {1, 2, 3, 4, 5}; // array dengan 5 elemen
            Arr[10] = 23; // mengakses indeks ke-10 (salah!)
        } 
        catch (ArithmeticException e) {
            System.out.println("Terdapat pembagian dengan 0");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indeks di luar rentang");
        }
    }

    public static void main(String[] args) {
        cobaEksepsi(4, 0);   // menimbulkan ArithmeticException
        System.out.println();
        cobaEksepsi(12, 4);  // menimbulkan ArrayIndexOutOfBoundsException
    }
}