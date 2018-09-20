package local.r2d2;
import java.util.Scanner;

public class AppScanner
{
  public static void main(String[] args)
  {
    Scanner myInput = new Scanner(System.in);
    System.out.println("Please input text at line ...");
    String input = myInput.nextLine();

    System.out.println("You input: " + input);
  }
}
