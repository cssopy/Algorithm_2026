import java.util.Arrays;

public class lv0_PCCE_기출문제_5번_심폐소생술 {
    public static void main(String[] args) {
        String[][] input = {
                {"call", "respiration", "repeat", "check", "pressure"},
                {"respiration", "repeat", "check", "pressure", "call"}
        };

        for (int i = 0; i < input[0].length; i++) {
            int[] result = solution(input[i]);

            System.out.print("[");
            for (int j=0; j<result.length; j++) {
                if (j == result.length-1) {
                    System.out.print(result[j]);
                } else {
                    System.out.print(result[j] + ",");
                }
            }
            System.out.println("]");
        }
    }

    public static int[] solution(String[] cpr) {
        int[] answer = {0, 0, 0, 0, 0};
        String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"};

        for ( int i = 0; i < cpr.length; i++ ) {
            for ( int j = 0; j < basic_order.length; j++ ) {
                if ( cpr[i].equals(basic_order[j]) ) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }
        return answer;
    }
}
