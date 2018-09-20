package local.r2d2;

import java.util.Arrays;

public class Arr0 {
  static void printResult(String label, String result) {
    System.out.println(label);
    System.out.println(result + "\n");
  }

  public static void main(String[] args) {
    String[] arr = {"one", "two", "three"};

    System.out.println("println Array");
    System.out.println(arr + "\n");

    printResult("Array to string, str[]", Arrays.toString(arr));

    Arrays.sort(arr);

    printResult("Sorted array, str[]", Arrays.toString(arr));

    int[] arr0 = {0, 2, 1};

    printResult("Array to string, int[]", Arrays.toString(arr0));

    Arrays.sort(arr0);

    printResult("Array sorted, int[]", Arrays.toString(arr0));
  }
}
