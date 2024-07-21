package programmers.beginner;

import java.util.Scanner;

public class Day2_사칙연산_조건문_배열_2_숫자_비교하기 {

  public static int solution(int num1, int num2) {
    return num1 == num2 ? 1 : -1;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    System.out.println(solution(num1, num2));

  }

}
