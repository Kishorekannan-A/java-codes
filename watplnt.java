public class watplnt {
    public static void main(String[] args) {
        int []arr= {7,7,7,7,7,7,7};
	int step=0;
	int cap=8;
	int rst=cap;
	int n=arr.length;
	for(int i=0;i<arr.length;i++)
	{
		
		if(cap>=arr[i])
		{
			cap=cap-arr[i];
			step++;
		}
        else
		{
			cap=rst-arr[i];
			step=step+2*i+1;
		}
	}
	System.out.print(step);
    }
}
