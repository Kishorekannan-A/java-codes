public class sunprm {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,7};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(isp(arr[i]))
            {
                sum=sum+arr[i];
            }
        }
        System.out.println(sum);
    }
    public static boolean isp(int n)
    {
        boolean x=true;
        if(n==0||n==1)
        {
            x=false;
        }
       
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                x=false;
            }
        }
        return x;
    }
}
