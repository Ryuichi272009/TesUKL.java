package TesUkl;
import java.util.Scanner;
public class tesUKL2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan bilangan");
        int j = s.nextInt();
        if(j % 2==0 ){
            System.out.println("Bilangan tersebut adalah genap");

        } else {
            System.out.println("Bilangan tersebut adalah ganjil");
        }
    }

    
    

}
