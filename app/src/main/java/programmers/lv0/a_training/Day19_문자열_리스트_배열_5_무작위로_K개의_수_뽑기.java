package programmers.lv0.a_training;

import java.util.ArrayList;
import java.util.List;

public class Day19_문자열_리스트_배열_5_무작위로_K개의_수_뽑기 {

  public static int[] solution(int[] arr, int k) {
    int[] answer = new int[k];
    for (int i = 0; i < answer.length; i++) {
      answer[i] = -1;
    }

    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      if (list.size() == k) {
        break;
      }

      if (!list.contains(arr[i]) && list.size() < k) {
        list.add(arr[i]);
      }
    }

    for (int i = 0; i < list.size(); i++) {
      answer[i] = list.get(i);
    }

    return answer;
  }

  public static void main(String[] args) {

    int[] arr = {0, 1, 1, 2, 2, 3};
    int k = 3;

    System.out.println(solution(arr, k));

  }

}
