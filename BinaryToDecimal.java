import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        String binary = sc.nextLine();


        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            int digit = Character.getNumericValue(binary.charAt(i));
            int power = binary.length() - i - 1;
            decimal += digit * Math.pow(2, power);
        }
        System.out.println(decimal);

    }
}


