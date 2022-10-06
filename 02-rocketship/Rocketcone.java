
/** Rocket Cone made by Alex & Naychi
 */
public class Rocketcone
{
    public static void main(String[] args) {
        cone();
        msg();
        cone();
    }
    public static void cone() {
        System.out.println("   /\\   ");
        System.out.println("  /  \\  ");
        System.out.println(" /    \\ ");
    }
    public static void box() {
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    }
    public static void msg() {
        box();
        System.out.println("|United|");
        System.out.println("|States|");
        box();
    }
}
