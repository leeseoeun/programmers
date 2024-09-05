package programmers.lv0.a_training;

import java.util.Arrays;

public class Day12_리스트_배열_5_배열_조각하기 {

  public static int[] solution(int[] arr, int[] query) {
    int[] answer = arr;

    for (int i = 0; i < query.length; i++) {
      if (i % 2 == 0) {
        answer = Arrays.copyOfRange(answer, 0, query[i] + 1);
      } else {
        answer = Arrays.copyOfRange(answer, query[i], answer.length);
      }
    }

    return answer;

    /*
     * int start = 0;
     * int end = arr.length - 1;
     * for (int i = 0; i < query.length; i++) {
     *  if (i % 2 == 0) {
     *      end = start + query[i] - 1; // - 1은 안 해도 됨
     *  } else {
     *      start += query[i];
     *  }
     * }
     * 
     * return Arrays.copyOfRange(arr, start, end + 2);  // + 1만 하면 됨
     * */
  }

  public static void main(String[] args) {

    int[] arr = {0, 1, 2, 3, 4, 5};
    int[] query = {4, 1, 2};

    System.out.println(solution(arr, query));

  }

}
