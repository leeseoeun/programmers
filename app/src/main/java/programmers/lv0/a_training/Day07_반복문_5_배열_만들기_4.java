package programmers.lv0.a_training;

import java.util.Stack;

public class Day07_반복문_5_배열_만들기_4 {

  public static int[] solution(int[] arr) {
    Stack<Integer> stack = new Stack<>();
    int num = 0;
    while (num < arr.length) {
      if (stack.isEmpty() || arr[num] > stack.peek()) {
        stack.add(arr[num]);
        num++;
      } else {
        stack.pop();
      }
    }

    return stack.stream().mapToInt(i -> i).toArray();
  }

  public static void main(String[] args) {

    int[] arr = {1, 4, 2, 5, 3};

    System.out.println(solution(arr));

  }

}
