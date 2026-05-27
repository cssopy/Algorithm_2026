public class lv0_flag에_따라_다른_값_반환하기 {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp(-4, 7, true),
                new Inp(-4, 7, false)
        };

        for (Inp inp : inps) {
            System.out.println(solution(inp.a, inp.b, inp.flag));
        }
    }

    public static int solution(int a, int b, boolean flag) {
        int answer = 0;

        if ( flag ) {
            answer = a + b;
        } else {
            answer = a - b;
        }

        return answer;
    }

    static class Inp {
        int a;
        int b;
        boolean flag;

        Inp(int a, int b, boolean flag) {
            this.a = a;
            this.b = b;
            this.flag = flag;
        }
    }
}
