package programmers.training;

public class Day8_조건문_반복문_4_9로_나눈_나머지 {

  public static int solution(String number) {
    int answer = 0;

    String[] arr = number.split("");
    for (int i = 0; i < arr.length; i++) {
      answer += Integer.parseInt(arr[i]);
    }

    return answer % 9;
  }

  public static void main(String[] args) {

    String number = "123";

    System.out.println(solution(number));

  }

}
