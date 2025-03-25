

public class power {
    public static void main(String[] args) {
        int n=5;
        int m=3;
        System.out.println(func(n,m));
    }
    public static long func(int n,int m)
    { 
        if(m==0)
        {
            return 1;
        }
        else
        {
            return n*func(n, m-1);
        }
    }
}
