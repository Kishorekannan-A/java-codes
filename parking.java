public class parking {
    public static void main(String[] args) {
        int arr[][]={{0,1,0},
                     {1,0,0},
                     {1,0,0}};
        int row=arr.length;
        int col=arr[0].length;
        int pcnt=0;
        int res=0;
        for(int i=0;i<col;i++)
        {
            int tcnt=0;
            for(int j=0;j<row;j++)
            {
                if(arr[j][i]==1)
                {
                    tcnt++;
                }
            }
            if(tcnt>pcnt)
            {
                pcnt=tcnt;
                res=i;
            }
        }
        System.out.println(res);
    }
}
