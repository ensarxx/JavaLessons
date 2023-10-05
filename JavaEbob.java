public class JavaEbob {
    public static void main(String[] args) {
        int num1 = 81;
        int num2 = 108;
        int ebob = 1;
        int i = 2;
        while (true){
            if (num1%i == 0 && num2%i ==0){
                num1 = num1/i;
                num2 = num2/i;

                ebob*=i;
            }
            else{
                i++;
            }
            if(i > num1 && i > num2){
                break;
            }



        }
        System.out.println("num1: "+num1+" num2: "+num2+" ebob: "+ebob + " i: "+i);

    }
}
