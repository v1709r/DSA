import java.util.Arrays;

class RemoveDuplicates {
    public static void main(String [] args) {
        int [] arr = {10,20,20,30,30,30,30,30,30,30};
        remDup(arr);
        Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
    }
    static void remDup(int [] arr) {
        int j = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[j] != arr[i]) {
                j++;
            }
            arr[j] = arr[i];
        }
        j++;
        System.out.println(j);
        for(int i = j; i < arr.length; i++) {
            arr[i] = -1;
        }
    }
}