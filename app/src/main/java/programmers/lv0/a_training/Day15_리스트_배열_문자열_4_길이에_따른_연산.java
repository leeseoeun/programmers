package programmers.lv0.a_training;

public class Day15_리스트_배열_문자열_4_길이에_따른_연산 {

  public static int solution(int[] num_list) {
    int answer = 0;

    if (num_list.length >= 11) {
      for (int i = 0; i < num_list.length; i++) {
        answer += num_list[i];
      }
    } else {
      answer = 1;

      for (int i = 0; i < num_list.length; i++) {
        answer *= num_list[i];
      }
    }

    return answer;
  }

  public static void main(String[] args) {

    int[] num_list = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};

    System.out.println(solution(num_list));

  }

}
