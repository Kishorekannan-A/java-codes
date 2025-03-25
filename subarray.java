public class subarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int sum=0;
       
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int cursum=0;
                for(int k=i;k<=j;k++)
                {
                    
                    cursum=arr[k]+cursum;
                    if(cursum>sum)
                    {
                        sum=cursum;
                    }
                //System.out.print(arr[k]+" ");
                }
               // System.out.println();
            }
            
        }
        System.out.println(sum);
    }
}
