package programmers.training;

import java.util.Scanner;

public class Day5_조건문_1_코드_처리하기 {

  public static String solution(String code) {
    String answer = "";

    int mode = 0;
    String[] codeArr = code.split("");
    for (int i = 0; i < codeArr.length; i++) {
      if (mode == 0) {
        if (codeArr[i].equals("1")) {
          mode = 1;

        } else if (i % 2 == 0) {
          answer += codeArr[i];
        }

      } else {
        if (codeArr[i].equals("1")) {
          mode = 0;

        } else if (i % 2 == 1) {
          answer += codeArr[i];
        }
      }
    }

    if (answer.equals("")) {
      answer = "EMPTY";
    }

    return answer;

    /*
     * StringBuilder answer = new StringBuilder();
     * int mode = 0;
     * for (int i = 0; i < code.length(); i++) {
     *  char current = code.charAt(i);
     *  if (current == '1') {
     *      mode = mode == 0 ? 1 : 0;
     *      continue;
     *  }
     *  
     *  if (i % 2 == mode) {
     *      answer.append(current);
     *  }
     * }
     * return answer.length() == 0 ? "EMPTY" : answer.toString();
     * */
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String code = sc.next();

    System.out.println(solution(code));

  }

}
