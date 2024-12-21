/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo.registrasi;

/**
 *
 * @author Raka Darma
 */
public class Registrasi {

    private String nama;
    private String noTelp;
    private String email;

    public Registrasi(String nama, String noTelp, String email) {
        this.nama = nama;
        this.noTelp = noTelp;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public String getEmail() {
        return email;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static boolean isEmpty(String nama, String noTelp, String email, String password) {
        return (nama == null || nama.isEmpty()
                || (noTelp == null || noTelp.isEmpty())
                || (email == null || email.isEmpty())
                || (password != null && password.isEmpty()));
    }
}
