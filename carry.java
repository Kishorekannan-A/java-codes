public class carry {

    public static void main(String[] args) {
        int num1=451;
        int num2=349;
        int ans=func(num1,num2);
        System.out.println(ans);

    }
    public static int func(int num1,int num2)
    {
        int a=0;
        int c=0;
        while(num1>0||num2>0)
        {
            int x=num1%10;
            int y=num2%10;
            if(x+y+c>=10)
            {
                c=1;
                a++;
            }
            else
            {
                c=0;
            }
            num1/=10;
            num2/=10;
        }
        return a;
    } 
}