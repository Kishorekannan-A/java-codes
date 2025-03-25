public class vehicle {
    public static void main(String[] args) {
        int vehicle = 200;
        int wheel = 540;
        int res = ((4 * vehicle) - wheel) / 2;
        System.out.println("two wheeler:" + res + " four wheeler:" + (vehicle - res));
    }
}
