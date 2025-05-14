class FindImmediateSmaller {
    public static void main(String [] args) {
        int [] arr = {4,67,13,12,15};
        int x = 16;
        System.out.println("Immediate Smaller: " + check(arr,x));
    }
    static int check(int [] arr, int x) {
        int res = -1;
        for(int i : arr) {
            if(i < x && i > res) {
                res = i;
            }
        }
        return res;
    }
}