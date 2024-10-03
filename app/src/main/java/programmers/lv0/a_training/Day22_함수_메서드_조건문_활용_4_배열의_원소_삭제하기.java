package programmers.lv0.a_training;

import java.util.Arrays;

public class Day22_함수_메서드_조건문_활용_4_배열의_원소_삭제하기 {

  public static int[] solution(int[] arr, int[] delete_list) {
    int[] answer = new int[arr.length];

    int idx = 0;
    boolean flag = false;
    for (int i = 0; i < arr.length; i++) {
      flag = false;

      for (int j = 0; j < delete_list.length; j++) {
        if (arr[i] == delete_list[j]) {
          flag = true;
          break;
        }
      }

      if (!flag) {
        answer[idx] = arr[i];
        idx++;
      }
    }

    return Arrays.copyOf(answer, idx);

    /*
     * List<Integer> list = new ArrayList<>();
     * 
     * for(int n : arr) {
     *  list.add(n);
     * }
     * for(int n: delete_list) {
     *  list.remove((Integer)n);
     * }
     * int[] answer = new int[list.size()];
     * for(int i=0; i<list.size(); i++){
     *  answer[i] = list.get(i);
     * }
     * */
  }

  public static void main(String[] args) {

    int[] arr = {293, 1000, 395, 678, 94};
    int[] delete_list = {94, 777, 104, 1000, 1, 12};

    System.out.println(solution(arr, delete_list));

  }

}
