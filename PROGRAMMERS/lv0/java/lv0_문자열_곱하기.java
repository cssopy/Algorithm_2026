public class lv0_문자열_곱하기 {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp("string", 3),
                new Inp("love", 10)
        };

        for (Inp inp : inps) {
            System.out.println(solution(inp.my_string, inp.k));
        }
    }

    public static String solution(String my_string, int k) {
        String answer = "";

        answer = my_string.repeat(k);

        return answer;
    }

    static class Inp {
        String my_string;
        int k;

        Inp(String my_string, int k) {
            this.my_string = my_string;
            this.k = k;
        }
    }
}
