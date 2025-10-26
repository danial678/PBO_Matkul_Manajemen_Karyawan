/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Acer-GK
 */
public abstract class Karyawan {
    // Encapsulation (atribut private)
    private String nama;
    private String nip;
    private String alamat;
    public Karyawan(String nama, String nip, String alamat) {
        this.nama = nama;
        this.nip = nip;
        this.alamat = alamat;
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public abstract double hitungGaji();
}

