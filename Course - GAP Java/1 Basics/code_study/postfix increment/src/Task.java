class Task {
  public static void main(String[] args) {
    int x = 0;
    while (x++ < 10) {
    }
    checkForXValue(x);

  }

  private static void checkForXValue(int x) {
    int expectedXValue = 0 /*TODO replace 0 with your expected value*/;

    System.out.println("Guessed correctly the value of x ? - " + (x == expectedXValue));

  }

}