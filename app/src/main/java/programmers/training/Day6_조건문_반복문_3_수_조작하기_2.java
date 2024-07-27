package programmers.training;

import java.util.Scanner;

public class Day6_조건문_반복문_3_수_조작하기_2 {

  public static String solution(int[] numLog) {
    String answer = "";

    for (int i = 1; i < numLog.length; i++) {
      switch (numLog[i] - numLog[i - 1]) {
        case 1 :
          answer += "w";
          break;
        case -1 :
          answer += "s";
          break;
        case 10 :
          answer += "d";
          break;
        case -10 :
          answer += "a";
          break;
      }
    }

    return answer;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    int[] numLog = {num1, num2, num3};

    System.out.println(solution(numLog));

  }

}
