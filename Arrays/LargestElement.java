package Arrays;

class LargestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int largest = arr[0];

        for (int i : arr) {
            if (largest < i) {
                largest = i;
            }
        }
        System.out.println(largest);
    }
}
