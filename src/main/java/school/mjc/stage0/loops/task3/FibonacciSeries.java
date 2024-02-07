package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
  public void printFibonacci(int lastFibonacci) {
    int a = 0;
    int b = 1;
    System.out.println(a);
    System.out.println(b);
    for (int i = 2; i < lastFibonacci; i++) {
      int c = a + b;
      System.out.println(c);
      a = b;
      b = c;
    }
  }
}
