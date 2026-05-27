public class lv0_¹®ÀÚ¿­_¼¯±â {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp("aaaaa", "bbbbb")
        };

        for (Inp inp : inps) {
            System.out.println(solution(inp.str1, inp.str2));
        }
    }

    public static String solution(String str1, String str2) {
        String answer = "";

        for (int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }

        return answer;
    }

    static class Inp {
        String str1;
        String str2;

        Inp(String str1, String str2) {
            this.str1 = str1;
            this.str2 = str2;
        }
    }
}
