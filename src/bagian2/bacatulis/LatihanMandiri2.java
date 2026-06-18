/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LatihanMandiri2 {
    public static void main(String[] args) {

        // Soal 1
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt"))) {
            for (String h : hari) {
                penulis.println(h);
            }
        } catch (IOException e) {
            System.out.println("Gagal menulis: " + e.getMessage());
        }

        System.out.println("== Isi hari.txt setelah ditulis ==");
        tampilkanIsiBerkas();

        // Soal 2
        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt", true))) {
            penulis.println("Sabtu");
            penulis.println("Minggu");
        } catch (IOException e) {
            System.out.println("Gagal menambah data: " + e.getMessage());
        }

        System.out.println();
        System.out.println("== Isi hari.txt setelah ditambah ==");
        tampilkanIsiBerkas();

        // Soal 3
        int jumlah = 0;
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            while (pembaca.readLine() != null) {
                jumlah++;
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
        System.out.println();
        System.out.println("Jumlah baris: " + jumlah);
    }

    private static void tampilkanIsiBerkas() {
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
    }
}
