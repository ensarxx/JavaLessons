import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int decimal = sc.nextInt();
        String binary = "";


        while (decimal>0){
            binary += decimal%2;
            decimal/=2;
        }
        System.out.println(reverse(binary));

    }
    public static String reverse(String str) {
        String reversedString = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }
        return reversedString;
    }
}

