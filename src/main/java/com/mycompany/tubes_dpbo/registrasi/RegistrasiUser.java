/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo.registrasi;

import com.mycompany.tubes_dpbo.registrasi.Registrasi;

/**
 *
 * @author Raka Darma
 */
public class RegistrasiUser extends Registrasi {
    private String password;

    public RegistrasiUser(String password, String nama, String noTelp, String email) {
        super(nama, noTelp, email);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void verifikasiUser() {
        if (getNama() != null && !getNama().isEmpty() && getNoTelp() != null && !getNoTelp().isEmpty() && getEmail() != null && !getEmail().isEmpty() && password != null && !password.isEmpty()) {
            System.out.println("Verifikasi user berhasil!");
        } else {
            System.out.println("Verifikasi user gagal. Pastikan semua data telah diisi dengan benar.");
        }
    }
     
}
