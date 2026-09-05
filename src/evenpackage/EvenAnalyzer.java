package evenpackage;

public class EvenAnalyzer {
  public void analyzing(int [] array){

    System.out.print("Even number: ");
    int totalEvenNumber=0;

    for(int i=0;i<array.length; i++){
      if(array[i]%2==0){
        totalEvenNumber++;
        System.out.print(array[i]+" ");
      }
    }

    System.out.print("("+totalEvenNumber+")");
    System.out.println();

  }
  
}
