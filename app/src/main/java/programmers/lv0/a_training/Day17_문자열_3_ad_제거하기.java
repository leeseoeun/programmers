package programmers.lv0.a_training;

import java.util.ArrayList;
import java.util.List;

public class Day17_문자열_3_ad_제거하기 {

  public static String[] solution(String[] strArr) {
    List<String> list = new ArrayList<>();

    for (int i = 0; i < strArr.length; i++) {
      if (strArr[i].indexOf("ad") > -1) {
        list.add(strArr[i]);
      }
    }

    return list.stream().toArray(String[]::new);
  }

  public static void main(String[] args) {

    String[] strArr = {"and","notad","abcd"};

    System.out.println(solution(strArr));

  }

}
