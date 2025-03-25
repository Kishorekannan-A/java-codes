public class substringremove {
    public static void main(String[] args) {
        String str = "programming";
        String str1 = "pmg";
        for (int i = 0; i < str1.length(); i++) {
            str = str.replaceAll(String.valueOf(str1.charAt(i)), "");
        }
        System.out.println(str);
    }
}
