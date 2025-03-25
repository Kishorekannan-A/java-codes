public class splfibo {
    public static void main(String[] args) {
        int n=5;
        System.out.println(func(n));
    }
    public static int func(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        else{
            return func(n-1*n-1+n-2*n-2);
        }
    } 
}
