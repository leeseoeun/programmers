package programmers.lv0.a_training;

public class Day10_문자열_4_세로_읽기 {

  public static String solution(String my_string, int m, int c) {
    String answer = "";

    String[] arr = my_string.split("");
    for (int i = c - 1; i < arr.length; i += m) {
      answer += arr[i];
    }

    return answer;

    /*
     * for (int i = c - 1; i < my_string.length(); i += m) {
     *  answer += my_string.charAt(i);
     * }
     * */
  }

  public static void main(String[] args) {

    String my_strings = "ihrhbakrfpndopljhygc";
    int m = 4;
    int c = 2;

    System.out.println(solution(my_strings, m, c));

  }

}
