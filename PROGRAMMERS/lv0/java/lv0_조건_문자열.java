public class lv0_조건_문자열 {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp("<", "=", 20, 50),
                new Inp(">", "!", 41, 78)
        };

        for (Inp inp : inps) {
            System.out.println(solution(inp.ineq, inp.eq, inp.n, inp.m));
        }
    }

    public static int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        if ( "=".equals(eq) ) {
            if ( "<".equals(ineq) ) {
                answer = n <= m ? 1 : 0;
            } else {
                answer = n >= m ? 1 : 0;
            }
        } else {
            if ( "<".equals(ineq) ) {
                answer = n < m ? 1 : 0;
            } else {
                answer = n > m ? 1 : 0;
            }
        }

        return answer;
    }

    static class Inp {
        String ineq;
        String eq;
        int n;
        int m;

        Inp(String ineq, String eq, int n, int m) {
            this.ineq = ineq;
            this.eq = eq;
            this.n = n;
            this.m = m;
        }
    }
}
