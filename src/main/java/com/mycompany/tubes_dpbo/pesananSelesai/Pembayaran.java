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
   public int Bayar;
    public String MetodeBayar;

    public Pembayaran(int Bayar, String metodeBayar) {
        this.Bayar = Bayar;
    }

    public int getBayar() {
        return Bayar;
    }

    public String getMetodeBayar() {
        return MetodeBayar;
    }
    
    @Override
    public String toString() {
        return "Anda telah membayar Rp." + this.Bayar + " dengan metode " + this.MetodeBayar;
    }
}
