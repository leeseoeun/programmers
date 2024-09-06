package programmers.lv0.b_beginner;

public class Day11_수학_반복문_4_팩토리얼 {

  public static int solution(int n) {
    if (n == 1) {
      return 1;
    }

    int num = 1;
    int answer = 1;

    while (num < n) {
      num *= answer++;
    }

    return num == n ? answer - 1 : answer - 2;

    /*
     * int answer = 1;
     * int factorial = 1;
     * 
     * while(n >= factorial) {
     *  answer ++;
     *  factorial *= answer;
     * }
     * 
     * return answer -1 ;
     */
  }

  public static void main(String[] args) {

    int n = 3628800;

    System.out.println(solution(n));

  }

}
