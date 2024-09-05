package programmers.lv0.a_training;

public class Day11_리스트_배열_3_글자_지우기 {

  public static String solution(String my_string, int[] indices) {
    String answer = "";

    String[] arr = my_string.split("");

    for (int i = 0; i < indices.length; i++) {
      arr[indices[i]] = "";
    }

    for (int i = 0; i < arr.length; i++) {
      answer += arr[i];
    }

    return answer;
  }

  public static void main(String[] args) {

    String my_string = "apporoograpemmemprs";
    int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};

    System.out.println(solution(my_string, indices));

  }

}
