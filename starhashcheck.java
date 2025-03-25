public class starhashcheck {
    public static void main(String[] args) {
        String str="#####****";
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='*')
            {
                x++;
            }
            if(str.charAt(i)=='#')
            {
                y++;
            }
        }
        if(x>y)
        {
            System.out.println("1");
        }
        else if(y>x)
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println("0");
        }
    }
}
