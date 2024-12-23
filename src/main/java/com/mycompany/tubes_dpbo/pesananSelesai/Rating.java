/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo.pesananSelesai;

/**
 *
 * @author Raka Darma
 */
public class Rating {

    public int rating;
    public String statusRating;

    public Rating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public String getStatusRating() {
        return statusRating;
    }

    public void Rate() {
        switch (rating) {
            case 1:
                this.statusRating = "Sangat tidak puas";
                break;
            case 2:
                this.statusRating = "Tidak puas";
                break;
            case 3:
                this.statusRating = "Biasa aja";
                break;
            case 4:
                this.statusRating = "Puas";
                break;
            case 5:
                this.statusRating = "Sangat puas";
                break;
            default:
                throw new IllegalArgumentException("Rating harus antara 1 dan 5.");
        }
    }

    @Override
    public String toString() {
        return "Anda memberikan rating " + this.rating + " (" + this.statusRating + ") ";
    }
}
