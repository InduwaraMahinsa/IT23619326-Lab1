import java.util.*;

public class Welcome{
     public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter your First Name:");
          String firstName = scanner.nextLine();
          
          System.out.println("Enter your Last Name:");
          String lastName = scanner.nextLine();

          System.out.println("Welcome to the seconed Year"+firstName+" "+lastName);
    }

}