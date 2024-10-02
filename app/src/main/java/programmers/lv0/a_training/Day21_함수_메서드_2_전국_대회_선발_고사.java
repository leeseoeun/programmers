package programmers.lv0.a_training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day21_함수_메서드_2_전국_대회_선발_고사 {

  public static int solution(int[] rank, boolean[] attendance) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < rank.length; i++) {
      if (attendance[i]) {
        map.put(rank[i], i);
      }
    }

    List<Integer> list = new ArrayList<Integer> (map.keySet());
    Collections.sort(list);

    return 10000 * map.get(list.get(0)) + 100 * map.get(list.get(1)) + map.get(list.get(2));

    /*
     * PriorityQueue<Integer> que = new PriorityQueue<>((a, b) -> rank[a] - rank[b]);
     * for (int i = 0; i < attendance.length; i++) {
     *  if (attendance[i])
     *      que.add(i);
     * }
     * 
     * return que.poll() * 10000 + que.poll() * 100 + que.poll();
     * */
  }

  public static void main(String[] args) {

    int[] rank = {3, 7, 2, 5, 4, 6, 1};
    boolean[] attendance = {false, true, true, true, true, false, false};

    System.out.println(solution(rank, attendance));

  }

}
