package programmers.beginner;

import java.util.Scanner;

public class Day5_수학_배열_1_옷가게_할인_받기 {

  public static int solution(int price) {
    int answer = 0;

    if (100000 <= price && price < 300000) {
      return price *= 0.95;

    } else if (300000 <= price && price < 500000) {
      return price *= 0.9;

    } else if (500000 <= price) {
      return price *= 0.8;

    } else {
      return price;
    }

    //    return answer;

    /*
     * if(price>=500000) return (int)(price*0.8);
     * if(price>=300000) return (int)(price*0.9);
     * if(price>=100000) return (int)(price*0.95);
     * 
     * return price;
     * */
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int price = sc.nextInt();

    System.out.println(solution(price));


  }

}
