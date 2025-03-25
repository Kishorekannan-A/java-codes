public class seclar {
    public static void main(String[] args) {
        int arr[]={1,8,0,2,3,5,6};
        int a=func(arr);
        System.out.println(a);
    }
    public static int func(int arr[])
    {
    int lr=0;
    int ans;
    int slr=0;
    int s=0;
    int f=0;
    for (int i=0;i<arr.length;i=i+2)
    { 
     if(arr[i]>lr&&arr[i]>slr)
     {
        slr=lr;
        lr=arr[i];
     }
     else if(arr[i]>slr&&arr[i]<lr)
     {
        slr=arr[i];
     }
}
for(int i=1;i<arr.length;i=i+2)
{
    if(arr[i]>f&&arr[i]>s)
     {
        s=f;
        f=arr[i];
     }
     else if(arr[i]>s&&arr[i]<f)
     {
        s=arr[i];
     }

}

ans=slr+s;

        return ans;
    }
}
