package programmers.lv0.b_beginner;

public class Day10_조건문_배열_수학_시뮬레이션_3_공_던지기 {

  public static int solution(int[] numbers, int k) {
    // 첫번째 사람(0)이 공을 두칸(* 2)씩 던질 때
    int nextIndex = (0 + (k - 1) * 2) % numbers.length;

    return numbers[nextIndex];
  }

  public static void main(String[] args) {

    //    int[] numbers = {1, 2, 3, 4};
    //    int k = 2;
    //    int[] numbers = {1, 2, 3, 4, 5, 6};
    //    int k = 5;
    int[] numbers = {1, 2, 3};
    int k = 3;

    System.out.println(solution(numbers, k));

  }

}
