public class magicnum {
    public static void main(String[] args) {
        int n=2;
        System.out.println(func(n));
    }
    public static int func(int n)
    {
        int cnt=0;
        for(int i=1;i<=n;i++)
        {
        String str=Integer.toBinaryString(i);
        if(isodd(str))
        {
            cnt++;
        }
    }
        return cnt;
    }
    public static boolean isodd(String str)
    {
        boolean x=true;
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            sum=sum+i;
        }
        if(sum%2==0)
        {
            x=false;
        }
        return x;
    }
}
