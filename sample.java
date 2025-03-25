public class sample {
    public static void main(String[] args) {
        int[]nums={1,1,2};
        System.out.println(removeDuplicates(nums));
    }
        public static int removeDuplicates(int[] nums) {
            if (nums.length == 0) {
                return 0; // If array is empty, return 0
            }
    
            int k = 1; // Pointer to track the position for unique elements
    
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[k - 1]) { // Check if the current element is different from the last unique one
                    nums[k] = nums[i]; // Place the unique element at the next position
                    k++; // Increment the pointer
                }
            }
            int x=1;
            int arr[]=new int[k];
            nums[0]=arr[0];
            int a=1;
            for(int i=0;i<nums.length;i++)
            {
                if (nums[i] != nums[x - 1]) {
                    arr[a]=nums[i];
                    a++;
                }
                x++;
            }
            for(int i:arr)
            {
                System.out.println(i);
            }
    return k; 
    }
}
