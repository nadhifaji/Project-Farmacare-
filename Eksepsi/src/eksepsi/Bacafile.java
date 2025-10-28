/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eksepsi;

import java.io.*;
class DemoBacaFile {
    public static void main(String[] args) {
        FileInputStream finput = null;
        int data;

        try {
            finput = new FileInputStream("d:/INPUT.TXT");
        } catch (FileNotFoundException fnfe) {
            System.out.println("File tidak ditemukan.");
            return;
        }

        try {
            while ((data = finput.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            return;
        }

        try {
            finput.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
