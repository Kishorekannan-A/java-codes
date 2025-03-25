public class ofront {
    public static void main(String[] args) {
        int arr[]={1,2,0,0};
        int n=arr.length;
        int cnt=n-1;
        for (int i=cnt;i>=0;i--)
        {
            if(arr[i]!=0)
            {
                arr[cnt]=arr[i];
                cnt--;
            }
        } 
        for(int i=0;i<=cnt;i++)
        {
            arr[i]=0;
        }
        for(int i:arr)
        {
        System.out.println(i);
        }
    }
}
