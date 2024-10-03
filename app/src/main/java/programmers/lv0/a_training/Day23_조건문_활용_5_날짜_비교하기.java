package programmers.lv0.a_training;

public class Day23_조건문_활용_5_날짜_비교하기 {

  public static int solution(int[] date1, int[] date2) {
    // 년
    if (date1[0] < date2[0]) {
      return 1;
    } else if (date1[0] > date2[0]) {
      return 0;

    } else {
      // 월
      if (date1[1] < date2[1]) {
        return 1;
      } else if (date1[1] > date2[1]) {
        return 0;

      } else {
        // 일
        if (date1[2] < date2[2]) {
          return 1;
        } else {
          return 0;
        }
      }
    }

    /*
     * LocalDate dateA = LocalDate.of(date1[0], date1[1], date1[2]);
     * LocalDate dateB = LocalDate.of(date2[0], date2[1], date2[2]);
     * 
     * if (dateA.isBefore(dateB)) {
     *  return 1;
     * } else {
     *  return 0;
     * }
     * */

    /*
     * return Arrays.compare(date1, date2) < 0 ? 1 : 0;
     * */

    /*
     * public int solution(int[] date1, int[] date2) {
     *  int date1Days = getTotalDays(date1);
     *  int date2Days = getTotalDays(date2);
     *  return date1Days < date2Days ? 1 : 0;
     * }
     * 
     * public int getTotalDays(int[] date) {
     *  int result = 0;
     *  result += date[0] * 360;
     *  result += date[1] * 30;
     *  result += date[2];
     *  return result;
     * }
     * */

    /*
     * for(int i=0; i < date1.length; i++) {
     *  if(date1[i] < date2[i]) {
     *      answer = 1;
     *      break;
     *  }else if(date1[i] > date2[i]){
     *      answer = 0;
     *      break;
     *  }
     * }
     * */
  }

  public static void main(String[] args) {

    int[] date1 = {2021, 12, 28};
    int[] date2 = {2021, 12, 29};

    System.out.println(solution(date1, date2));

  }

}
