package TesUkl;

import java.util.Scanner;

public class tesUKL3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        String[][] pelanggan = {
            {"1", "jedi", "1", "Sawojajar"},
            {"2", "indro", "3", "Blimbing"},
            {"3", "Jedi", "2", "Lowokwaru"},
            {"4", "Kanu", "3", "Klojen"}
        };
        
        int[][] tarif = {
            {1, 1000},
            {2, 1500},
            {3, 2000}
        };
         
        System.out.print("Masukkan ID Pelanggan: ");
        int idPelanggan = input.nextInt();
        
        String[] dataPelanggan = null;
        for (String[] p : pelanggan) {
            if (Integer.parseInt(p[0]) == idPelanggan) {
                dataPelanggan = p;
                break;
            }
        }
        
 
        if (dataPelanggan == null) {
            System.out.println("Pelanggan dengan ID " + idPelanggan + " tidak ditemukan.");
            return;
        }
        
        System.out.print("Masukkan jumlah pemakaian kWh: ");
        int pemakaian = input.nextInt();
        
        int golongan = 0;
        int hargaPerKwh = 0;
        for (int[] t : tarif) {
            if (t[0] == golongan) {
                hargaPerKwh = t[1];
                break;
            }
        }
        
      int tagihan = pemakaian * hargaPerKwh;
        
      
      System.out.println("\nID Pelanggan: " + dataPelanggan[0]);
        System.out.println("Nama Pelanggan: " + dataPelanggan[1]);
        System.out.println("Golongan: " + dataPelanggan[2]);
        System.out.println("Alamat: " + dataPelanggan[3]);
        System.out.println("Jumlah kWh: " + pemakaian);
        System.out.println("Tagihan: Rp. " + tagihan);
        
        input.close();
    }
}
