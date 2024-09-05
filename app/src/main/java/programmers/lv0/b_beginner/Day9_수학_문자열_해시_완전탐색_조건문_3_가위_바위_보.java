package programmers.lv0.b_beginner;

public class Day9_수학_문자열_해시_완전탐색_조건문_3_가위_바위_보 {

  public static String solution(String rsp) {
    String answer = "";

    for (int i = 0; i < rsp.length(); i++) {
      // 가위 : 2
      if (rsp.charAt(i) == '2') {
        answer += "0";

        // 바위 : 0
      } else if (rsp.charAt(i) == '0') {
        answer += "5";

        // 보 : 5
      } else {
        answer += "2";
      }
    }

    return answer;
  }

  public static void main(String[] args) {

    String rsp = "2";

    System.out.println(solution(rsp));

  }

}
