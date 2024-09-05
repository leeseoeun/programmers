package programmers.lv0.a_training;

import java.util.ArrayList;
import java.util.List;

public class Day12_리스트_배열_3_배열_만들기_3 {

  public static int[] solution(int[] arr, int[][] intervals) {
    // intervals는 항상 [[a1, b1], [a2, b2]]의 꼴로 주어지며
    // -> 문제 잘 읽기

    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < intervals.length; i++) {
      int[] interval = intervals[i];

      for (int j = interval[0]; j < interval[1] + 1; j++) {
        list.add(arr[j]);
      }
    }

    return list.stream().mapToInt(i -> i).toArray();
  }

  public static void main(String[] args) {

    int[] arr = {1, 2, 3, 4, 5};
    int[][] intervals = {{1, 3}, {0, 4}};

    System.out.println(solution(arr, intervals));

  }

}
