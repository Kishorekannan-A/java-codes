import java.util.*;
public class baloon {
    public static void main(String[] args) {
        char arr[]={'a','b','b','b','c','c','c','a','f','c'};
        ArrayList<Character>arr2=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!arr2.contains(arr[i]))
            {
                arr2.add(arr[i]);
                int temp=0;
                for(int j=0;j<arr.length;j++)
                {
                    
                    if(arr[i]==arr[j])
                    {
                        temp++;
                    }
                    
                }
                if(temp%2!=0)
                    {
                        System.out.println(arr[i]);
                        break;
                    }
               
            }
        }
    }
}
