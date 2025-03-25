import java.util.*;
public class longestcommonsubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(lcs(str));
    }
    public static int lcs(String str)
    {
        int cnt=0;
        for(int i=0;i<str.length();i++){
            int curcnt=0;
            ArrayList<Character> arr=new ArrayList<>();
            for(int j=i;j<str.length();j++)
            {
                if(!arr.contains(str.charAt(j)))
                {
                    arr.add(str.charAt(j));
                    curcnt++;
                }
    }
    if(curcnt>cnt)
        {
            cnt=curcnt;
        }
}
        return cnt;
    }
}
