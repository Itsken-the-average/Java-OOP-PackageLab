package oddpackage;

public class OddAnalyzer {
  public void analyzing(int[] array) {

    System.out.print("Odd Numbers: ");

    int totalOddNumber = 0;

    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 != 0) {
        totalOddNumber++;
        System.out.print(array[i] + " ");
      }

    }

    System.out.print("(" + totalOddNumber + ")");
    System.out.println();
  }
}
