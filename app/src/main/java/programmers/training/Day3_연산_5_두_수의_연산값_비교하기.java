package programmers.training;

import java.util.Scanner;

public class Day3_연산_5_두_수의_연산값_비교하기 {

  public static int solution(int a, int b) {
    int answer = 0;

    answer = Integer.max(Integer.parseInt("" + a + b), (2 * a * b));

    return answer;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println(solution(a, b));

  }

}
