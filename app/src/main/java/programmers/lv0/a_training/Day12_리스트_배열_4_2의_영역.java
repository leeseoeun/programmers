package programmers.lv0.a_training;

import java.util.ArrayList;
import java.util.List;

public class Day12_리스트_배열_4_2의_영역 {

  public static int[] solution(int[] arr) {
    int[] answer;

    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      list.add(arr[i]);
    }

    int start = list.indexOf(2);
    int end = list.lastIndexOf(2);

    if (start == -1) {
      return new int[] {-1};
    } else if (start == end) {
      return new int[] {2};
    } else {
      answer = new int[end - start + 1];
      for (int i = start, j = 0; i < answer.length; i++) {
        answer[j++] = arr[i];
      }

      return answer;
    }

    /*
     * int start = -1;
     * int end = -1;
     * 
     * for(int i=0;i<arr.length;i++){
     *  if(arr[i]==2){
     *      if(start==-1){
     *          start = i;
     *      }
     *      end = i;
     *  }
     * }
     * 
     * if(start==-1){
     *  answer = new int[]{-1};
     * }else{
     *  answer = Arrays.copyOfRange(arr,start,end+1);
     * }
     * */
  }

  public static void main(String[] args) {

    //    int[] arr = {1, 2, 1, 4, 5, 2, 9};
    //    int[] arr = {1, 2, 1};
    //    int[] arr = {1, 1, 1};
    int[] arr = {1, 2, 1, 2, 1, 10, 2, 1};

    System.out.println(solution(arr));

  }

}
