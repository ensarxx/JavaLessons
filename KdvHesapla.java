import java.util.Scanner;


public class KdvHesapla {

    public static void main(String[] args) {


        float kdvsiz,kdvli,kdvorani;


        Scanner input = new Scanner(System.in);
        System.out.println("Ürünün KDV'siz Tutarını Giriniz:");
        kdvsiz = input.nextInt();

        kdvorani = kdvsiz > 1000.0 ? 0.08f : 0.18f;

        kdvli = kdvsiz + kdvsiz*kdvorani;

        System.out.println("KDV'siz Fiyat = "+ kdvsiz );
        System.out.println("KDV'li Fiyat = "+ kdvli);
        System.out.println("KDV Oranı = " + kdvorani*100f + "%");








    }
}
