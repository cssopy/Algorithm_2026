public class lv0_홀짝에_따라_다른_값_반환하기 {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp(7),
                new Inp(10)
        };

        for (Inp inp : inps) {
            System.out.println(solution(inp.n));
        }
    }

    public static int solution(int n) {
        int answer = 0;

        if ( n % 2 == 1 ) {
            answer = (int) Math.pow((n + 1) / 2, 2);
        } else {
            answer = n * (n + 1) * (n + 2) / 6;
        }

        return answer;
    }

    static class Inp {
        int n;

        Inp(int n) {
            this.n = n;
        }
    }
}
