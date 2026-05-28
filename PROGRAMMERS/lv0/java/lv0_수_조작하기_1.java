public class lv0_수_조작하기_1 {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp(0, "wsdawsdassw")
        };

        for (Inp inp : inps) {
            System.out.println(solution(inp.n, inp.control));
        }
    }

    public static int solution(int n, String control) {
        int answer = n;

        for (char c : control.toCharArray()) {
            switch (c) {
                case 'w':
                    answer += 1;
                    break;
                case 's':
                    answer -= 1;
                    break;
                case 'd':
                    answer += 10;
                    break;
                case 'a':
                    answer -= 10;
                    break;
            }
        }

        return answer;
    }

    static class Inp {
        int n;
        String control;

        Inp(int n, String control) {
            this.n = n;
            this.control = control;
        }
    }
}
