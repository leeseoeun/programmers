package programmers.lv0.a_training;

import java.util.ArrayList;
import java.util.List;

public class Day17_문자열_5_공백으로_구분하기_2 {

  public static String[] solution(String my_string) {
    List<String> list = new ArrayList<>();
    String[] arr = my_string.split(" ");

    for (int i = 0, j = 0; i < arr.length; i++, j++) {
      if (!arr[i].equals("")) {
        list.add(arr[i]);
      }
    }

    return list.stream().toArray(String[]::new);

    /*
     * // + : 하나 이상을 의미
     * // [ ] : 단일 공백 문자 ' '만을 의미
     * return my_string.trim().split("[ ]+");
     * */

    /*
     * // + : 하나 이상을 의미
     * // \\s : 모든 공백 문자(스페이스, 탭, 줄바꿈 등)를 의미
     * return myString.trim().split("\\s+");
     * */
  }

  public static void main(String[] args) {

    String my_string = " i    love  you";

    System.out.println(solution(my_string));

  }

}
