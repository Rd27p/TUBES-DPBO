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
    public double diskon;
    public String jenisKendaraan;

    public Promo(String kode, int diskon, String jenisKendaraan) {
        this.kode = kode;
        this.diskon = diskon;
        this.jenisKendaraan = jenisKendaraan;
    }
    
    public double calculateDiscountedPrice() {
        double discountedPrice = (100 - diskon);
        return discountedPrice;
    }
    
    public static Promo[] getPromos() {
        return new Promo[] {
            new Promo("PROMO10", 5, "Mobil"),
            new Promo("PROMO20", 10, "Motor"),
            new Promo("PROMO30", 15, "Mobil"),
            new Promo("PROMO40", 15, "Motor")
        };
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }
    
    @Override
    public String toString() {
        return "Kode Promo: " + kode + "\n" +
               "Diskon: " + diskon + "%\n" +
               "Harga Setelah Diskon: Rp" + calculateDiscountedPrice() + "\n" +
               "Jenis Kendaraan: " + jenisKendaraan;
    }
}

