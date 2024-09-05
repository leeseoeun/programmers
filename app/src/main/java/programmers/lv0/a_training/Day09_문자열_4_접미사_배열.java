package programmers.lv0.a_training;

import java.util.Arrays;

public class Day09_문자열_4_접미사_배열 {

  public static String[] solution(String my_string) {
    String[] answer = new String[my_string.length()];

    for (int i = 0; i < my_string.length(); i++) {
      answer[i] = my_string.substring(i);
    }

    Arrays.sort(answer);

    return answer;
  }

  public static void main(String[] args) {

    String my_strings = "banana";

    System.out.println(solution(my_strings));

  }

}
