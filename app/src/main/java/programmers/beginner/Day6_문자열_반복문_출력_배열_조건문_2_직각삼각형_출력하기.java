package programmers.beginner;

import java.util.Scanner;

public class Day6_문자열_반복문_출력_배열_조건문_2_직각삼각형_출력하기 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print("*");
      }

      System.out.println();
    }

    /*
     * for(int i=1; i<=n; i++){
     *  System.out.println("*".repeat(i));
     * }
     * */

  }

}
