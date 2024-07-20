package programmers.training;

import java.util.Scanner;

public class Day2_출력_연산_5_문자열_겹쳐쓰기 {

  public static String solution(String my_string, String overwrite_string, int s) {
    String answer = "";

    String strStart = my_string.substring(0, s);
    String strEnd = my_string.substring(overwrite_string.length() + s);

    answer = (strStart + overwrite_string + strEnd);

    return answer;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String my_string = sc.next();
    String overwrite_string = sc.next();
    int s = sc.nextInt();

    System.out.println(solution(my_string, overwrite_string, s));

  }

}
