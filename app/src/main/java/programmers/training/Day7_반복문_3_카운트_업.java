package programmers.training;

public class Day7_반복문_3_카운트_업 {

  public static int[] solution(int start_num, int end_num) {
    int len = end_num - start_num + 1;

    int[] answer = new int[len];

    for (int i = 0; i < len; i++) {
      answer[i] = start_num++;
    }

    return answer;
  }

  public static void main(String[] args) {

    int start_num = 3;
    int end_num = 10;

    System.out.println(solution(start_num, end_num));

  }

}
