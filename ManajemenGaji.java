/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;
import java.util.ArrayList;
/**
 *
 * @author Acer-GK
 */
public class ManajemenGaji {
    public static void main(String[] args) {
        ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();
        Karyawan k1 = new KaryawanKontrak("Paleso", "K01", "Jl. Mawar No. 12", 3000000, 500000);
        Karyawan k2 = new KaryawanParuhWaktu("Irpan", "P01", "Jl. Melati No. 5", 80, 25000);
        daftarKaryawan.add(k1);
        daftarKaryawan.add(k2);
        tampilkanTotalGaji(daftarKaryawan);
    }

    public static void tampilkanTotalGaji(ArrayList<Karyawan> daftarKaryawan) {
        System.out.println("===== LAPORAN GAJI KARYAWAN UMKM NASI LELE PAK KUMIS =====");
        for (Karyawan k : daftarKaryawan) {
            String tipeKaryawan = (k instanceof KaryawanKontrak) ? "Karyawan Kontrak" : "Karyawan Paruh Waktu";
            System.out.println("Nama           : " + k.getNama());
            System.out.println("Tipe Karyawan  : " + tipeKaryawan);
            System.out.println("Gaji Diterima  : Rp" + k.hitungGaji());
            System.out.println("------------------------------------------------------------");
        }
    }
}
