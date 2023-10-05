import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,6,3,4,8,5,2,3,8,9,4,5};
        Sort(arr);


    }
    static void Sort(int[] arr) {

        int n = arr.length;
        int tempNum;
        for(int t = 0; t<n; t++)
        for (int i = 0; i < n-1; i++) {
            if (arr[i] > arr[i + 1]) {
                tempNum = arr[i + 1];
                arr[i+1] = arr[i];
                arr[i] = tempNum;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}