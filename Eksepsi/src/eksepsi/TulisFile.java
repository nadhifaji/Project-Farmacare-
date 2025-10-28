/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tm10ekseption;
import java.io.*;
/**
 *
 * @author Alfiatul Rofiah
 */
public class TulisFile {
    public static void main(String[] args) {
        FileOutputStream foutput = null;
        String data = "Hello Guys! \nSemoga \nSukses Selalu..";

        // membuka file
        try {
            foutput = new FileOutputStream("d:/OUTPUT.TXT");
        } catch (FileNotFoundException fnfe) {
            System.out.println("File tidak dapat terbentuk.");
            return;
        }

        // menulis data ke dalam file
        try {
            for (int i = 0; i < data.length(); i++) {
                // data akan dikonversi per karakter
                foutput.write((int) data.charAt(i));
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            return;
        }

        // menutup file
        try {
            foutput.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}