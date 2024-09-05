package programmers.lv0.a_training;

import java.util.ArrayList;
import java.util.List;

public class Day07_반복문_4_콜라츠_수열_만들기 {

  public static int[] solution(int n) {
    List<Integer> al = new ArrayList<>();
    while (n > 1) {
      al.add(n);

      if (n % 2 == 0) {
        n /= 2;
      } else {
        n = 3 * n + 1;
      }
    }

    al.add(1);

    return al.stream().mapToInt(i -> i).toArray();
  }

  public static void main(String[] args) {

    int n = 10;

    System.out.println(solution(n));

  }

}
