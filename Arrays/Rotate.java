class Rotate {
    public static void main(String [] arhs) {
        int [] arr = {1,2,3,4,5};
        int n = 4;
        if(n >= arr.length) {
            n = n % arr.length;
        }
        lt(arr, n);
        // rt(arr,n);
        print(arr);
    }

    static void rt (int [] arr, int n) {
        rev(arr, 0, arr.length - 1);
        rev(arr, 0, n - 1);
        rev(arr, n, arr.length - 1);
    }

    static void lt(int [] arr, int n) {
        rev(arr, 0, n - 1);
        rev(arr, n, arr.length - 1);
        rev(arr, 0, arr.length - 1);
    }

    static void rev(int [] arr, int str, int end ) {
        for(int i = str, j = end; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(int i = str; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

     static void print(int [] arr) {
        System.out.println("\n Output:- \n");
        for(int i : arr) {
            System.out.print(i+" ");
        }
     }
}