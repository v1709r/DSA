class MoveZeroTOEnd {
    public static void main(String [] arhs) {
        int [] arr= {10,20};
        // int [] arr= {8,5,0,10,0,20};
        movZer(arr);
        print(arr);
    }

    static void movZer(int [] arr) {
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                if(arr[i] != arr[j]) {
                    arr[j] = arr[i];
                    arr[i] = 0;
                }
                j++;
            }
        }
    }

    static void print(int [] arr) {
        for(int i : arr) {
            System.out.println(i);
        }
    }
}