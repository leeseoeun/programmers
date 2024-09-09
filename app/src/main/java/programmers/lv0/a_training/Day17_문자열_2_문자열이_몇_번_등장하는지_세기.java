package programmers.lv0.a_training;

public class Day17_문자열_2_문자열이_몇_번_등장하는지_세기 {

  public static int solution(String myString, String pat) {
    int answer = 0;
    int idx = 0;

    while (idx > -1) {
      idx = myString.indexOf(pat);

      if (idx == 0) {
        answer++;
      }

      myString = myString.substring(1);
    }

    return answer;

    /*
     * int cnt = 0;
     * for(int i=0; i<myString.length(); i++) {
     *  if(myString.substring(i).startsWith(pat)){
     *      cnt++;
     *  }
     * }
     * return cnt;
     * */
  }

  public static void main(String[] args) {

    String myString = "banana";
    String pat = "ana";

    System.out.println(solution(myString, pat));

  }

}
