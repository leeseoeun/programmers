package programmers.lv0.a_training;

public class Day21_함수_메서드_4_문자열_정수의_합 {

  public static int solution(String num_str) {
    int answer = 0;

    String[] arr = num_str.split("");
    for (int i = 0; i < arr.length; i++) {
      answer += Integer.parseInt(arr[i]);
    }

    return answer;
  }

  public static void main(String[] args) {

    String num_str = "123456789";

    System.out.println(solution(num_str));

  }

}
