public class kadaneormaxsubarray {
    public static void main(String[] args) {
        int arr[] = { -2, 7, -3, 4 };
        int csum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            csum = csum + arr[i];
            max = Math.max(max, csum);
            if (csum < 0) {
                csum = 0;
            }
        }
        System.out.println(max);
    }
}
