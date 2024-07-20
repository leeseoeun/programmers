package programmers.lv1;

public class _02_x만큼간격이있는n개의숫자 {
  public long[] solution(long x, int n) {  //x가 정수이기 때문에 long
    long[] answer = new long[n];    //배열 선언 및 초기화

    for (int i = 0; i < n; i++) {
      answer[i] = x * (i + 1);
    }

    return answer;
  }
}
