package programmers.lv0.a_training;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Day20_함수_메소드_3_문자열_묶기 {

  public static int solution(String[] strArr) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < strArr.length; i++) {
      map.put(strArr[i].length(), map.getOrDefault(strArr[i].length(), 0) + 1);
    }

    return Collections.max(map.values());
  }

  public static void main(String[] args) {

    String[] strArr = {"a","bc","d","efg","hi"};

    System.out.println(solution(strArr));

  }

}
