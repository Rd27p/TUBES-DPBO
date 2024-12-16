/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo.riwayatdanpromo;

import com.mycompany.tubes_dpbo.riwayatdanpromo.RPemesanan;

/**
 *
 * @author Raka Darma
 */
public class Riwayat extends RPemesanan {
    private double hargaPerKm; // Price per kilometer
    private double jarak; // Distance in kilometers

    public Riwayat(String name, String pickuplocation, String destination, String kendaraan, double hargaPerKm, double jarak) {
        super(name, pickuplocation, destination, kendaraan);
        this.hargaPerKm = hargaPerKm;
        this.jarak = jarak;
    }

    // Implementation of total price calculation
    @Override
    public double totalHarga() {
        return hargaPerKm * jarak;
    }

    // Implementation of toString
    @Override
    public String toString() {
        return "Pemesanan dengan Nama\t: " + super.getName() + 
               "\nLokasi Penjemputan\t: " + super.getPickuplocation() + 
               "\nTujuan\t\t\t: " + super.getDestination() + 
               "\nMenggunakan Kendaraan\t: " + super.getKendaraan() + 
               "\nTotal Harga\t\t: " + totalHarga();
    }
}


