package programmers.beginner;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day3_사칙연산_배열_수학_3_최빈값_구하기 {

  public static int solution(int[] array) {
    int answer = 0;

    Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
    for (int i = 0; i < array.length; i++) {
      if (hm.containsKey(array[i])) {
        int count = hm.get(array[i]);
        hm.put(array[i], ++count);

      } else {
        hm.put(array[i], 1);
      }
    }

    int value = 0;
    for (Map.Entry<Integer, Integer> m : hm.entrySet()) {
      if (m.getValue() > value) {
        answer = m.getKey();
        value = m.getValue();

      } else if (m.getValue() == value) {
        answer = -1;
      }
    }

    return answer;

    /*
     * int maxCount = 0;
     * Map<Integer, Integer> map = new HashMap<>();
     * for(int number : array){
     *  int count = map.getOrDefault(number, 0) + 1;
     *  if(count > maxCount){
     *      maxCount = count;
     *      answer = number;
     *  }
     *  else if(count == maxCount){
     *      answer = -1;
     *  }
     *  map.put(number, count);
     * }
     * */
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    int num4 = sc.nextInt();
    int num5 = sc.nextInt();
    int num6 = sc.nextInt();
    int[] numArr = {num1, num2, num3, num4, num5, num6};

    System.out.println(solution(numArr));

  }

}
