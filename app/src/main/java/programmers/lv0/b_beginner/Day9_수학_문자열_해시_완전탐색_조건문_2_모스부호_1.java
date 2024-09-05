package programmers.lv0.b_beginner;

public class Day9_수학_문자열_해시_완전탐색_조건문_2_모스부호_1 {

  public static String solution(String letter) {
    String answer = "";

    String[] arr = letter.split(" ");
    for (int i = 0; i < arr.length; i++) {
      switch (arr[i]) {
        case ".-": 
          answer += "a";
          break;
        case "-...":
          answer += "b";
          break;
        case "-.-.": 
          answer += "c";
          break;
        case "-..": 
          answer += "d";
          break;
        case ".": 
          answer += "e";
          break;
        case "..-.": 
          answer += "f";
          break;
        case "--.": 
          answer += "g";
          break;
        case "....": 
          answer += "h";
          break;
        case "..": 
          answer += "i";
          break;
        case ".---": 
          answer += "j";
          break;
        case "-.-": 
          answer += "k";
          break;
        case ".-..": 
          answer += "l";
          break;
        case "--": 
          answer += "m";
          break;
        case "-.": 
          answer += "n";
          break;
        case "---": 
          answer += "o";
          break;
        case ".--.": 
          answer += "p";
          break;
        case "--.-": 
          answer += "q";
          break;
        case ".-.": 
          answer += "r";
          break;
        case "...": 
          answer += "s";
          break;
        case "-": 
          answer += "t";
          break;
        case "..-": 
          answer += "u";
          break;
        case "...-": 
          answer += "v";
          break;
        case ".--": 
          answer += "w";
          break;
        case "-..-": 
          answer += "x";
          break;
        case "-.--": 
          answer += "y";
          break;
        case "--..": 
          answer += "z";
          break;
      }
    }

    return answer;

    /*
     * String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
     * String[] word = letter.split(" ");
     * 
     * for(int i=0;i<word.length;i++){
     *  for(int j=0;j<morse.length;j++){
     *      if(word[i].equals(morse[j])) answer+=(char)(j+97);
     *  }
     * }
     * */
  }

  public static void main(String[] args) {

    String letter = ".... . .-.. .-.. ---";

    System.out.println(solution(letter));

  }

}
