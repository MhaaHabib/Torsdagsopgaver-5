public class Main {
    public static void main(String[] args) {
        Cafe c = new Cafe ();
        c.loadMenuData();

        for (String m : c.coffeeMenu) {
            System.out.println(m);
        }

    }
}
