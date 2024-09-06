package programmers.lv0.b_beginner;

public class Day10_조건문_배열_수학_시뮬레이션_4_배열_회전시키기 {

  public static int[] solution(int[] numbers, String direction) {
    int[] answer = new int[numbers.length];

    if (direction.equals("left")) {
      for (int i = 0; i < numbers.length - 1; i++) {
        answer[i] = numbers[i + 1];
      }
      answer[numbers.length - 1] = numbers[0];

    } else {
      answer[0] = numbers[numbers.length - 1];
      for (int i = 1; i < numbers.length - 1; i++) {
        answer[i] = numbers[i - 1];
      }
    }

    return answer;
  }

  public static void main(String[] args) {

    int[] numbers = {1, 2, 3};
    String direction = "right";

    System.out.println(solution(numbers, direction));

  }

}
