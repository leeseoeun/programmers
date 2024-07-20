package programmers.beginner;

import java.util.Scanner;

public class Day1_사칙연산_3_두_수의_곱 {

  public static int solution(int num1, int num2) {
    return num1 * num2;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    System.out.println(solution(num1, num2));

  }

}
