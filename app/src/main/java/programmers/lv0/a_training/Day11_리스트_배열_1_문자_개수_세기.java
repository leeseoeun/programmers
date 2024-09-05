package programmers.lv0.a_training;

public class Day11_리스트_배열_1_문자_개수_세기 {

  public static int[] solution(String my_string) {
    int[] answer = new int[52];

    for (char c : my_string.toCharArray()) {
      // 'A' : 65
      if (Character.isUpperCase(c)) {
        // char - char = int
        answer[c - 65]++;

        // 'a' : 97
      } else {
        answer[c - 71]++;
      }
    }

    return answer;

    /*
     * for(int i = 0; i < my_string.length(); i++){
     *  char c = my_string.charAt(i);
     *  if(c >= 'a')
     *      answer[c - 'a' + 26]++;
     *  else
     *      answer[c - 'A']++;
     * }
     * */
  }

  public static void main(String[] args) {

    String my_string = "Programmers";

    System.out.println(solution(my_string));

  }

}
