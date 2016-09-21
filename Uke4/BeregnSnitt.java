class BeregnSnitt{
  public static void main(String[] args){
    int[] array = {1, 2, 3, 4, 5, 6};
    int gjSnittWhile = beregnSnittWhile(array);
    System.out.println("Snitt til while:" + gjSnittWhile);
    int gjSnittFor = beregnSnittFor(array);
    System.out.println("Snitt til for:" + gjSnittFor);
  }

  public static int beregnSnittWhile(int [] mangeTall){
    int teller = 0;
    int sum = 0;
    while(teller < mangeTall.length){
      sum += mangeTall[teller]; // sum = sum + mangeTall[teller];
      teller++;
    }
    int gjSnitt = sum/mangeTall.length;
    return gjSnitt;
  }

  public static int beregnSnittFor(int [] mangeTall){
    int sum = 0;
    for(int i = 0; i < mangeTall.length; i++){
      sum += mangeTall[i];
    }
    int gjSnitt = sum/mangeTall.length;
    return gjSnitt;
  }
}
