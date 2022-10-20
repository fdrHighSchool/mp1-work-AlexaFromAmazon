
/** Rocket Cone made by Alex & Naychi
 */
public class Rocketcone
{
    public static void main(String[] args) {
        cone();
        msg();
        cone();
    } // end of main method
    public static void cone() {
        System.out.println("   /\\   ");
        System.out.println("  /  \\  ");
        System.out.println(" /    \\ ");
    } // used to create a cone and save on space
    public static void box() {
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    } // used to create a box and save space
    public static void msg() {
        box();
        System.out.println("|United|");
        System.out.println("|States|");
        box();
    } // message
}
