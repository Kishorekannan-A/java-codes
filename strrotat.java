public class strrotat {
    public static void main(String[] args) {
        String str="abcd efgh ijkl mnop";
        String arr[]=str.split(" ");
        int k=2;
        func(arr,k);
    }
    public static void func(String[]arr,int k)
    {
        int n=arr.length;
        k=k%n;
        if(k==0)
        {
            for (String i : arr) {
                System.out.print(i+" ");
            }
            return;
        }
        else{
            String lst=arr[n-1];
            for(int i=n-1;i>0;i--)
            {
                arr[i]=arr[i-1];
            }
            arr[0]=lst;   
        }
        func(arr,k-1);
    }
}
