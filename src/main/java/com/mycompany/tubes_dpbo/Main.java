/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tubes_dpbo;

/**
 *
 * @author Raka Darma
 */
import com.mycompany.tubes_dpbo.pemesanan.Mobil;
import com.mycompany.tubes_dpbo.pemesanan.Motor;
import com.mycompany.tubes_dpbo.penjemputan.Penjemputan;
import com.mycompany.tubes_dpbo.pemesanan.Pemesanan;
import com.mycompany.tubes_dpbo.penjemputan.Pengantaran;
import com.mycompany.tubes_dpbo.registrasi.Registrasi;
import com.mycompany.tubes_dpbo.registrasi.RegistrasiUser;
import com.mycompany.tubes_dpbo.riwayatdanpromo.Promo;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<RegistrasiUser> user = new ArrayList<>();
        ArrayList<Pemesanan> pemesanans = new ArrayList<>();

        while (true) {
            System.out.println("\n=== APLIKASI ANTAR JEMPUT KENDARAAN ONLINE ===");
            System.out.println("1. Registrasi User");
            System.out.println("2. Verifikasi User");
            System.out.println("3. Login User");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    String namaUser = scanner.nextLine();
                    System.out.print("Masukkan nomor telepon: ");
                    String noTelpUser = scanner.nextLine();
                    System.out.print("Masukkan email: ");
                    String emailUser = scanner.nextLine();
                    System.out.print("Masukkan alamat: ");
                    String alamatUser = scanner.nextLine();

                    RegistrasiUser newUser = new RegistrasiUser(alamatUser, namaUser, noTelpUser, emailUser);

                    if (Registrasi.isEmpty(newUser.getNama(), newUser.getNoTelp(), newUser.getEmail(), newUser.getAlamat(), null, null)) {
                        System.out.println("Registrasi user gagal. Semua data harus diisi.");
                    } else {
                        user.add(newUser);
                        System.out.println("Registrasi user berhasil!");
                    }
                    break;

                case 2:
                    if (!user.isEmpty()) {
                        System.out.println("\n=== DAFTAR USER TERDAFTAR ===");
                        for (int i = 0; i < user.size(); i++) {
                            System.out.println((i + 1) + ". " + user.get(i).getNama());
                        }
                        System.out.println("============================");

                        System.out.print("Masukkan nama user yang ingin diverifikasi: ");
                        String namaVerifikasi = scanner.nextLine();
                        boolean userDitemukan = false;

                        for (RegistrasiUser users : user) {
                            if (users.getNama().equalsIgnoreCase(namaVerifikasi)) {
                                users.verifikasiUser();
                                userDitemukan = true;
                                break;
                            }
                        }
                        if (!userDitemukan) {
                            System.out.println("User dengan nama tersebut tidak ditemukan.");
                        }
                    } else {
                        System.out.println("Belum ada data user yang terdaftar.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan nama Anda untuk masuk ke Menu Utama: ");
                    String namaMasuk = scanner.nextLine();
                    boolean isUserRegistered = false;

                    for (RegistrasiUser users : user) {
                        if (users.getNama().equalsIgnoreCase(namaMasuk)) {
                            isUserRegistered = true;
                            System.out.println("Selamat datang, " + users.getNama() + "!");
                            showMenuUtama(scanner, pemesanans); // Pass pemesanans to showMenuUtama
                            break;
                        }
                    }
                    if (!isUserRegistered) {
                        System.out.println("Nama tidak ditemukan. Silakan registrasi terlebih dahulu.");
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan sistem registrasi!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void showMenuUtama(Scanner scanner, ArrayList<Pemesanan> pemesanans) {
        while (true) {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Pesan Kendaraan");
            System.out.println("2. Riwayat");
            System.out.println("3. Promo");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = scanner.nextInt();
            scanner.nextLine();

            switch (pilih) {
                case 1:
                    // Pesan kendaraan
                    System.out.println("Pilih jenis kendaraan:");
                    System.out.println("1. Motor");
                    System.out.println("2. Mobil");
                    System.out.print("Masukkan pilihan kendaraan: ");
                    int kendaraanPilih = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Masukkan nama: ");
                    String name = scanner.nextLine();

                    // Input lokasi penjemputan
                    Penjemputan penjemputan;
                    String pickuplocation;
                    while (true) {
                        try {
                            System.out.print("Masukkan lokasi penjemputan: ");
                            pickuplocation = scanner.nextLine();
                            penjemputan = new Penjemputan(pickuplocation);
                            penjemputan.alamatAsal(pickuplocation); // Menetapkan alamat asal
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }

                    // Input tujuan
                    Pengantaran pengantaran;
                    String destination;
                    while (true) {
                        try {
                            System.out.print("Masukkan tujuan: ");
                            destination = scanner.nextLine();
                            pengantaran = new Pengantaran(name, destination);
                            pengantaran.alamatTujuan(destination); // Menetapkan alamat tujuan
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }

                    // Proses pemesanan kendaraan
                    Pemesanan pemesanan;
                    int hargaAwal = 0;

                    if (kendaraanPilih == 1) {
                        pemesanan = new Motor(name, pickuplocation, destination);
                        hargaAwal = 3000; // Harga awal untuk Motor
                    } else if (kendaraanPilih == 2) {
                        pemesanan = new Mobil(name, pickuplocation, destination);
                        hargaAwal = 5000; // Harga awal untuk Mobil
                    } else {
                        System.out.println("Pilihan kendaraan tidak valid.");
                        break;
                    }

                    // Input kode promo
                    System.out.print("Masukkan kode promo (jika ada): ");
                    String inputKodePromo = scanner.nextLine();
                    Promo appliedPromo = null;

                    for (Promo promo : Promo.getPromos()) {
                        if (promo.kode.equalsIgnoreCase(inputKodePromo)
                                && promo.jenisKendaraan.equalsIgnoreCase(pemesanan.getKendaraan())) {
                            appliedPromo = promo;
                            break;
                        }
                    }

                    // Hitung harga setelah diskon
                    int hargaSetelahDiskon = hargaAwal;
                    if (appliedPromo != null) {
                        hargaSetelahDiskon = appliedPromo.calculateDiscountedPrice();
                        System.out.println("Kode promo berhasil diterapkan! Diskon: " + appliedPromo.diskon + "%");
                    } else if (!inputKodePromo.isEmpty()) {
                        System.out.println("Kode promo tidak valid atau tidak cocok dengan jenis kendaraan!");
                    }

                    System.out.println("Harga Awal: Rp" + hargaAwal);
                    System.out.println("Harga Setelah Diskon: Rp" + hargaSetelahDiskon);

                    // Tambahkan ke riwayat pemesanan
                    pemesanans.add(pemesanan);
                    System.out.println("Pemesanan berhasil!");
                    System.out.println(pemesanan.toString());
                    System.out.println("Detail Pengantaran: ");
                    pengantaran.alamatTujuan(destination); // Menampilkan tujuan pengantaran
                    break;

                case 2:
                    if (pemesanans.isEmpty()) {
                        System.out.println("Belum ada riwayat pemesanan.");
                    } else {
                        System.out.println("\n=== RIWAYAT PEMESANAN ===");
                        for (int i = 0; i < pemesanans.size(); i++) {
                            System.out.println((i + 1) + ". " + pemesanans.get(i).toString());
                        }

                        System.out.print("Masukkan nomor pemesanan untuk melihat detail (atau 0 untuk kembali): ");
                        int nomor = scanner.nextInt();
                        scanner.nextLine();

                        if (nomor > 0 && nomor <= pemesanans.size()) {
                            Pemesanan pemesananDetail = pemesanans.get(nomor - 1);
                            System.out.println("\n=== DETAIL PEMESANAN ===");
                            System.out.println(pemesanans.get(nomor - 1).toString());
                        } else if (nomor == 0) {
                            break;
                        } else {
                            System.out.println("Pilihan tidak valid.");
                        }
                    }
                    break;
                case 3:
                    // Display available promos
                    System.out.println("\n=== DAFTAR PROMO ===");
                    Promo[] promos = Promo.getPromos();
                    for (Promo promo : promos) {
                        System.out.println(promo.toString());
                        System.out.println("-----------------------");
                    }
                    break;
                case 4:
                    System.out.println("Keluar dari Menu Utama.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
