package programmers.lv0.a_training;

import java.util.ArrayList;
import java.util.List;

public class Day09_문자열_1_배열_만들기_5 {

  public static int[] solution(String[] intStrs, int k, int s, int l) {
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < intStrs.length; i++) {
      int num = Integer.parseInt(intStrs[i].substring(s, s + l)); 
      if (num > k) {
        list.add(num);
      }
    }

    return list.stream().mapToInt(i -> i).toArray();
  }

  public static void main(String[] args) {

    String[] intStrs = {"0123456789","9876543210","9999999999999"};
    int k = 50000;
    int s = 5;
    int l = 5;

    System.out.println(solution(intStrs, k, s, l));

  }

}
