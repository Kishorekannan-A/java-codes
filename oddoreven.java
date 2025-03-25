public class oddoreven {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        String a=func(arr);
        System.out.println(a);
    }
        public static String func(int arr[])
        {
            String b="";
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]%2==0)
                {
                    b=b+"even";
                }
                else{
                    b=b+"odd";
                }
            }
            return b;
        }
    }
