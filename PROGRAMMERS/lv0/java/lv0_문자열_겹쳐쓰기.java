public class lv0_문자열_겹쳐쓰기 {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp("He11oWor1d", "lloWorl", 2),
                new Inp("Program29b8UYP", "merS123", 7)
        };

        for (Inp inp : inps) {
            System.out.println(solution(inp.my_string, inp.overwirte_string, inp.s));
        }
    }

    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());

        return answer;
    }

    static class Inp {
        String my_string;
        String overwirte_string;
        int s;

        Inp(String my_string, String overwirte_string, int s) {
            this.my_string = my_string;
            this.overwirte_string = overwirte_string;
            this.s = s;
        }
    }
}
