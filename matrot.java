public class matrot {
    public static void main(String[] args) {
        int arr[][]={{1,2,4},
                   {3,4,5}};
                   for(int j=0;j<arr.length;j++)
                   {
                    for(int i=arr.length-1;i>=0;i--)
                    {
                        System.out.print(arr[i][j]+" ");
                    }
                    System.out.println();
                   }
    }
}
