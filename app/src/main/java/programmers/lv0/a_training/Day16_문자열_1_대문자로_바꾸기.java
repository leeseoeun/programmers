package programmers.lv0.a_training;

public class Day16_문자열_1_대문자로_바꾸기 {

  public static String solution(String myString) {
    return myString.toUpperCase();
  }

  public static void main(String[] args) {

    String myString = "aBcDeFg";

    System.out.println(solution(myString));

  }

}
