package programmers.beginner;

import java.util.Scanner;

public class Day2_사칙연산_조건문_배열_3_분수의_덧셈 {

  public static int getResult(int num1, int num2) {
    if (num1 % num2 == 0) {
      return num2;
    }

    return getResult(num2, num1 % num2);
  }

  public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
    int[] answer = new int[2];

    int numer = ((numer1 * denom2) + (numer2 * denom1));
    int denom = (denom1 * denom2);

    int result = getResult(Integer.max(numer, denom), Integer.min(numer, denom));

    answer[0] = (numer /= result);
    answer[1] = (denom /= result);

    return answer;

    /*
     * for (int i = denom; i >= 1; i--) {
     *  if (numer % i == 0 && denom % i == 0) {
     *      numer /= i;
     *      denom /= i;
     *  }
     * }
     * 
     * int[] answer = {numer, denom}
     * */

  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int numer1 = sc.nextInt();
    int denom1 = sc.nextInt();
    int numer2 = sc.nextInt();
    int denom2 = sc.nextInt();

    System.out.println(solution(numer1, denom1, numer2, denom2));

  }

}
