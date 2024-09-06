package programmers.lv0.b_beginner;

public class Day11_수학_반복문_1_주사위의_개수 {

  public static int solution(int[] box, int n) {
    return (box[0] / n) * (box[1] / n) * (box[2] / n);
  }

  public static void main(String[] args) {

    int[] box = {1, 1, 1};
    int n = 1;

    System.out.println(solution(box, n));

  }

}
