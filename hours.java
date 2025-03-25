public class hours {
    public static void main(String[] args) {
        int arr[]={2,2,58,60,60};
        int ans=func(arr);
        System.out.println(ans);
    }
    public static int func(int arr[])
    {
        int cnt=0;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                sum=arr[i]+arr[j];
                if(sum==60||sum%60==0)
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
