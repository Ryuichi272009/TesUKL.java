
package TesUkl;
import java.util.Scanner;

public class tesUKL {
    public static void main(String[] args) {
        int jumlahSiswa, nilai, totalNilai = 0;
        double rataRata = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan jumlah siswa");
        jumlahSiswa =s.nextInt();
         
        for (int i = 1; i <=jumlahSiswa; i++) {
            System.out.println("Masukkan nilai "+i +":");
            nilai = s.nextInt();
            totalNilai = totalNilai + nilai;
        }

            rataRata = totalNilai/jumlahSiswa;
            System.out.println("jumlah siswa "+ jumlahSiswa);
            System.out.println("Rata rata nilai "+ rataRata);
            s.close();


            
            


         



    }
}

    

