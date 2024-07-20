package programmers.training;

import java.util.Scanner;

public class Day2_출력_연산_4_홀짝_구분하기 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if (n % 2 == 0) {
      System.out.println(n + " is even");

    } else {
      System.out.println(n + " is odd");
    }

    /*
     * System.out.println(n + " is " + (n % 2 == 0 ? "even" : "odd"));
     * */

  }

}
