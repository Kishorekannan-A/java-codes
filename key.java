
import java.util.Arrays;

public class key {
    public static void main(String[] args) {
        int input1=1234;
        int input2=3554;
        int input3=2454;
        int a=(input1/10)%10;
        int b=(input2/100)%10;
        String arr[]=String.valueOf(input3).split("");
        Arrays.sort(arr);
        String c=arr[arr.length-1];
        int x=Integer.parseInt(c);
        int ans=a*b*x;
        System.err.println(ans);
    }
}
