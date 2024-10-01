package programmers.lv0.a_training;

import java.util.ArrayList;
import java.util.List;

public class Day19_문자열_리스트_배열_4_배열_만들기_6 {

  public static int[] solution(int[] arr) {
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      if (list.size() == 0) {
        list.add(arr[i]);

      } else if (list.get(list.size() - 1) == arr[i]) {
        list.remove(list.size() - 1);

      } else {
        list.add(arr[i]);
      }
    }

    if (list.size() == 0) {
      return new int[] {-1};
    }

    return list.stream().mapToInt(i -> i).toArray();

    /*
     * Stack<Integer> stack = new Stack<>();
     * 
     * for (int no : arr) {
     *  if (!stack.isEmpty() && no == stack.peek()) {
     *      stack.pop();
     *  } else {
     *      stack.push(no);
     *  }
     * }
     * 
     * return stack.isEmpty() ? new int[] { -1 } : stack.stream().mapToInt(i -> i).toArray();
     * */
  }

  public static void main(String[] args) {

    int[] arr = {0, 1, 1, 1, 0};

    System.out.println(solution(arr));

  }

}
