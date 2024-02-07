package school.mjc.stage0.loops.task3;

public class NinesSum {
  public void calculateSum(int lengthOfLastNumber) {
    if (lengthOfLastNumber <= 0) {
      System.out.println(0);
    } else {
      long sum = 0;
      long term = 0;
      for (int i = 1; i <= lengthOfLastNumber; i++) {
        term = term * 10 + 9;
        sum += term;
      }
      System.out.println(sum);
    }
  }
}
