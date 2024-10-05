package programmers.lv0.a_training;

public class Day24_조건문_활용_반복문_활용_이차원_리스트_배열_4_l로_만들기 {

  public static String solution(String myString) {
    return myString.replaceAll("[a-l]", "l");
  }

  public static void main(String[] args) {

    String myString = "abcdevwxyz";

    System.out.println(solution(myString));

  }

}
