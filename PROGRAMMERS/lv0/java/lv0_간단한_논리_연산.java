public class lv0_간단한_논리_연산 {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp(false, true, true, true),
                new Inp(true, false, false, false)
        };

        for(Inp inp : inps) {
            System.out.println(solution(inp.x1, inp.x2, inp.x3, inp.x4));
        }
    }

    public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3 || x4);
    }

    public static class Inp {
        boolean x1;
        boolean x2;
        boolean x3;
        boolean x4;

        Inp(boolean x1, boolean x2, boolean x3, boolean x4) {
            this.x1 = x1;
            this.x2 = x2;
            this.x3 = x3;
            this.x4 = x4;
        }
    }
}
