public class krotatarr {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int k = 3;
        int n = arr.length;
        rotate(arr, k, n);
        for (int i : arr)
            System.out.print(i);
    }

    public static void rotate(int arr[], int k, int n) {
        k = k % n;
        if (k == 0) {
            return;
        }
        int lst = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lst;
        rotate(arr, k - 1, n);
    }
}
