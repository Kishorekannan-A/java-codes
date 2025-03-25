import java.util.HashSet;
import java.util.Set;

public class mulofthree {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,2};
        System.out.println(func(arr));
        
    }
    public static int func(int arr[])
    {
        Set<String>hs=new HashSet<>();
        int cnt=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                String str=Math.min(arr[i], arr[j])+","+Math.max(arr[i], arr[j]);
                if(arr[i]*arr[j]%3==0 && arr[i]!=arr[j])
                {
                     if(!hs.contains(str))
                     {
                        hs.add(str);
                    cnt++;
                    System.out.println(arr[i]+" "+arr[j]);
                     }
                }
            }
        }
        return cnt;
    }
}
