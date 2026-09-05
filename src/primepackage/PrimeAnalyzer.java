package primepackage;

public class PrimeAnalyzer {
  public void analyzing(int[] array) {

    System.out.print("Prime numbers: ");
    int count = 0;
    for (int i = 0; i < array.length; i++) {
      int j;
      for (j = 2; j < array[i]; j++) {
        if (array[i] % j == 0) {
          break;
        }
      }

      if (j == array[i]) {
        System.out.print(array[i]+" ");
        count++;
      }
    }
    System.out.print("(" + count + ")");
    System.out.println();
  }
}
