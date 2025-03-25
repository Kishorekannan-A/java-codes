public class packing {
    public static void main(String[] args) {
        String str = "bbbaaababa";
        int max = 0;
        char ch = 'a';
        for (int i = 0; i < str.length() - 3; i++) {
            String temp = str.substring(i, i + 3);
            int tmax = 0;
            for (int j = 0; j < temp.length(); j++) {
                ;
                if (str.charAt(i) == ch) {
                    tmax++;
                }
            }
            max = Math.max(max, tmax);
        }
        System.out.println(max);
    }
}
