/**
 * intrev
 */
public class intrev {

    public static void main(String[] args) {
        int a=123456;
        int rev=0;
        while(a!=0)
        {
            int x=a%10;
            rev=rev*10+x;
            a=a/10;

        }
        System.out.println(rev);
    }
}
