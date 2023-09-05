import java.util.Scanner;

public class ManavHesaplama {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Armut KG Giriniz: ");
        float armut = input.nextFloat();
        System.out.println("Elma KG Giriniz: ");
        float elma = input.nextFloat();
        System.out.println("Domates KG Giriniz: ");
        float domates = input.nextFloat();
        System.out.println("Muz KG Giriniz: ");
        float muz = input.nextFloat();
        System.out.println("Patlıcan KG Giriniz: ");
        float patlican = input.nextFloat();

        float armutfiyat = armut*2.14f;
        float elmafiyat = elma*3.67f;
        float domatesfiyat = domates*1.11f;
        float muzfiyat = muz*0.95f;
        float patlicanfiyat = patlican*5.00f;

        float toplamFiyat = armutfiyat+elmafiyat+domatesfiyat+muzfiyat+patlicanfiyat;

        System.out.println("Toplam Fiyat: " + toplamFiyat);



    }


}
