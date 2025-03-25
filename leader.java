import java.util.*;

public class leader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int cnt = 1;
        for (int i = n - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[i]) {
                    break;
                }
                if (j == 0) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
