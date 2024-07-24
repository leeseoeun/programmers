package programmers.beginner;

import java.util.Scanner;

public class Day4_수학_배열_2_피자_나눠_먹기_2 {

  public static int getResult(int num1, int num2) {
    if (num1 % num2 == 0) {
      return num2;
    }

    return getResult(num2, num1 % num2);
  }

  public static int solution(int n) {
    int answer = 0;

    int gcd = getResult(n, 6);      // 최대 공약수
    answer = ((n * 6 / gcd) / 6);   // 최소 공배수 / 6

    return answer;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(solution(n));

  }

}
