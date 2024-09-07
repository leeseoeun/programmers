package programmers.lv0.a_training;

public class Day14_리스트_배열_2_5명씩 {

  public static String[] solution(String[] names) {
    String[] answer = new String[names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1];

    for (int i = 0, j = 0; i < names.length; i += 5, j++) {
      answer[j] = names[i];
    }

    return answer;
  }

  public static void main(String[] args) {

    String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};

    System.out.println(solution(names));

  }

}
