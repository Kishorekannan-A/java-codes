public class days {
  public static void main(String[] args) {
    String day = "sunday";
    int daycount = 10;
    int daystosunday = 0;
    int ans = 0;
    String arr[] = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].equalsIgnoreCase(day)) {
        daystosunday = i;
      }
    }
    for (int i = 0; i < daycount; i++) {
      int dayindex = (i + daystosunday) % 7;
      if (dayindex == 0) {
        ans++;
      }
    }
    System.out.println(ans);
  }
}
