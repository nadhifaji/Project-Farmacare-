/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eksepsi;


import java.io.*;
class DemoInputString {
    public static void main(String[] args) throws IOException {
        System.out.print("Masukkan nama Anda: ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String namaInput = br.readLine();
        System.out.println("Halo " + namaInput + "...");
        System.out.println("Semoga Anda Sukses Selalu..");
    }
}
