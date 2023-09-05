import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuzu Giriniz (Metre): ");
        float boy = input.nextFloat();
        System.out.println("Kilonuzu Giriniz: ");
        float kilo = input.nextFloat();

        float vucutKitleEndeksi = kilo / boy * boy;

        System.out.println("Vücut Kitle Endeksiniz: "+vucutKitleEndeksi);
    }
}
