public class lv0_더_크게_합치기 {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp(9, 91),
                new Inp(89, 8)
        };

        for (Inp inp : inps) {
            System.out.println(solution(inp.a, inp.b));
        }
    }

    public static int solution(int a, int b) {
        int answer = 0;

        answer = Math.max(Integer.valueOf("" + a + b), Integer.valueOf("" + b + a));

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
