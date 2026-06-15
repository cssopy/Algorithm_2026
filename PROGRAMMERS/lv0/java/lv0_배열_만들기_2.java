import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lv0_배열_만들기_2 {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp(5, 555),
                new Inp(10, 20)
        };

        for (Inp inp : inps) {
            System.out.println(Arrays.toString(solution(inp.l, inp.r)));
        }
    }

    public static int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if ( Integer.toString(i).matches("^[05]+$") ) {
                answer.add(i);
            }
        }

        if ( answer.isEmpty() ) {
            return new int[]{-1};
        } else {
            return answer.stream().mapToInt(Integer::intValue).toArray();
        }
    }

    public static class Inp {
        int l;
        int r;

        Inp(int l, int r) {
            this.l = l;
            this.r = r;
        }
    }
}
