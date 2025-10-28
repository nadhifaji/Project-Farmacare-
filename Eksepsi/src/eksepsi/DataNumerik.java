/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eksepsi;

import java.io.*;
class DemoInputNumerik {
    public static void main(String[] args) throws IOException {
        System.out.print("Masukkan sebuah bilangan bulat: ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String temp = br.readLine();
        int bilanganInput = 0;

        try {
            bilanganInput = Integer.parseInt(temp);
        } catch (NumberFormatException nfe) {
            System.out.println("Nilai yang dimasukkan bukan bilangan bulat");
            System.exit(1);
        }

        System.out.println("Bilangan yang anda masukkan adalah " + bilanganInput);
    }
}
