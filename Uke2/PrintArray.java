class PrintArray{
  public static void main(String [] args){
    int[] array = {3, 4, 5, 6, 2, 1};
    printIntArray(array);
  }

  public static void printIntArray(int[] tall){
    int teller = 0;
    while(teller < tall.length){
      System.out.println("Paa plass " + teller + " er verdien " + tall[teller]);
      teller++;
    }
  }
}
