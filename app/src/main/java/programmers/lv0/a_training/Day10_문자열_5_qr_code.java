package programmers.lv0.a_training;

public class Day10_문자열_5_qr_code {

  public static String solution(int q, int r, String code) {
    String answer = "";

    for (int i = r; i < code.length(); i += q) {
      answer += code.charAt(i);
    }

    return answer;
  }

  public static void main(String[] args) {

    int q = 3;
    int r = 1;
    String code = "qjnwezgrpirldywt";

    System.out.println(solution(q, r, code));

  }

}
