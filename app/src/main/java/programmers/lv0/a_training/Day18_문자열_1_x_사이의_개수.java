package programmers.lv0.a_training;

import java.util.ArrayList;
import java.util.List;

public class Day18_문자열_1_x_사이의_개수 {

  public static int[] solution(String myString) {
    List<Integer> list = new ArrayList<>();
    int cnt = 0;

    for (int i = 0; i < myString.length(); i++) {
      if (myString.charAt(i) == 'x') {
        list.add(cnt);
        cnt = 0;
      } else {
        cnt++;
      }

      if (i == myString.length() - 1) {
        list.add(cnt);
      }
    }

    return list.stream().mapToInt(i -> i).toArray();
  }

  public static void main(String[] args) {

    String myString = "oxooxoxxox";

    System.out.println(solution(myString));

  }

}
