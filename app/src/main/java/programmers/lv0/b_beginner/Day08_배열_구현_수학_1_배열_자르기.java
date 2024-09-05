package programmers.lv0.b_beginner;

public class Day08_배열_구현_수학_1_배열_자르기 {

  public static int[] solution(int[] numbers, int num1, int num2) {
    int len = num2 - num1 + 1;
    int[] answer= new int[len];

    for (int i = 0; i < len; i++) {
      answer[i] = numbers[num1 + i];
    }

    //    int[] answer = new int[num2 - num1 + 1];
    //
    //    int idx = 0;
    //    for (int i = num1; i <= num2; i++) {
    //      answer[idx++] = numbers[i];
    //    }

    return answer;

    /*
     * return Arrays.copyOfRange(numbers, num1, num2 + 1);
     * */
  }

  public static void main(String[] args) {

    int[] numbers = {1, 2, 3, 4, 5};
    int num1 = 1;
    int num2 = 3;

    System.out.println(solution(numbers, num1, num2));

  }

}
