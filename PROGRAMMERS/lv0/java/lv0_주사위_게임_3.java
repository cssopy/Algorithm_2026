import java.util.HashMap;
import java.util.Map;

public class lv0_주사위_게임_3 {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp(2, 2, 2, 2),
                new Inp(4, 1, 4, 4),
                new Inp(6, 3, 3, 6),
                new Inp(2, 5, 2, 6),
                new Inp(6, 4, 2, 5)
        };

        for (Inp inp : inps) {
            System.out.println(solution(inp.a, inp.b, inp.c, inp.d));
        }
    }

    public static int solution(int a, int b, int c, int d) {
        int[] abcd = new int[]{a, b, c, d};

        int min = 7;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for ( int i : abcd ) {
            map.computeIfAbsent(i, k -> 0);
            map.computeIfPresent(i, (k, v) -> v + 1);

            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        int answer = 1;

        if ( map.size() == 1 ) {
            answer = 1111 * abcd[0];
        } else if ( map.size() == 2 ) {
            int p2 = 0, q2 = 0, p3 = 0, q3 = 0;
            for ( Map.Entry<Integer, Integer> entry : map.entrySet() ) {
                if ( entry.getValue() == 1 ) {
                    q3 = entry.getKey();
                } else if ( entry.getValue() == 3 ) {
                    p3 = entry.getKey();
                } else {
                    p2 = p2 == 0 ? entry.getKey() : p2;
                    q2 = p2 != 0 ? entry.getKey() : q2;
                }
            }
            answer = p2 != 0 ? (p2 + q2) * Math.abs(p2 - q2) : (int)Math.pow(10 * p3 + q3, 2);
        } else if ( map.size() == 3 ) {
            for ( Map.Entry<Integer, Integer> entry : map.entrySet() ) {
                if ( entry.getValue() == 1 ) {
                    answer *= entry.getKey();
                }
            }
        } else {
            answer = min;
        }

        return answer;
    }

    public static class Inp {
        int a;
        int b;
        int c;
        int d;

        Inp(int a, int b, int c, int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
}
