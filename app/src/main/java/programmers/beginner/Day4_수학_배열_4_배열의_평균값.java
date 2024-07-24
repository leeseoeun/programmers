package programmers.beginner;

import java.util.Scanner;

public class Day4_수학_배열_4_배열의_평균값 {

  public static double solution(int[] numbers) {
    double answer = 0;

    int total = 0;
    for (int i = 0; i < numbers.length; i++) {
      total += numbers[i];
    }

    answer = ((double) total / numbers.length);

    return answer;

    /*
     * return Arrays.stream(numbers).average().orElse(0);
     * */
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    int num4 = sc.nextInt();
    int num5 = sc.nextInt();
    int num6 = sc.nextInt();
    int num7 = sc.nextInt();
    int num8 = sc.nextInt();
    int num9 = sc.nextInt();
    int num10 = sc.nextInt();
    int[] numbers = {num1, num2, num3, num4, num5, num6, num7, num8, num9, num10};

    System.out.println(solution(numbers));

  }

}
