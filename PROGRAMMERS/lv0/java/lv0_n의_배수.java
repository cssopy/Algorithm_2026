public class lv0_nÀÇ_¹è¼ö {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp(98, 2),
                new Inp(34, 3)
        };

        for (Inp inp : inps) {
            System.out.println(solution(inp.num, inp.n));
        }
    }

    public static int solution(int num, int n) {
        int answer = 0;

        if ( num % n == 0 ) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }

    static class Inp {
        int num;
        int n;

        Inp(int num, int n) {
            this.num = num;
            this.n = n;
        }
    }
}
