import java.util.Scanner;



public class Taksimetre {

    public static void main(String[] args) {

        float gidilenYol ;
        float kmUcreti = 2.20f;


        Scanner input = new Scanner(System.in);
        System.out.println("Gidilen Yol Kaç KM ?");
        gidilenYol = input.nextFloat();

        float ucret = gidilenYol*kmUcreti > 20f ?  10f+gidilenYol*kmUcreti : 20f;

        System.out.println("Ödemeniz Gereken Tutar: " + ucret);



    }
}
