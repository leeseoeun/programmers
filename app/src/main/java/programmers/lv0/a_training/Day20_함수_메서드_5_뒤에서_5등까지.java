package programmers.lv0.a_training;

import java.util.Arrays;

public class Day20_함수_메서드_5_뒤에서_5등까지 {

  public static int[] solution(int[] num_list) {
    Arrays.sort(num_list);

    return Arrays.copyOf(num_list, 5);
  }

  public static void main(String[] args) {

    int[] num_list = {12, 4, 15, 46, 38, 1, 14};

    System.out.println(solution(num_list));

  }

}
