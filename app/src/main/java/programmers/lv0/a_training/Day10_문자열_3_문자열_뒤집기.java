package programmers.lv0.a_training;

public class Day10_문자열_3_문자열_뒤집기 {

  public static String solution(String my_string, int s, int e) {
    String answer = "";

    String[] my_strings = my_string.split("");
    String[] arr = my_string.substring(s, e + 1).split("");
    int idx = arr.length - 1;

    for (int i = 0; i < my_strings.length; i++) {
      if (s <= i && i <= e) {
        answer += arr[idx--];
      } else {
        answer += my_strings[i];
      }
    }

    return answer;

    /*
     * StringBuilder answer = new StringBuilder(my_string.substring(s, e + 1));
     * answer.reverse();
     * return my_string.substring(0, s) + answer + my_string.substring(e + 1);
     * */
  }

  public static void main(String[] args) {

    String my_strings = "Progra21Sremm3";
    int s = 6;
    int e = 12;

    System.out.println(solution(my_strings, s, e));

  }

}
