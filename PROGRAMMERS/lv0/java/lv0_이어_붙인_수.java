public class lv0_이어_붙인_수 {
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
        int answer = 0;

        int h = 0;
        int j = 0;
        for (int n : num_list) {
            if ( n % 2 != 0 ) {
                h *= 10;
                h += n;
            } else {
                j *= 10;
                j += n;
            }
        }

        answer = h + j;

        return answer;
    }

    static class Inp {
        int[] num_list;

        Inp(int[] num_list) {
            this.num_list = num_list;
        }
    }
}
