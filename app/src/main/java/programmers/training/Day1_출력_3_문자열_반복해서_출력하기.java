package programmers.training;

import java.util.Scanner;

public class Day1_출력_3_문자열_반복해서_출력하기 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.print(str);
    }

    /*
     * System.out.println(str.repeat(n));
     * */

  }

}
