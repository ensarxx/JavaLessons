import java.util.Scanner;
import java.lang.Math;

public class UcgenAlanHesapla {

    public static void main(String[] args) {

        double kenar1,kenar2,kenar3;


        Scanner input = new Scanner(System.in);
        System.out.println("Kenar 1'i Giriniz");
        kenar1 = input.nextDouble();
        System.out.println("Kenar 2'yi Giriniz");
        kenar2 = input.nextDouble();
        System.out.println("Kenar 3'ü Giriniz");
        kenar3 = input.nextDouble();

        double u = (kenar1+kenar2+kenar3)/2;

        double alan = Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));

        System.out.println("Üçgenin Alanı= "+alan);



    }
}
