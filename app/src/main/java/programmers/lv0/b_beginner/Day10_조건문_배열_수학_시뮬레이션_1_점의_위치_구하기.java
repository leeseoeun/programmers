package programmers.lv0.b_beginner;

public class Day10_조건문_배열_수학_시뮬레이션_1_점의_위치_구하기 {

  public static int solution(int[] dot) {
    if (dot[0] > 0) {
      if (dot[1] > 0) {
        return 1;
      } else {
        return 4;
      }
    } else {
      if (dot[1] > 0) {
        return 2;
      } else {
        return 3;
      }
    }
  }

  public static void main(String[] args) {

    int[] dot = {2, 4};

    System.out.println(solution(dot));

  }

}
