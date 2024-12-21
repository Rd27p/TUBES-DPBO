/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo.pemesanan;

import com.mycompany.tubes_dpbo.pemesanan.Pemesanan;

/**
 *
 * @author Raka Darma
 */
public class Mobil extends Pemesanan implements Kendaraan {
    private int total;

    public Mobil(String Name, String pickuplocation, String destination, String kendaraan) {
        super(Name, pickuplocation, destination, kendaraan);
    }
    
    @Override
    public int totalHarga() {
        int jarakPerKilometer = 5000; // Harga per kilometer
        int jarak = 0;

        switch (getDestination().toLowerCase()) {
            case "cibiru":
                jarak = 14;
                break;
            case "baleendah":
                jarak = 8;
                break;
            case "margaasih":
                jarak = 11;
                break;
            case "cimahi":
                jarak = 18;
                break;
            case "kiaracondong":
                jarak = 5;
                break;
            default:
                // Tambahkan logika untuk jarak default atau jarak yang tidak diketahui
                jarak = 0;
                System.out.println("Jarak tujuan tidak diketahui");
        }
        return jarak * jarakPerKilometer;
    }
    
    @Override
    public String toString() {
        return "Pemesanan dengan Nama\t: " + super.getName() + "\nLokasi Penjemputan\t: " 
                + super.getPickuplocation() + "\nTujuan\t\t\t: " + super.getDestination() 
                + "\nMenggunakan Kendaraan\t: " + super.getKendaraan() + "\nTotal Harga\t\t: " + totalHarga();
    }
}

