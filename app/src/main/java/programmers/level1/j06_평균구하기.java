package programmers.level1;

public class j06_평균구하기 {
  public double solution(int[] arr) {
    double answer = 0;

    double total = 0;

    for (int i = 0; i < arr.length; i++) {
      total += arr[i];
    }

    answer = total / arr.length;

    return answer;
  }
}
