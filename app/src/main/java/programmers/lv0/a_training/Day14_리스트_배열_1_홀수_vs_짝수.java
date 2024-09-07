package programmers.lv0.a_training;

public class Day14_리스트_배열_1_홀수_vs_짝수 {

  public static int solution(int[] num_list) {
    int oddTotal = 0;
    int evenTotal = 0;

    for (int i = 0; i < num_list.length; i++) {
      // 홀수 원소
      if (i % 2 == 0) {
        oddTotal += num_list[i];

        // 짝수 원소
      } else {
        evenTotal += num_list[i];
      }
    }

    return Math.max(oddTotal, evenTotal);
  }

  public static void main(String[] args) {

    int[] num_list = {4, 2, 6, 1, 7, 6};

    System.out.println(solution(num_list));

  }

}
