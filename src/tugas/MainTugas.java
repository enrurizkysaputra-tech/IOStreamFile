/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// Nama : Enru Rizky
// NPM  : 2410010143
package tugas;

public class MainTugas {
    public static void main(String[] args) {
        // Array kategori (ukuran tetap, minimal 3)
        String[] kategori = {"Elektronik", "Sembako", "Alat Tulis"};
        System.out.println("== Daftar Kategori ==");
        for (String k : kategori) {
            System.out.println("- " + k);
        }
        System.out.println();

        Gudang gudang = new Gudang("barang.txt");
        gudang.tambahBarang(new Barang("Kabel HDMI", 45000, 20));
        gudang.tambahBarang(new Barang("Beras 5kg", 65000, 50));
        gudang.tambahBarang(new Barang("Pulpen", 3000, 100));
        gudang.tambahBarang(new Barang("Buku Tulis", 5000, 80));
        gudang.tambahBarang(new Barang("Charger HP", 35000, 30));

        gudang.tampilkanSemua();
        System.out.println("Total nilai persediaan: Rp" + gudang.totalNilai());
        gudang.simpanKeBerkas();

        System.out.println();
        Gudang gudangLain = new Gudang("barang.txt");
        gudangLain.muatDariBerkas();
        gudangLain.tampilkanSemua();
        System.out.println("Jumlah barang: " + gudangLain.jumlahBarang());
        System.out.println("Total nilai persediaan: Rp" + gudangLain.totalNilai());
    }
}
