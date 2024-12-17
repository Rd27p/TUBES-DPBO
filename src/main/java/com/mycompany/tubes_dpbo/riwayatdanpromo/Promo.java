/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo.riwayatdanpromo;

/**
 *
 * @author Raka Darma
 */
public class Promo {
    public String kode;
    protected int hargaPromo;
    public int diskon;
    public String jenisKendaraan;

    public Promo(String kode, int hargaPromo, int diskon, String jenisKendaraan) {
        this.kode = kode;
        this.hargaPromo = hargaPromo;
        this.diskon = diskon;
        this.jenisKendaraan = jenisKendaraan;
    }
    
    public int calculateDiscountedPrice() {
        int discountAmount = (hargaPromo * diskon) / 100;
        return hargaPromo - discountAmount;
    }
    
    public static Promo[] getPromos() {
        return new Promo[] {
            new Promo("PROMO10", 10000, 5, "Mobil"),
            new Promo("PROMO20", 5000, 10, "Motor"),
            new Promo("PROMO30", 14000, 15, "Mobil"),
            new Promo("PROMO40", 15000, 15, "Motor")
        };
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }
    
    @Override
    public String toString() {
        return "Kode Promo: " + kode + "\n" +
               "Harga Awal: Rp" + hargaPromo + "\n" +
               "Diskon: " + diskon + "%\n" +
               "Harga Setelah Diskon: Rp" + calculateDiscountedPrice() + "\n" +
               "Jenis Kendaraan: " + jenisKendaraan;
    }

}
