package programmers.beginner;

import java.util.Scanner;

public class Day6_문자열_반복문_출력_배열_조건문_1_문자열_뒤집기 {

  public static String solution(String my_string) {
    String answer = "";

    String[] myStringArr = my_string.split("");
    for (int i = myStringArr.length - 1; i > -1; i--) {
      answer += myStringArr[i];
    }

    return answer;

    /*
     * StringBuilder sb = new StringBuilder();
     * sb.append(my_string);
     * sb.reverse();
     * 
     * return sb.toString();
     * */
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String my_string = sc.next();

    System.out.println(solution(my_string));

  }

}
