package local.r2d2;
import org.jetbrains.annotations.Contract;

import java.util.Scanner;

import static local.r2d2.Constants.LOOP_END;
import static local.r2d2.Constants.LOOP_STEP;

public class App0
{
  @Contract(pure = true)
  private static int getEnd(int end) {
    if(end < 0) {
      return LOOP_END;
    }

    return end;
  }

  @org.jetbrains.annotations.Contract(pure = true)
  private static int getStep(int step, int end) {
    if(step > end || step < 0) {
      return LOOP_STEP;
    }

    return step;
  }

  public static void main( String[] args)
  {
    int x = 0;
    Scanner myInput = new Scanner(System.in);

    System.out.println("How match loops you need?");
    int end = getEnd(myInput.nextInt());

    System.out.println("What step by for while?");
    int step = getStep(myInput.nextInt(), end);

    System.out.println("While looped, end to: " + end + ", step by: " + step);

    while( x < end) {
      System.out.println("while loop: " + x);
      x += step;
    }
  }
}
