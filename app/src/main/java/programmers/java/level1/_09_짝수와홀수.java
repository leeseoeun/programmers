package programmers.java.level1;

public class _09_짝수와홀수 {
  public String solution(int num) {
    //    String answer = "";

    if (num == 0 || num % 2 == 0) {
      return "Even";
    } else {
      return "Odd";
    }

    //    return answer;
  }
}

/* 다른 풀이 */
class Solution4 {
  String evenOrOdd(int num) {
    return num == 0 || num % 2 == 0 ? "Even": "Odd";
  }
}
