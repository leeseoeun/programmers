package programmers.lv0.a_training;

import java.util.ArrayList;
import java.util.List;

public class Day14_리스트_배열_3_할_일_목록 {

  public static String[] solution(String[] todo_list, boolean[] finished) {
    List<String> answer = new ArrayList<>();

    for (int i = 0; i < todo_list.length; i++) {
      if (!finished[i]) {
        answer.add(todo_list[i]);
      }
    }

    // String[] strArr1 = strList.toArray(new String[strList.size()]);  /* Java8 이전 버전 */
    // String[] strArr2 = strList.stream().toArray(String[]::new);      /* Java8 이후 버전 */
    // String[] strArr3 = strList.toArray(String[]::new);               /* Java11 이후 버전 */
    return answer.toArray(String[]::new);

    /*
     * String str = "";
     * for(int i=0; i<finished.length; i++){
     *  str = finished[i]==false ? str+todo_list[i]+"," : str;
     * }
     * 
     * return str.split(",");
     * */
  }

  public static void main(String[] args) {

    String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
    boolean[] finished = {true, false, true, false};

    System.out.println(solution(todo_list, finished));

  }

}
