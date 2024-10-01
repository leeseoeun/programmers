package programmers.lv0.a_training;

import java.util.ArrayList;
import java.util.List;

public class Day19_문자열_리스트_배열_2_배열의_원소만큼_추가하기 {

  public static int[] solution(int[] arr) {
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i]; j++) {
        list.add(arr[i]);
      }
    }

    return list.stream().mapToInt(i -> i).toArray();

    /*
     * int[] answer = {};
     * 
     * int sum = 0;
     * 
     * for(int i=0; i<arr.length; i++) {
     *  sum += arr[i]; 
     * }
     * 
     * answer = new int[sum];
     * 
     * int idx = 0;
     * 
     * for(int i=0; i<arr.length; i++) {
     *  for(int j=0; j<arr[i]; j++) {
     *      answer[idx++] = arr[i];
     *  }
     * }
     * 
     * return answer;
     * */
  }

  public static void main(String[] args) {

    int[] arr = {5, 1, 4};

    System.out.println(solution(arr));

  }

}
