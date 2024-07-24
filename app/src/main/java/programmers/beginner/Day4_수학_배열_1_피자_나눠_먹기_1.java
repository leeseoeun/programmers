package programmers.beginner;

import java.util.Scanner;

public class Day4_수학_배열_1_피자_나눠_먹기_1 {

  public static int solution(int n) {
    int answer = 0;

    answer = (n % 7 == 0 ? n / 7 : n / 7 + 1);

    return answer;

    /*
     * 어떤 수를 7로 나누면 나머지가 0부터 6까지만 있음
     * return (n + 6) / 7;
     * */
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(solution(n));

  }

}
