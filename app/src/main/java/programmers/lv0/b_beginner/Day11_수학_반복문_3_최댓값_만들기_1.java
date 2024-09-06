package programmers.lv0.b_beginner;

import java.util.Arrays;

public class Day11_수학_반복문_3_최댓값_만들기_1 {

  public static int solution(int[] numbers) {
    Arrays.sort(numbers);

    return numbers[numbers.length - 1] * numbers[numbers.length - 2];
  }

  public static void main(String[] args) {

    int[] numbers = {1, 2, 3, 4, 5};

    System.out.println(solution(numbers));

  }

}
