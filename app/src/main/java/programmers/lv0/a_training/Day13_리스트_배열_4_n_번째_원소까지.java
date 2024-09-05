package programmers.lv0.a_training;

import java.util.Arrays;

public class Day13_리스트_배열_4_n_번째_원소까지 {

  public static int[] solution(int[] num_list, int n) {
    return Arrays.copyOfRange(num_list, 0, n);
  }

  public static void main(String[] args) {

    int[] num_list = {2, 1, 6};
    int n = 1;

    System.out.println(solution(num_list, n));

  }

}
