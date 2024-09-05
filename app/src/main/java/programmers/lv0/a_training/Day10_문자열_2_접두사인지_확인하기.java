package programmers.lv0.a_training;

public class Day10_문자열_2_접두사인지_확인하기 {

  public static int solution(String my_string, String is_prefix) {
    if (my_string.startsWith(is_prefix)) {
      return 1;
    } else {
      return 0;
    }
  }

  public static void main(String[] args) {

    String my_strings = "banana";
    String is_prefix = "ban";

    System.out.println(solution(my_strings, is_prefix));

  }

}
