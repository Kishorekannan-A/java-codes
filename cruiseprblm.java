public class cruiseprblm {
    public static void main(String[] args) {
        int []e={7,0,5,1,3};
        int []l={1,2,1,3,4};
        int fin=0;
        int temp=0;
        for(int i=0;i<e.length;i++)
        {
            int cur=temp+e[i]-l[i];
            temp=cur;
            if(cur>fin)
            {
                fin=cur;
            }
        }
        System.out.println(fin);
    }
}
