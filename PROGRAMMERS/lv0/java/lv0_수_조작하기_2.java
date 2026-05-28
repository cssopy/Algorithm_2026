public class lv0_수_조작하기_2 {
    public static void main(String[] args) {
        Inp[] inps = {
            new Inp(new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1})
        };

        for (Inp inp : inps) {
            System.out.println(solution(inp.numLog));
        }
    }

    public static String solution(int[] numLog) {
        String answer = "";

        int p = numLog[0];
        for (int i = 1; i < numLog.length; i++) {
            answer += numToControl(numLog[i - 1], numLog[i]);
        }

        return answer;
    }

    public static char numToControl(int p, int l) {
        switch (l - p) {
            case 1:
                return 'w';
            case -1:
                return 's';
            case 10:
                return 'd';
            case -10:
                return 'a';
        }
        return 0;
    }

    static class Inp {
        int[] numLog;

        Inp(int[] numLog) {
            this.numLog = numLog;
        }
    }
}
