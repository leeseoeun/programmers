package programmers.training;

import java.util.Scanner;

public class Day4_연산_조건문_1_n의_배수 {

  public static int solution(int num, int n) {
    int answer = 0;

    answer = (num % n == 0 ? 1 : 0);

    return answer;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int n = sc.nextInt();

    System.out.println(solution(num, n));

  }

}
