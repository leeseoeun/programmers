package programmers.beginner;

import java.util.Scanner;

public class Day6_문자열_반복문_출력_배열_조건문_4_문자_반복_출력하기 {

  public static String solution(String my_string, int n) {
    String answer = "";

    String[] myStringArr = my_string.split("");
    for (int i = 0; i < myStringArr.length; i++) {
      answer += myStringArr[i].repeat(n);
    }

    return answer;

    /*
     * StringBuilder sb = new StringBuilder();
     * for(char c : my_string.toCharArray()){
     *  sb.append((c + "").repeat(n));
     * }
     * return sb.toString();
     * */
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String my_string = sc.next();
    int n = sc.nextInt();

    System.out.println(solution(my_string, n));

  }

}
