import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    freezeTime(0);
    // create Scanner object
    Scanner s = new Scanner(System.in);
    int inSeconds = 0;
    String email = " ";
    //String password = "";
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
        email = (firstName+ initialingName(lastName) + favoriteNumber + "@nycstudents.net");
    } else {
        System.out.println(initialingName(firstName) + lastName + favoriteNumber + "@schools.nyc.gov");
        email = (initialingName(firstName) + lastName + favoriteNumber + "@schools.nyc.gov");
    }
    System.out.println(" ");
    System.out.println("How long do you wish your password to be?");
    int length = s.nextInt();
    //generatePassword(length);
    System.out.println(" ");
    System.out.println("Please be on standby as we generate your full length password as you have requested.");
    loadingBar();
    System.out.println(" ");
    System.out.println("Here is your email and password: ");
    System.out.println("Your Email - "+email);
    System.out.println("Your Pass - "+generatePassword(length));
    
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
  public static String generatePassword(int length) {
      String password = "";
      for(int i = 0; i < length; i++) {
      // Temporary
      int min = 0;
      int max = 0;
      int randomList = (int)(Math.random()*3);
      if(randomList == 0) {
        min = 65;
        max = 90;
      } else if(randomList == 1) {
        min = 97;
        max = 122;
      } else {
        min = 33;
        max = 47;
      }
      int rand1 = (int)((Math.random() * (max - min) + 1) + min);
      char c = (char)rand1;
      password += c;
    }
    return password;
  }
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
