package com.mycompany.tubes_dpbo.registrasi;

import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author naufa
 */
public class Driver {

    private HashMap<String, String> platNomor;

    public Driver() {
        platNomor = new HashMap<>();
    }

    // Method untuk menambahkan driver dengan plat nomor acak
    public void addRandomDriver() {
        String platNomer = generateRandomPlate();
        platNomor.put("driver", platNomer); // Key selalu "driver"
    }

    // Method untuk menghasilkan plat nomor acak
    private String generateRandomPlate() {
        String chars = "ABDZ";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        sb.append(chars.charAt(random.nextInt(chars.length())));

        // Bagian angka (4 digit)
        sb.append(" ");
        sb.append(random.nextInt(9000) + 1000); // Angka dari 1000 hingga 9999

        // Bagian huruf akhir (2 huruf)
        sb.append(" ");
        for (int i = 0; i < 3; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String name : platNomor.keySet()) {
            sb.append("Driver dengan plat nomor: ").append(platNomor.get(name)).append(" akan menjemput Anda.\n");
        }
        return sb.toString();
    }
}
