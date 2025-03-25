public class xor {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 9, 3, 4, 3, 4, 5, 5 };
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        System.out.println(xor);
    }
}
