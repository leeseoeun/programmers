package programmers.lv0.a_training;

import java.util.Arrays;

public class Day13_리스트_배열_3_왼쪽_오른쪽 {

  public static String[] solution(String[] str_list) {
    int start = 0;
    int end = 0;
    for (int i = 0; i < str_list.length; i++) {
      if (str_list[i].equals("l")) {
        end = i;
        break;
      } else if (str_list[i].equals("r")) {
        start = i + 1;
        end = str_list.length;
        break;
      }
    }

    return Arrays.copyOfRange(str_list, start, end);

    /*
     * for (int i = 0; i < str_list.length; i++) {
     *  if ("l".equals(str_list[i])) {
     *      return Arrays.copyOfRange(str_list, 0, i);
     *  } else if ("r".equals(str_list[i])) {
     *      return Arrays.copyOfRange(str_list, i + 1, str_list.length);
     *  }
     * }
     * 
     * return new String[0];
     * */
  }

  public static void main(String[] args) {

    String[] str_list = {"u", "u", "l", "r"};

    System.out.println(solution(str_list));

  }

}
