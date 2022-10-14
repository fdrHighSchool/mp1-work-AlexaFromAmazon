import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    freezeTime(0);
    // create Scanner object
    Scanner s = new Scanner(System.in);
    int inSeconds = 0;
    // get String input from user
    System.out.println("What is your first name?");
    String firstName = s.nextLine().toLowerCase();
    System.out.println("Now how about your last name?");
    String lastName = s.nextLine().toLowerCase();
    System.out.println("Now enter your favorite number or even just a random one");
    String favoriteNumber = s.nextLine();
    System.out.println("And last but not least, are you a Student or a Teacher?");
    String positionStatus = s.nextLine().toLowerCase();
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("As you have provided all neccessary info that we require, we will now give you a username and email of which we have personally generated.");
    System.out.println("We can assure you that our database and system are flawless and that your username and email is highly unique to you.");
    System.out.println("Please be on standby as we generate your brand new and highly unique username and email.");
    System.out.println(" ");
    loadingBar();
    System.out.println(" ");
    System.out.println("-----------------------");
    System.out.println("  GENERATION COMPLETE  ");
    System.out.println("-----------------------");
    System.out.println(" ");
    freezeTime(1);
    System.out.println(" ");
    System.out.println("-----------------------");
    System.out.println("  GENERATION COMPLETE  ");
    System.out.println("-----------------------");
    System.out.println(" ");
    System.out.println("We will now bestow upon you your username and email.");
    if(positionStatus.equals("student")) {
        System.out.println(firstName+ initialingName(lastName) + favoriteNumber + "@nycstudents.net");
    } else {
        System.out.println(initialingName(firstName) + lastName + favoriteNumber + "@schools.nyc.gov");
    }
    System.out.println(" ");
    // test output
    // System.out.println("Hello " + initialingName(firstName) + "." + initialingName(lastName) + ".");
    s.close();
  } // end of main method
  // allows for taking the initials of names
  public static String initialingName(String n) {
    return n.substring(0, 1);
  } // end of initialingName method
  // freezes time and is used for the loading bar, will afterwards clear out the console
  public static int freezeTime(int inSeconds) {
    try {
        Thread.sleep(inSeconds * 500);
    } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
    }   
    System.out.print("\033[H\033[2J");
    System.out.flush();
    return inSeconds;
  } // end of freezeTime method
  // creates a loading with the usage of the above method ^
  public static void loadingBar() {
    freezeTime(12);
    System.out.println("[|                   ]");
    freezeTime(2);
    System.out.println("[|||                 ]");
    freezeTime(4);
    System.out.println("[|||||               ]");
    freezeTime(2);
    System.out.println("[||||||              ]");
    freezeTime(4);
    System.out.println("[||||||||            ]");
    freezeTime(2);
    System.out.println("[|||||||||||         ]");
    freezeTime(2);
    System.out.println("[|||||||||||||       ]");
    freezeTime(4);
    System.out.println("[||||||||||||||      ]");
    freezeTime(6);
    System.out.println("[||||||||||||||||    ]");
    freezeTime(2);
    System.out.println("[||||||||||||||||||  ]");
    freezeTime(4);
    System.out.println("[||||||||||||||||||||]");
  } // end of loadingBar method
} // end class
