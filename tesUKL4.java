package TesUkl;
import java.util.Scanner;
public class tesUKL4 {
    public static void main(String[] args) {
        String nama;
        int masaKerja;
        String Kinerja;

        Scanner o = new Scanner(System.in);
        System.out.println("Masukkan nama karyawan:");
        nama = o.nextLine();

        System.out.println("Masukkan masa kerja (3/4/5/atau lebih):");
        masaKerja = o.nextInt();
        System.out.println("Masukkan nilai kinerja (Baik/cukup/kurang)");
        Kinerja = o.next();

        if (masaKerja >= 5);
        if(Kinerja.equalsIgnoreCase("Baik")) {
            System.out.println("Selamat anda mendapatkan bonus 10.000.000 karena kinerja anda baik");
            }else if (Kinerja.equalsIgnoreCase("cukup")) {
                System.out.println("Selamat anda mendapatkan bonus 5.000.000 karena kinerja anda cukup");
            }else if (Kinerja.equalsIgnoreCase("kurang")) {
                System.out.println("Selamat anda tidak mendapatkan bonus karena kinerja anda kurang");
                
                
                    
                
         } else {
            System.out.println("maaf anda belum bisa mememuhi syarat karena belum cukup umur");
            
         }



        

    }
}
