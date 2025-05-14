
import java.util.Arrays;

public class Majority {
    public static void main(String [] args) {
        int [] arr = {1,1,2,2,2,2,2,2,3,4,4,5};
        System.out.println("Who has majority: " + check(arr));
    }
    static int check(int [] arr) {
        for(int i = 1; i < arr.length; i++) {
            if(arr[i - 1] > arr[i]) {
                Arrays.sort(arr);
            }
        }
        return maj(arr);
    }
    static int maj(int [] arr) {
        // Using Moore's Algorithm
        // 1,1,2,2,2,3,4,4,5
        int maj = 0, cur = arr[0];
        for(int i : arr) {
            if(maj == 0) {
                cur = i;
                maj = 1;
            } else if(cur == i) {
                maj++;
            } else {
                maj--;
            }
        }
        return cur;
    }
}