public class lv0_등차수열의_특정한_항만_더하기 {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp(3, 4, new boolean[]{true, false, false, true, true}),
                new Inp(7, 1, new boolean[]{false, false, false, true, false, false, false})
        };

        for (Inp inp : inps) {
            System.out.println(solution(inp.a, inp.d, inp.included));
        }
    }

    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;

        for (int i = 0, k = a; i < included.length; i++, k += d) {
            if ( included[i] ) {
                answer += k;
            }
        }

        return answer;
    }

    static class Inp {
        int a;
        int d;
        boolean[] included;

        Inp(int a, int d, boolean[] included) {
            this.a = a;
            this.d = d;
            this.included = included;
        }
    }
}
