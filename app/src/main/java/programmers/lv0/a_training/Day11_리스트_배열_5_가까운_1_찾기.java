package programmers.lv0.a_training;

public class Day11_리스트_배열_5_가까운_1_찾기 {

  public static int solution(int[] arr, int idx) {
    int answer = -1;

    for (int i = idx; i < arr.length; i++) {
      if (arr[i] == 1) {
        // return i;
        answer = i;
        break;
      }
    }

    // return -1;
    return answer;
  }

  public static void main(String[] args) {

    int[] arr = {0, 0, 0, 1};
    int idx = 1;

    System.out.println(solution(arr, idx));

  }

}
