package programmers.training;

import java.util.Scanner;

public class Day3_연산_2_문자_리스트를_문자열로_변환하기 {

  public static String solution(String[] arr) {
    String answer = "";

    for (int i = 0; i < arr.length; i++) {
      answer += arr[i];
    }

    return answer;

    /*
     * return String.join("", arr);
     * */
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str1 = sc.next();
    String str2 = sc.next();
    String[] arr = {str1, str2};

    System.out.println(solution(arr));

  }

}
