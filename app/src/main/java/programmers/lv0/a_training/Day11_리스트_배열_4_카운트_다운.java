package programmers.lv0.a_training;

public class Day11_리스트_배열_4_카운트_다운 {

  public static int[] solution(int start_num, int end_num) {
    int[] answer = new int[start_num - end_num + 1];

    for (int i = 0; i < answer.length; i++) {
      answer[i] = start_num--;  // start_num - i
    }

    return answer;
  }

  public static void main(String[] args) {

    int start_num = 10;
    int end_num = 3;

    System.out.println(solution(start_num, end_num));

  }

}
