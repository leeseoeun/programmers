package programmers.training;

import java.util.Scanner;

public class Day2_출력_연산_1_덧셈식_출력하기 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println(a + " + " + b + " = " + (a + b));

    /*
     * System.out.printf("%d + %d = %d", a, b, a+b);
     * */

  }

}
