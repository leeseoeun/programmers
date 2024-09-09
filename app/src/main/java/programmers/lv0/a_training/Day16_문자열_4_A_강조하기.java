package programmers.lv0.a_training;

public class Day16_문자열_4_A_강조하기 {

  public static String solution(String myString) {
    String answer = "";
    String[] arr = myString.split("");

    for (int i = 0; i < arr.length; i++) {
      if (arr[i].equals("a") || arr[i].equals("A")) {
        answer += arr[i].toUpperCase();
      } else {
        answer += arr[i].toLowerCase();
      }
    }

    return answer;

    /*
     * myString = myString.toLowerCase();
     * myString = myString.replace('a', 'A');
     * 
     * return myString;
     * */
  }

  public static void main(String[] args) {

    String myString = "abstract algebra";

    System.out.println(solution(myString));

  }

}
