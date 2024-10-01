package programmers.lv0.a_training;

import java.util.ArrayList;
import java.util.List;

public class Day19_문자열_리스트_배열_1_세_개의_구분자 {

  public static String[] solution(String myStr) {
    List<String> list = new ArrayList<>();

    myStr = myStr.replace("a", "-").replace("b", "-").replace("c", "-");

    String[] arr = myStr.split("-");
    if (arr.length == 0) {
      return new String[] {"EMPTY"};
    } else {
      for (int i = 0; i < arr.length; i++) {
        if (!arr[i].equals("")) {
          list.add(arr[i]);
        }
      }

      return list.stream().toArray(String[]::new);

      /*
       * myStr = myStr.replaceAll("[a|b|c]+", ",");
       * myStr = myStr.charAt(0) == ',' ? myStr.substring(1) : myStr;
       * myStr = myStr.equals("") ? "EMPTY" : myStr;
       * 
       * return myStr.split("[,]");
       * */
    }
  }

  public static void main(String[] args) {

    String myStr = "baconlettucetomato";

    System.out.println(solution(myStr));

  }

}
