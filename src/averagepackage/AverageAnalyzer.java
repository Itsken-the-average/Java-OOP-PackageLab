package averagepackage;

public class AverageAnalyzer {

  public void analyzing(int[] array) {

    double sum = 0;

    for (int i = 0; i < array.length; i++) {
      sum = sum + array[i];
    }

    double average = sum / array.length;
    System.out.println("Average: "+average);
    int total_above_average = 0;
    System.out.print("Numbers Above Average: ");
    for (int i = 0; i < array.length; i++) {
      if (array[i] >= average) {
        System.out.print(array[i] + " ");
        total_above_average++;
      }
    }

    System.out.print("(" + total_above_average + ")");

  }
}
