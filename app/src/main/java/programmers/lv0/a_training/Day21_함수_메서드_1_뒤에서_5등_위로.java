package programmers.lv0.a_training;

import java.util.Arrays;

public class Day21_함수_메서드_1_뒤에서_5등_위로 {

  public static int[] solution(int[] num_list) {
    Arrays.sort(num_list);

    return Arrays.copyOfRange(num_list, 5, num_list.length);
  }

  public static void main(String[] args) {

    int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};

    System.out.println(solution(num_list));

  }

}
