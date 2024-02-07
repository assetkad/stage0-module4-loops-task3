package school.mjc.stage0.loops.task3;

public class DigitsSum {
  public void printDigitsSum(int number) {
    boolean isNegative = number < 0;
    number = Math.abs(number);
    int sum = 0;
    int temp = number;

    while (temp != 0) {
      int digit = temp % 10;
      sum += digit;
      temp /= 10;
    }

    if (isNegative) {
      sum = Math.abs(sum - 2 * sum);
    }

    System.out.println(sum);
  }
}
