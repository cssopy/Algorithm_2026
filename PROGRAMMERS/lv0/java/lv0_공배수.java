public class lv0_°ø¹è¼ö {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp(60, 2,3),
                new Inp(55, 10, 5)
        };

        for (Inp inp : inps) {
            System.out.println(solution(inp.number, inp.n, inp.m));
        }
    }

    public static int solution(int number, int n, int m) {
        int answer = 0;

        if ( number % n == 0 && number % m == 0 ) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }

    static class Inp {
        int number;
        int n;
        int m;

        Inp(int number, int n, int m) {
            this.number = number;
            this.n = n;
            this.m = m;
        }
    }
}
