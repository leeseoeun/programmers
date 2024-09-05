package programmers.lv0.a_training;

public class Day09_문자열_3_문자열의_뒤의_n글자 {

  public static String solution(String my_string, int n) {
    return my_string.substring(my_string.length() - n);
  }

  public static void main(String[] args) {

    String my_strings = "ProgrammerS123";
    int n = 11;

    System.out.println(solution(my_strings, n));

  }

}
