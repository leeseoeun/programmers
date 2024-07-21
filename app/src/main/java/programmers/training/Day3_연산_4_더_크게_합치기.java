package programmers.training;

import java.util.Scanner;

public class Day3_연산_4_더_크게_합치기 {

  public static int solution(int a, int b) {
    int answer = 0;

    String strA = Integer.toString(a);
    String strB = Integer.toString(b);
    int num1 = Integer.parseInt(strA + strB);
    int num2 = Integer.parseInt(strB + strA);

    answer = Integer.max(num1, num2);

    return answer;

    /*
     * 자바에서는 숫자 + 문자열을 문자열로 처리
     * return Math.max(Integer.parseInt("" + a + b), Integer.parseInt("" + b + a));
     * */
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println(solution(a, b));

  }

}
