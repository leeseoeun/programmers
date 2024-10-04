package programmers.lv0.a_training;

import java.math.BigInteger;

public class Day22_함수_메서드_조건문_활용_2_두_수의_합 {

  public static String solution(String a, String b) {
    // 문자열을 BigInteger로 변환
    BigInteger num1 = new BigInteger(a);
    BigInteger num2 = new BigInteger(b);

    // 두 수를 더한 값을 반환
    BigInteger sum = num1.add(num2);

    // 결과를 문자열로 반환
    return sum.toString();
  }

  public static void main(String[] args) {

    String a = "582";
    String b = "734";

    System.out.println(solution(a, b));

  }

}
