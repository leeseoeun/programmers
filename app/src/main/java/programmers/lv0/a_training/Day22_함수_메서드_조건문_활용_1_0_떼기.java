package programmers.lv0.a_training;

public class Day22_함수_메서드_조건문_활용_1_0_떼기 {

  public static String solution(String n_str) {
    String[] arr = n_str.split("");
    int idx = 0;
    for (int i = 0; i < arr.length; i++) {
      if (!arr[i].equals("0")) {
        idx = i;
        break;
      }
    }

    return n_str.substring(idx);

    /*
     * return ""+Integer.parseInt(n_str);
     * */
  }

  public static void main(String[] args) {

    String n_str = "0010";

    System.out.println(solution(n_str));

  }

}
