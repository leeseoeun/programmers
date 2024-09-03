package programmers.beginner;

public class Day7_문자열_조건문_수학_반복문_1_특정_문자_제거하기 {

  public static String solution(String my_string, String letter) {
    return my_string.replaceAll(letter, "");

    /*
     * replace(char oldChar, char newChar)
     * replaceAll(String regex, String replacement)
     * */
  }

  public static void main(String[] args) {

    String my_strings = "abcdef";
    String letter = "f";

    System.out.println(solution(my_strings, letter));

  }

}
