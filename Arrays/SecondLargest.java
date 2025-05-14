class SecondLargest {
    public static void main(String [] args) {
        int [] arr = {5,8, 12, 12};
        // int [] arr = {10, 10, 10};
        // int [] arr = {10, 5, 8, 20};
        // int [] arr = {20, 10, 20, 8, 12};
        System.out.println(secondLargest(arr));
    }
    static int secondLargest(int [] arr) {
        int largest = arr[0];
        int ans = -1;
        for(int i : arr) {
            if(largest < i) {
                ans = largest;
                largest = i;
            }
            if (ans < i && i < largest) {
                ans = i;
            }
        }
        return ans;
    }
}