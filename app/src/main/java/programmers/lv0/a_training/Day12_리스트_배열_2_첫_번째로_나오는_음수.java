package programmers.lv0.a_training;

public class Day12_리스트_배열_2_첫_번째로_나오는_음수 {

  public static int solution(int[] num_list) {
    for (int i = 0; i < num_list.length; i++) {
      if (num_list[i] < 0) {
        return i;
      }
    }

    return -1;
  }

  public static void main(String[] args) {

    int[] num_list = {12, 4, 15, 46, 38, -2, 15};

    System.out.println(solution(num_list));

  }

}
