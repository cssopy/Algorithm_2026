import java.util.HashSet;
import java.util.Set;

public class lv0_주사위_게임_2 {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp(2, 6, 1),
                new Inp(5, 3, 3),
                new Inp(4, 4, 4)
        };

        for (Inp inp : inps) {
            System.out.println(solution(inp.a, inp.b, inp.c));
        }
    }

    public static int solution(int a, int b, int c) {
        int answer = 0;

        Set<Integer> hm = new HashSet<>();
        hm.add(a);
        hm.add(b);
        hm.add(c);

        if ( hm.size() == 3 ) {
            answer = a + b + c;
        } else if ( hm.size() == 2 ) {
            answer = (a + b + c) * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        } else {
            answer = (a + b + c) * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        }

        return answer;
    }

    static class Inp {
        int a;
        int b;
        int c;

        Inp(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
