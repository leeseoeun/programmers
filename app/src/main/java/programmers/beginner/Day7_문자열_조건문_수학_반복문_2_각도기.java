package programmers.beginner;

public class Day7_문자열_조건문_수학_반복문_2_각도기 {

  public static int solution(int angle) {
    if (0 < angle && angle < 90) {
      return 1;
    } else if (angle == 90) {
      return 2;
    } else if (90 < angle && angle < 180) {
      return 3;
    } else {
      return 4;
    }

    /*
     * return angle == 180 ? 4 : angle < 90 ? 1 : angle == 90 ? 2 : angle > 90 ? 3 : 0;
     * */
  }

  public static void main(String[] args) {

    int angle = 70;

    System.out.println(solution(angle));

  }

}
