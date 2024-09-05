package programmers.lv0.a_training;

public class Day10_문자열_1_문자열의_앞의_n글자 {

  public static String solution(String my_string, int n) {
    return my_string.substring(0, n);
  }

  public static void main(String[] args) {

    String my_strings = "ProgrammerS123";
    int n = 11;

    System.out.println(solution(my_strings, n));

  }

}
