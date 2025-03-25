public class minimumcheck {
    public static void main(String[] args) {
        int arr[]={7,4,8,2,9};
        
        int n=arr.length;
        int cnt=1;
        for(int i=n-1;i>=0;i--)
        {
            int bol=1;
            int x=arr[i];
            for(int j=n-1-1;j>=0;j--)
            {
                if(arr[j]>x)
                {
                    bol=0;
                }
            }
            if(bol==1)
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
