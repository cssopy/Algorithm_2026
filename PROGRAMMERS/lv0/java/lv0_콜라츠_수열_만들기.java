import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lv0_콜라츠_수열_만들기 {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp(10)
        };

        for(Inp inp : inps) {
            System.out.println(Arrays.toString(solution(inp.n)));
        }
    }

    public static int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();

        while (n != 1) {
            answer.add(n);
            if ( n % 2 == 0 ) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
        }

        answer.add(n);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static class Inp {
        int n;

        Inp(int n) {
            this.n = n;
        }
    }
}
