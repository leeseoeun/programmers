package programmers.training;

import java.util.Scanner;

public class Day1_출력_1_문자열_출력하기 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    if (str.length() >= 1 && str.length() <= 1000000) {
      System.out.println(str);
    }

  }

}
