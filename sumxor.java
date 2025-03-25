public class sumxor {
    public static void main(String[] args) {
        int arr[]={10,5,6,3,7,2};
        int sum=0;
        int xor=0;
        for(int i=1;i<arr.length;i=i+2)
        {
            sum+=arr[i];
        }
        for(int i=0;i<arr.length;i=i+2)
        {
            xor^=arr[i];
        }
        System.out.println(sum-xor);
    }
}
