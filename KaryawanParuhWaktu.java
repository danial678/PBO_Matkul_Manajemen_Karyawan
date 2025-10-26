/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Acer-GK
 */
public class KaryawanParuhWaktu extends Karyawan {
    private int jamKerja;
    private int tarifPerJam;

    public KaryawanParuhWaktu(String nama, String nip, String alamat, int jamKerja, int tarifPerJam) {
        super(nama, nip, alamat);
        this.jamKerja = jamKerja;
        this.tarifPerJam = tarifPerJam;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getTarifPerJam() {
        return tarifPerJam;
    }

    public void setTarifPerJam(int tarifPerJam) {
        this.tarifPerJam = tarifPerJam;
    }

    @Override
    public double hitungGaji() {
        return jamKerja * tarifPerJam;
    }
}
