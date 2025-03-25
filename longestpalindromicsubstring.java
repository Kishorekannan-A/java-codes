public class longestpalindromicsubstring {
    public static void main(String[] args) {
        String str="baabad";
        int l=0;
        int s=0;
        int b=0;
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<=str.length();j++)
            {
                String x=str.substring(i, j);
                if(pal(x)&&x.length()>l)
                {
                    l=x.length();
                    s=i;
                    b=j;
                }
            }
        }
        System.out.println(str.substring(s,b));
    }
    public static boolean pal(String str)
    {
        StringBuilder sb=new StringBuilder();
        sb.append(str);
        String y=sb.reverse().toString();
        if(str.equals(y))
        {
            return true;
        }
        else
        {
            return false;
        }
    } 
}