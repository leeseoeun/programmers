package programmers.beginner;

import java.util.Scanner;

public class Day3_사칙연산_배열_수학_1_나머지_구하기 {

  public static int solution(int num1, int num2) {
    int answer = -1;

    answer = (num1 % num2);

    return answer;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    System.out.println(solution(num1, num2));

  }

}
