package programmers.training;

public class Day9_문자열_5_접미사인지_확인하기 {

  public static int solution(String my_string, String is_suffix) {
    for (int i = 0; i < my_string.length(); i++) {
      if (my_string.substring(i).equals(is_suffix)) {
        return 1;
      }
    }

    return 0;

    /*
     * if(my_string.endsWith(is_suffix)) {
     *  return 1;
     * } else {
     *  return 0;
     * }
     * */
  }

  public static void main(String[] args) {

    String my_strings = "banana";
    String is_suffix = "ana";

    System.out.println(solution(my_strings, is_suffix));

  }

}
