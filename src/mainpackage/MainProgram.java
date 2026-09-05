package mainpackage;

import java.util.Scanner;
import evenpackage.*;
import oddpackage.*;
import primepackage.*;
import averagepackage.*;

public class MainProgram {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        EvenAnalyzer even = new EvenAnalyzer();
        OddAnalyzer odd = new OddAnalyzer();
        PrimeAnalyzer prime = new PrimeAnalyzer();
        AverageAnalyzer average = new AverageAnalyzer();

        System.out.print("How many numbers will you enter? ");
        int size_of_array = scan.nextInt();

        int array[] = new int[size_of_array];

        for(int i=0; i<array.length;i++){
            System.out.print("Enter a number: " );
            array[i]=scan.nextInt();
        }

        even.analyzing(array);
        odd.analyzing(array);
        prime.analyzing(array);
        average.analyzing(array);

    }
}
