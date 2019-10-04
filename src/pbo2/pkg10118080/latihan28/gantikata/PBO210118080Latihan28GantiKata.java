/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama :Taufiq Rizky
 * NIM  :10118080
 * Deskripsi Program    : program mencari dan mengganti kata
 */
public class PBO210118080Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===== Program Mengganti Kata =====");
        System.out.println("");
        System.out.print("Masukan Kalimat\t: ");
        Scanner kal = new Scanner(System.in);
        String Kalimat = kal.nextLine();
        System.out.print("Ganti Kata\t: ");
        Scanner a = new Scanner(System.in);
        String kata1 = a.next();
        System.out.print("Menjadi Kata\t: ");
        Scanner b = new Scanner(System.in);
        String kata2 = b.next();
        String KalimatBaru=Kalimat.replaceAll(kata1,kata2);
        
        System.out.println("");
        System.out.println("==== Hasil Formatting ====");
        System.out.println("Kalimat Awal : "+Kalimat);
        System.out.println("Kalimat Baru : "+KalimatBaru);
                
    }
    
}
