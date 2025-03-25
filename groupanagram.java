import java.util.ArrayList;
import java.util.Arrays;

public class groupanagram {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<strs.length;i++)
        {
            arr.add(strs[i]);
        }
        while(!arr.isEmpty())
        {
            System.out.println("[");
            String x=arr.get(0);
            char[] ch1= x.toCharArray();
            Arrays.sort(ch1);
            String a=new String(ch1);
            if(arr.size()>1)
            {
                for(int i=1;i<arr.size();i++)
                {
                    char[] ch= x.toCharArray();
                    Arrays.sort(ch);
                    String c=new String(ch1);
                    if(a.equals(c))
                    {
                        System.out.println(arr.get(i)+",");
                        arr.remove(i);
                    }
                }
            }
            else{
                System.out.println(arr.get(0));
            }
            System.out.println("]");
        }
    }
}
