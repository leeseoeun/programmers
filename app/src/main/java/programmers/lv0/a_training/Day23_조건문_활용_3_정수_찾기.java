package programmers.lv0.a_training;

public class Day23_조건문_활용_3_정수_찾기 {

  public static int solution(int[] num_list, int n) {
    for (int i = 0; i < num_list.length; i++) {
      if (num_list[i] == n) {
        return 1;
      }
    }

    return 0;
  }

  public static void main(String[] args) {

    int[] num_list = {1, 2, 3, 4, 5};
    int n = 3;

    System.out.println(solution(num_list, n));

  }

}
