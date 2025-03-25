public class cts {
    public void main(String[] args) {
        int input1=4;
        int input2=5;
        int input3[]={3,7,5,6};
        int ans=func(input1,input2,input3);
        System.out.println(ans);
    }
    public int func(int input1,int input2,int input3[])
    {
        int cnt=0;
        for(int i=0;i<input1;i++)
        {
            if(input3[i]==2)
            {
                cnt=cnt+2;
            }
            if(input3[i]%2!=0)
            {
                if(input3[i]>=input2)
                {
                    cnt=cnt+input2;
                }
                else{
                    cnt=cnt+0;
                }
            }
        }
        return cnt;
    }
}
