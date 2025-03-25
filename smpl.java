public class smpl {
    public static void main(String[] args) {
      int array[]={1,2,3};
      int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        for(int i:array)
        {
          System.out.println(i);
        }
      }
}
