import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {30,7,6,5,10};
        revArr(arr);
        Arrays.stream(arr).forEach(num -> System.out.println(num + " "));
    }
    static void revArr(int [] arr) {
        for(int i = 0, j = arr.length-1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
