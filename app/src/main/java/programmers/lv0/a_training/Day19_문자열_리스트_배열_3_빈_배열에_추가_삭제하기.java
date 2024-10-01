package programmers.lv0.a_training;

import java.util.ArrayList;
import java.util.List;

public class Day19_문자열_리스트_배열_3_빈_배열에_추가_삭제하기 {

  public static int[] solution(int[] arr, boolean[] flag) {
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      if (flag[i]) {
        for (int j = 0; j < arr[i] * 2; j++) {
          list.add(arr[i]);
        }

      } else {
        for (int j = 0; j < arr[i]; j++) {
          list.remove(list.size() - 1);
        }
      }
    }

    return list.stream().mapToInt(i -> i).toArray();
  }

  public static void main(String[] args) {

    int[] arr = {3, 2, 4, 1, 3};
    boolean[] flag = {true, false, true, false, false};

    System.out.println(solution(arr, flag));

  }

}
