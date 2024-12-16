/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo.riwayatdanpromo;

/**
 *
 * @author Raka Darma
 */
public abstract class RPemesanan {
    protected String name; // Driver or User Name
    protected String pickuplocation;
    protected String destination;
    protected String kendaraan; // Vehicle type

    public RPemesanan(String name, String pickuplocation, String destination, String kendaraan) {
        this.name = name;
        this.pickuplocation = pickuplocation;
        this.destination = destination;
        this.kendaraan = kendaraan;
    }

    // Getter methods for the fields
    public String getName() {
        return name;
    }

    public String getPickuplocation() {
        return pickuplocation;
    }

    public String getDestination() {
        return destination;
    }

    public String getKendaraan() {
        return kendaraan;
    }

    // Abstract method for total price calculation
    public abstract double totalHarga();

    // Abstract toString method
    @Override
    public abstract String toString();

    public boolean getDetail() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

