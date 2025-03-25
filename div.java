public class div {
    public static void main(String[] args) {
        int m=20;
        int n=4;
        int ans=def(m,n);
        System.out.println(ans);
    }
    public static int def(int m,int n)
    {
        
        int x=0;
        int y=0;
        for(int i=0;i<=m;i++)
        {
            if(i%n==0)
            {
                x=x+i;
            }
            else{
                y=y+i;
            }
        }
        int a=Math.max(x,y)-Math.min(x,y);
        return a;
    }
}
