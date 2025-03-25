public class ldiv {
    public static void main(String[] args) {
        int n=12;
        int num=718;
        String str="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder ans=new StringBuilder();
        while (num>0) {
            int rem=num%n;
            num=num/n;
            ans=ans.append(str.charAt(rem));
        }
        System.out.println(ans.reverse().toString());
    }
}
