package programmers.training;

import java.util.Scanner;

public class Day4_연산_조건문_2_공배수 {

  public static int solution(int number, int n, int m) {
    int answer = 0;

    answer = (number % n == 0 && number % m == 0 ? 1 : 0);

    return answer;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int n = sc.nextInt();
    int m = sc.nextInt();

    System.out.println(solution(number, n, m));

  }

}
