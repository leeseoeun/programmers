package programmers.lv0.a_training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day18_문자열_2_문자열_잘라서_정렬하기 {

  public static String[] solution(String myString) {
    List<String> list = new ArrayList<>();

    String[] arr = myString.split("x");
    for (int i = 0; i < arr.length; i++) {
      if (!arr[i].equals("")) {
        list.add(arr[i]);
      }
    }

    Collections.sort(list);

    return list.stream().toArray(String[]::new);

    /*
     * StringTokenizer st = new StringTokenizer(myString, "x");
     * int idx = 0, N = st.countTokens();
     * String[] result = new String[N];
     * for (int n = 0;n < N;n++)
     *  result[idx++] = st.nextToken();
     * Arrays.sort(result);
     * return result;
     * */
  }

  public static void main(String[] args) {

    String myString = "oxooxoxxox";

    System.out.println(solution(myString));

  }

}
