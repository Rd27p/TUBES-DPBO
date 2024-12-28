/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.tubes_dpbo.pemesanan;

/**
 *
 * @author naufa
 */
public class Pemesanan {
    private String Name;
    private String pickuplocation;
    private String destination;
    private String kendaraan;

    public Pemesanan(String Name, String pickuplocation, String destination, String kendaraan) {
        this.Name = Name;
        this.pickuplocation = pickuplocation;
        this.destination = destination;
        this.kendaraan = kendaraan;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPickuplocation() {
        return pickuplocation;
    }

    public void setPickuplocation(String pickuplocation) {
        this.pickuplocation = pickuplocation;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(String kendaraan) {
        this.kendaraan = kendaraan;
    }
    
    @Override
    public String toString() {
        return "Pemesanan dengan Nama: " + Name + ", Lokasi Penjemputan: " + pickuplocation + ", Tujuan: " + destination + ", Menggunakan Kendaraan: " + kendaraan;
    }

    public int totalHarga() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}