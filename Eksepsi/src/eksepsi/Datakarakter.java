/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eksepsi;

import java.io.*;
class DemoInputKarakter {
    public static void main(String[] args) throws IOException {
        System.out.print("Masukkan sebuah karakter: ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        char karakterInput = (char) br.read();
        System.out.println("Karakter yang dimasukkan adalah \"" + karakterInput + "\"");
    }
}

  
