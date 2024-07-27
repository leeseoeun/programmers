package programmers.beginner;

public class Day5_수학_배열_4_배열_뒤집기 {

  public static int[] solution(int[] num_list) {
    int[] answer = new int[num_list.length];

    for (int i = 0; i < num_list.length; i++) {
      answer[i] = num_list[num_list.length - 1 - i];
    }

    return answer;
  }

  public static void main(String[] args) {

    System.out.println(solution(new int[] {1, 2, 3, 4, 5}));

  }

}
