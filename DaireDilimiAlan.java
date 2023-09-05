import java.util.Scanner;

public class DaireDilimiAlan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Yarıçap Giriniz: ");
        float r = input.nextFloat();
        System.out.println("Daire Dilimi Açısı Giriniz: ");
        float acı = input.nextFloat();
        float toplamAlan = 3.14f*r*r;
        float dilimAlan = (acı/360f) * toplamAlan;

        System.out.println("Dilim Alanı: " + dilimAlan);

    }
}
