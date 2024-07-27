package programmers.training;

import java.util.Scanner;

public class Day5_조건문_2_등차수열의_특정한_항만_더하기 {

  public static int solution(int a, int d, boolean[] included) {
    int answer = 0;

    int num = a;
    for (int i = 0; i < included.length; i++) {
      if (included[i]) {
        answer += num;
      }

      num += d;
    }

    return answer;

    /*
     * for(int i = 0; i < included.length; i++){
     *  if(included[i]){
     *      answer +=  a + (d*i);
     *  }
     * }
     * */
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int d = sc.nextInt();
    boolean[] included = {true, false, false, true, true};

    System.out.println(solution(a, d, included));

  }

}
