public class lv0_두_수의_연산값_비교하기 {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp(2, 91),
                new Inp(91, 2)
        };

        for (Inp inp : inps) {
            System.out.println(solution(inp.a, inp.b));
        }
    }

    public static int solution(int a, int b) {
        int answer = 0;

        answer = Math.max(Integer.valueOf("" + a + b), 2 * a * b);

        return answer;
    }

    static class Inp {
        int a;
        int b;

        Inp(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}
