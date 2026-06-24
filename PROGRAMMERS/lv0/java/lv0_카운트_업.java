import java.util.Arrays;

public class lv0_카운트_업 {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp(3, 10)
        };

        for(Inp inp : inps) {
            System.out.println(Arrays.toString(solution(inp.start_num, inp.end_num)));
        }
    }

    public static int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num-start_num+1];

        for (int i = 0, k = start_num; k <= end_num; i++, k++) {
            answer[i] = k;
        }

        return answer;
    }

    public static class Inp {
        int start_num;
        int end_num;

        Inp(int start_num, int end_num) {
            this.start_num = start_num;
            this.end_num = end_num;
        }
    }
}