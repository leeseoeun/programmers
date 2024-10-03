package programmers.lv0.a_training;

public class Day23_조건문_활용_2_꼬리_문자열 {

  public static String solution(String[] str_list, String ex) {
    String answer = "";

    for (int i = 0; i < str_list.length; i++) {
      if (str_list[i].indexOf(ex) < 0) {
        answer += str_list[i];
      }
    }

    return answer;
  }

  public static void main(String[] args) {

    String[] str_list = {"abc", "def", "ghi"};
    String ex = "ef";

    System.out.println(solution(str_list, ex));

  }

}
