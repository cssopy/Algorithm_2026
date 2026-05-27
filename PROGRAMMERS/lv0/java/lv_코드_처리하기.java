public class lv_코드_처리하기 {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp("abc1abc1abc")
        };

        for (Inp inp : inps) {
            System.out.println(solution(inp.code));
        }
    }

    public static String solution(String code) {
        String answer = "";
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            if ( '1' == code.charAt(i) ) {
                mode = (mode + 1) % 2;
                continue;
            }

            if ( mode == 0 && i % 2 == 0 ) {
                answer += code.charAt(i);
            } else if ( mode == 1 && i % 2 != 0 ) {
                answer += code.charAt(i);
            }
        }

        if ( answer.length() == 0 ) {
            answer = "EMPTY";
        }

        return answer;
    }

    static class Inp {
        String code;

        Inp(String code) {
            this.code = code;
        }
    }
}
