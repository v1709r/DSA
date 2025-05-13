class IsSorted {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5 ,4 ,3 ,2, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print(isSorted(arr));
   }
   static Boolean isSorted(int [] arr) {
        for(int i = 1;  i < arr.length; i++) {
            if(arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
   }
}