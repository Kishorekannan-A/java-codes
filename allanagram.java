import java.util.*;
public class allanagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String anag=sc.nextLine();
        System.out.println(anag.length());
        System.out.println(ana(str,anag));
    }
    public static int ana(String str,String anag)
    {
        int ans=0;
        ArrayList<Character> arr=new ArrayList<>();
        for(int i=0;i<anag.length();i++)
        {
            arr.add(anag.charAt(i));
        }
        for(int i=0;i<str.length()-anag.length();i++)
        {
            int cnt=0;
            for(int j=i;j<=anag.length();j++)
        {
            if(arr.contains(str.charAt(j)))
            {
                cnt++;
            }
           
        }
        if(cnt==anag.length())
        {
            System.out.println(cnt);
            //int x=i+anag.length();
            System.out.println("t");
        }
        
        }
        return ans; 
    }
}
