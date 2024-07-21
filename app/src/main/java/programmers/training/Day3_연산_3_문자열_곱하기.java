package programmers.training;

import java.util.Scanner;

public class Day3_연산_3_문자열_곱하기 {

  public static String solution(String my_string, int k) {
    String answer = "";

    for (int i = 0; i < k; i++) {
      answer += my_string;
    }

    return answer;

    /*
     * return my_string.repeat(k);
     * */
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String my_string = sc.next();
    int k = sc.nextInt();

    System.out.println(solution(my_string, k));

  }

}
