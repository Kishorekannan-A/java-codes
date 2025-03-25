

public class chcnt {
    public static void main(String[] args) {
        String a="hellowworld";
        int n=10;
        char c='l';
        int ans=func(a,n,c);
        System.out.println(ans);
    }
    public static int func(String a,int n,char c)
    {
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(a.charAt(i)==c)
            {
                cnt++;
            }
        }
        return cnt;
    }
}