package programmers.lv0.b_beginner;

public class Day08_배열_구현_수학_2_외계행성의_나이 {

  public static String solution(int age) {
    String answer = "";

    for (char c : (age + "").toCharArray()) {
      switch (c) {
        case '0':
          answer += "a";
          break;
        case '1':
          answer += "b";
          break;
        case '2':
          answer += "c";
          break;
        case '3':
          answer += "d";
          break;
        case '4':
          answer += "e";
          break;
        case '5':
          answer += "f";
          break;
        case '6':
          answer += "g";
          break;
        case '7':
          answer += "h";
          break;
        case '8':
          answer += "i";
          break;
        case '9':
          answer += "j";
          break;
      }
    }

    return answer;

    /*
     * String[] alpha = new String[]{"a","b","c","d","e","f","g","h","i","j"};
     * 
     * while(age>0){
     *  answer = alpha[age % 10] + answer;
     *  age /= 10;
     * }
     * */
  }

  public static void main(String[] args) {

    int age = 23;

    System.out.println(solution(age));

  }

}
