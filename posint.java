import java.util.Arrays;

/**
 * posint
 */
public class posint {

    public static void main(String[] args) {
        int arr[]={3,4,-1,1};
        Arrays.sort(arr);
        int n=arr.length;
        System.out.print("hi");
        System.out.print("hi");
        for(int i=0;i<n;)
        {
            if(arr[i]==1)
            {
                for(int j=i;j<n-1;)
                {
                    if(arr[j+1]==j+1)
                    {
                        j++;
                    }
                    else{
                        System.out.println(arr[j]+1);
                    }
                }
            }
            return;
        }
        System.out.println("hi");
    }
}