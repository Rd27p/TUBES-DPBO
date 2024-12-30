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
    protected String name;
    protected String pickuplocation;
    protected String destination;
    protected String kendaraan; 

    public RPemesanan(String name, String pickuplocation, String destination, String kendaraan) {
        this.name = name;
        this.pickuplocation = pickuplocation;
        this.destination = destination;
        this.kendaraan = kendaraan;
    }

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
    
    public abstract double totalHarga();

    @Override
    public abstract String toString();   
}

