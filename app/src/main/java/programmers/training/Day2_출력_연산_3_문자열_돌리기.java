package programmers.training;

import java.util.Scanner;

public class Day2_출력_연산_3_문자열_돌리기 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String a = sc.next();

    String[] str = a.split("");
    for (int i = 0; i < str.length; i++) {
      System.out.println(str[i]);
    }

    /*
     * for (int i = 0; i < a.length; i++) {
     *  System.out.println(a.charAt(i));
     * }
     * */

  }

}
