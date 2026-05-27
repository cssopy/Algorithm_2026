public class lv0_원소들의_곱과_합 {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp(new int[]{3, 4, 5, 2, 1}),
                new Inp(new int[]{5, 7, 8, 3})
        };

        for (Inp inp : inps) {
            System.out.println(solution(inp.num_list));
        }
    }

    public static int solution(int[] num_list) {
        int a = 1, b = 0;
        for (int n : num_list) {
            a *= n;
            b += n;
        }

        if ( a < Math.pow(b, 2) ) {
            return 1;
        }
        return 0;
    }

    static class Inp {
        int[] num_list;

        Inp(int[] num_list) {
            this.num_list = num_list;
        }
    }
}
