package programmers.training;

import java.util.Scanner;

public class Day3_연산_1_문자열_섞기 {

  public static String solution(String str1, String str2) {
    String answer = "";

    String[] str1Arr = str1.split("");
    String[] str2Arr = str2.split("");
    for (int i = 0; i < str1Arr.length; i++) {
      answer += str1Arr[i];
      answer += str2Arr[i];
    }

    return answer;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str1 = sc.next();
    String str2 = sc.next();

    System.out.println(solution(str1, str2));

  }

}
