public class tripprd {
    public static void main(String[] args) {
        int arr[]={2,3,6,1,4};
        int n=arr.length;
        int a=12;
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(arr[i]*arr[j]*arr[k]==a)
                    {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
