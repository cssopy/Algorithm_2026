import java.util.Arrays;

public class lv0_PCCE_기출문제_6번_가채점 {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp(new int[]{1}, new int[]{100}, new int[]{100, 80, 90, 84, 20}),
                new Inp(new int[]{3, 4}, new int[]{85, 93}, new int[]{85, 92, 38, 93, 48, 85, 92, 56})
        };

        for (Inp inp : inps) {
            System.out.println(Arrays.toString(solution(inp.numbers, inp.our_score, inp.score_list)));
        }
    }

    public static String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i]-1]) {
                answer[i] = "Same";
            }
            else {
                answer[i] = "Different";
            }
        }

        return answer;
    }

    static class Inp {
        int[] numbers;
        int[] our_score;
        int[] score_list;

        Inp(int[] numbers, int[] our_score, int[] score_list) {
            this.numbers = numbers;
            this.our_score = our_score;
            this.score_list = score_list;
        }
    }
}
