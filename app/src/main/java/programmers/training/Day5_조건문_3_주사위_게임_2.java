package programmers.training;

import java.util.Scanner;

public class Day5_조건문_3_주사위_게임_2 {

  public static int solution(int a, int b, int c) {
    int answer = 0;

    // 세숫자가 모두 같을 때
    if (a == b && b == c) {
      answer = ((a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c));

      // 두숫자가 같을 때
    } else if (a == b || a == c || b == c) {
      answer = ((a + b + c) * (a * a + b * b + c * c));

      // 모두 다를 때
    } else {
      answer = (a + b + c);
    }

    return answer;

    /*
     * int count = 1;
     * if(a == b || a == c || b == c) {
     *  count++;
     * }
     * 
     * if(a == b && b == c) {
     *  count++;
     * }
     * 
     * for(int i = 1; i <= count; i++) {
     *  answer *= (pow(a,i)+pow(b,i)+pow(c,i));
     * }
     * 
     * private int pow(int a, int b) {
        if(b == 0) return 1;
        return a * pow(a, b-1);
     * }
     * */
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    System.out.println(solution(a, b, c));

  }

}
