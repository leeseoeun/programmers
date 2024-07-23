package programmers.training;

import java.util.Scanner;

public class Day4_연산_조건문_3_홀짝에_따라_다른_값_반환하기 {

  public static int solution(int n) {
    int answer = 0;

    if (n % 2 == 0) {
      for (int i = 2; i < n + 1; i += 2) {
        answer += (i * i);
      }

    } else {
      for (int i = 1; i < n + 1; i +=2) {
        answer += i;
      }
    }

    return answer;

    /*
     * for(int i = n; i >= 0; i -= 2)
     *  answer += (n % 2 == 0) ? i * i : i;
     * */
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(solution(n));

  }

}
