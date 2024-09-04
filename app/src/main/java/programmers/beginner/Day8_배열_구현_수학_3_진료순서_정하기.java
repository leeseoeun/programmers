package programmers.beginner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day8_배열_구현_수학_3_진료순서_정하기 {

  public static int[] solution(int[] emergency) {
    int[] answer = new int[emergency.length];

    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < emergency.length; i++) {
      map.put(emergency[i], i);
    }

    List<Integer> list = new ArrayList<>(map.keySet());
    Collections.sort(list, Collections.reverseOrder());

    for (int i = 0; i < emergency.length; i++) {
      int key = list.get(i);
      int idx = map.get(key);
      answer[idx] = i + 1; 
    }

    return answer;

    /*
     * for(int i = 0; i < answer.length; i++){
     *  if(answer[i] != 0){
     *      continue;
     *  }
     *  int idx = 1;
     *  for(int j = 0; j < answer.length; j++){
     *      if(emergency[i] < emergency[j]){
     *          idx++;  // 자신보다 큰 값들을 count 하면 그게 순위
     *      }
     *  }
     *  answer[i] = idx;
     * }
     * */
  }

  public static void main(String[] args) {

    int[] emergency = {3, 76, 24};

    System.out.println(solution(emergency));

  }

}
