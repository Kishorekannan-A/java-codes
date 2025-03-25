public class maxa {
    public static void main(String[] args) {
        String str="bbbaaababa";
        int l=3;
        int grpnum=1;
        int maxgrp=0;
        int maxa=0;
        System.out.println(str.length());
        for(int i=0;i<str.length();i+=l)
        {
            String x=str.substring(i,Math.min(i+l,str.length()));
            System.out.println(x); 
            int a=acheck(x);
            if(a>maxa)    
            {
                maxa=a;
                maxgrp=grpnum;
            }  
            grpnum++;    
        }
        System.out.println(maxgrp);
    }
    public static int acheck(String x)
    {
        int ans=0;
        for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i)=='a')
            {
                ans++;
            }
        }

        return ans;
    }
}
