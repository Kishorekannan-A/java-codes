import java.util.*;
public class eg {
    public static void math(String str,String ang){
        for(int i=0;i<=str.length() - ang.length();i++){
            String temp=str.substring(i,i+ang.length());
            int ans= anagram(temp,ang);
            if(ans==1){
                System.out.println(i);
            }
        }
    }
    public static int anagram(String temp,String ang){
        char[] ch1= temp.toCharArray();
        Arrays.sort(ch1);
        String x=new String(ch1);
        char[] ch2=ang.toCharArray();
        Arrays.sort(ch2);
        String y=new String(ch2);
        
        if(x.equals(y)){
            return 1;
        }else{
            return 0;
        }
    }
    
    public static void main(String[] args) {
        String str="cbaebabacd";
        String ang="abc";
        math(str,ang);
    }
}
