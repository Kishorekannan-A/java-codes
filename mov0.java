public class mov0 {
public static void main(String[] args) {
int arr[]={2,3,0,7,0,8,0};
int cnt=0;
for(int i=0;i<arr.length;i++)
{
    if(arr[i]!=0)
    {
        arr[cnt]=arr[i];
        cnt+=1;
    }
}
for(int i=cnt;i<arr.length;i++)
{
    arr[i]=0;
}
for(int i:arr)
System.out.println(i);
}    
}