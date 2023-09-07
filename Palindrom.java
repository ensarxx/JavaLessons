import java.util.Scanner;

public class Palindrom {


public static  String rakamS ="";
    static void rakamSaySondan(int sayi){


        int sonRakam = sayi%10;
        sayi = sayi/10;
        rakamS+=sonRakam;


        if (sayi > 0){
            rakamSaySondan(sayi);

        }
    }



    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Sayı Giriniz:");
        int sayıInput = input.nextInt();



        rakamSaySondan(sayıInput);

        if (sayıInput == Integer.valueOf(rakamS)){
            System.out.println("Bu Bir Palindrom Sayı");
        }
        else{
            System.out.println("Bu Palindrom Bir Sayı Değil");
        }


    }
}
