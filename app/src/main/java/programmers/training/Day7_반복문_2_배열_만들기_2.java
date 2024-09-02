package programmers.training;

import java.util.ArrayList;
import java.util.List;

public class Day7_반복문_2_배열_만들기_2 {

  public static int[] solution(int l, int r) {
    List<Integer> al = new ArrayList<>();
    for (int i = l; i < r + 1; i++) {
      int num = i;
      boolean flag = false;
      while (num > 0) {
        if (num % 10 == 0 || num % 10 == 5) {
          flag = true;
        } else {
          flag = false;
          break;
        }
        num /= 10;
      }

      if (flag) {
        al.add(i);
      }
    }

    if (al.size() == 0) {
      return new int[] {-1};
    } else {
      return al.stream().mapToInt(i -> i).toArray();
    }

  }

  public static void main(String[] args) {

    int l = 5;
    int r = 555;

    System.out.println(solution(l, r));

  }

}
