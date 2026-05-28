import java.util.Arrays;

public class lv0_마지막_두_원소 {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp(new int[]{2, 1, 6}),
                new Inp(new int[]{5, 2, 1, 7, 5})
        };

        for (Inp inp : inps) {
            System.out.println(Arrays.toString(solution(inp.num_list)));
        }
    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];

        int p = num_list[num_list.length - 2];
        int l = num_list[num_list.length - 1];

        for (int i = 0; i <num_list.length; i++) {
            answer[i] = num_list[i];
        }

        if ( l > p ) {
            answer[num_list.length] = l - p;
        } else {
            answer[num_list.length] = l * 2;
        }

        return answer;
    }

    static class Inp {
        int[] num_list;

        Inp(int[] num_list) {
            this.num_list = num_list;
        }
    }
}
