/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo.pesananSelesai;

/**
 *
 * @author Raka Darma
 */
public class Pembayaran {
    public int bayar;
    public String MetodeBayar;

    public String getMetodeBayar() {
        return MetodeBayar;
    }
    
    public void MetodePembayaran() {
        switch (bayar) {
            case 1:
                this.MetodeBayar = "Cash";
                break;
            case 2:
                this.MetodeBayar = "Debit";
                break;
            default:
                throw new IllegalArgumentException("Metode Pembayaran tidak valid");
        }
    }
    
    @Override
    public String toString() {
        return "Metode pembayaran anda " + this.MetodeBayar;
    }
}
