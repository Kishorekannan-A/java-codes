public class movehyphen {
    public static void main(String[] args) {
        String str="hi-kishore";
        String ans=func(str);
        System.out.println(ans);
    }
    public static String func(String str)
    {
        String a="";
        char arr[]=str.toCharArray();
        int n=arr.length;
        int cnt=n-1;
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]!='-')
            {
                arr[cnt]=arr[i];
                cnt--;
            }
        }
        for(int i=0;i<=cnt;i++)
        {
            arr[i]='-';
        }
        a=String.valueOf(arr);
        return a;
    }
}
