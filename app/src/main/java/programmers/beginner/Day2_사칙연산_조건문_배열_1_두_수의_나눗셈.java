package programmers.beginner;

import java.util.Scanner;

public class Day2_사칙연산_조건문_배열_1_두_수의_나눗셈 {

  public static int solution(int num1, int num2) {
    // int인 경우 정수로만 나오기 때문에 double로 형 변환
    double result = ((double) num1 / (double) num2);

    return (int) (result * 1000);

    /*
     * return num1 * 1000 / num2;
     * */
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    System.out.println(solution(num1, num2));

  }

}
