package programmers.lv0.a_training;

import java.util.ArrayList;
import java.util.List;

public class Day12_리스트_배열_1_리스트_자르기 {

  public static int[] solution(int n, int[] slicer, int[] num_list) {
    List<Integer> list = new ArrayList<>();

    int start = n == 1 ? 0 : slicer[0];
    int end = n == 2 ? num_list.length -1 : slicer[1];
    int interval = n == 4 ? slicer[2] : 1;

    for (int i = start; i < end + 1; i += interval) {
      list.add(num_list[i]);
    }

    return list.stream().mapToInt(i -> i).toArray();

    /*
     * int start = n == 1 ? 0 : slicer[0];
     * int end = n == 2 ? num_list.length - 1 : slicer[1];
     * int step = n == 4 ? slicer[2] : 1;
     * int[] answer = new int[(end - start + step) / step];
     * for (int i = start, j = 0; i <= end; i += step) {
     *  answer[j++] = num_list[i];
     * }
     * */
  }

  public static void main(String[] args) {

    int n = 3;
    int[] slicer = {1, 5, 2};
    int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    System.out.println(solution(n, slicer, num_list));

  }

}
