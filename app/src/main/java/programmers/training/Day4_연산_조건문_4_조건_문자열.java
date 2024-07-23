package programmers.training;

import java.util.Scanner;

public class Day4_연산_조건문_4_조건_문자열 {

  public static int solution(String ineq, String eq, int n, int m) {
    int answer = 0;

    if (ineq.equals("<") && eq.equals("=")) {
      answer = (n <= m ? 1 : 0);
    } else if (ineq.equals("<") && eq.equals("!")) {
      answer = (n < m ? 1 : 0);
    } else if (ineq.equals(">") && eq.equals("=")) {
      answer = (n >= m ? 1 : 0);
    } else {
      answer = (n > m ? 1 : 0);
    }

    return answer;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String ineq = sc.next();
    String eq = sc.next();
    int n = sc.nextInt();
    int m = sc.nextInt();

    System.out.println(solution(ineq, eq, n, m));

  }

}
