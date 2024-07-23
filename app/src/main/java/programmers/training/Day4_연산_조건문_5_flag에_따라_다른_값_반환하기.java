package programmers.training;

import java.util.Scanner;

public class Day4_연산_조건문_5_flag에_따라_다른_값_반환하기 {

  public static int solution(int a, int b, boolean flag) {
    int answer = 0;

    answer = (flag ? a + b : a - b);

    return answer;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    String str = sc.next();
    boolean flag = (str.equals("true") ? true : false);

    System.out.println(solution(a, b, flag));

  }

}
