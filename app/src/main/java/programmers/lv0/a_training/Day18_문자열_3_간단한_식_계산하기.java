package programmers.lv0.a_training;

public class Day18_문자열_3_간단한_식_계산하기 {

  public static int solution(String binomial) {
    int answer = 0;

    String[] arr = binomial.split(" ");
    switch (arr[1]) {
      case "+":
        return Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
      case "-":
        return Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
      case "*":
        return Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]);
    }

    return answer;
  }

  public static void main(String[] args) {

    String binomial = "43 + 12";

    System.out.println(solution(binomial));

  }

}
