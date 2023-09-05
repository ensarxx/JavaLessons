import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int matematik,fizik,kimya,turkce,tarih,muzik;

        System.out.println("Matematik notunuzu giriniz.");
        matematik = input.nextInt();

        System.out.println("Fizik notunuzu giriniz.");
        fizik = input.nextInt();

        System.out.println("Kimya notunuzu giriniz.");
        kimya = input.nextInt();

        System.out.println("Türkçe notunuzu giriniz.");
        turkce = input.nextInt();

        System.out.println("Tarih notunuzu giriniz.");
        tarih = input.nextInt();

        System.out.println("Müzik notunuzu giriniz.");
        muzik = input.nextInt();

        double ort = (matematik+fizik+kimya+turkce+tarih+muzik)/6.0;


        String sonuc = ort > 60 ? "Geçtiniz" : "Kaldınız";
        System.out.println(ort + " Ortalama ile " + sonuc);
    }
}
