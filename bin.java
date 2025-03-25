public class bin {
    public static void main(String[] args) {
        int a = 10;
        String b = Integer.toString(a, 2);
        b = b.replaceAll("1", "2");
        b = b.replaceAll("0", "1");
        b = b.replaceAll("2", "0");
        System.out.println(b);
        int ans = Integer.parseInt(b, 2);
        System.out.println(ans);
    }
}
