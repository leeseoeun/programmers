package programmers.level1;

public class 콜라츠_추측 {
  public int solution(int num) {
    int answer = 0;

    while (num != 1) {
      if (num % 2 == 0) {
        num /= 2;

      } else if (num % 2 == 1) {    //else if (num % 2 != 0) 또는 else일 때? overflow 발생
        num = (num * 3) + 1;
      }

      answer++;

      if (answer == 500) {
        return -1;
      }
    }

    return answer;
  }
}

/* 다른 풀이 */
class Solution3 {
  public int solution(int num) {
    int answer = 0;

    long n = num;   //overflow 때문에 long으로 형 변환

    while (n != 1) {
      if (n % 2 == 0) {
        n /= 2;

      } else {
        n = (n * 3) + 1;
      }

      answer++;

      if (answer == 500) {
        return -1;
      }
    }

    return answer;
  }
}
