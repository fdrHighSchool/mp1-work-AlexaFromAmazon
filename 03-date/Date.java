import java.util.Scanner;

public class Date
{
    public static void main(String[] args) {
        int date;
        String day;
        int year;
        String month;
        // date
        Scanner in = new Scanner(System.in);
        System.out.println("What is the date?");
        day = in.nextLine();
        // month
        System.out.println(" ");
        System.out.println("What is the month?");
        month = in.nextLine();
        // number            
        System.out.println(" ");
        System.out.println("What is today?");
        date = in.nextInt();
        // year
        System.out.println(" ");
        System.out.println("What is the year?");
        year = in.nextInt();

        System.out.println("");
        System.out.println("American Format: "+date+", "+month+" "+day+", "+year);
        System.out.println("European Format: "+date+" "+day+" "+month+" "+year);
        System.out.println(" ");
    }
}



    