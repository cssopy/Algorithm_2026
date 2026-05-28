import java.util.Arrays;

public class lv0_수열과_구간_쿼리_4 {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 2}, {0, 3, 2}, {0, 2, 2}})
        };

        for (Inp inp : inps) {
            System.out.println(Arrays.toString(solution(inp.arr, inp.queries)));
        }
    }

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0 ; i < queries.length; i++) {
            int[] query = queries[i];

            int m = -1;
            for (int j = query[0]; j <= query[1]; j++) {
                if ( arr[j] > query[2] ) {
                    m = (m == -1) ? arr[j] : Math.min(m, arr[j]);
                }
            }

            answer[i] = m;
        }

        return answer;
    }

    static class Inp {
        int[] arr;
        int[][] queries;

        Inp(int[] arr, int[][] queries) {
            this.arr = arr;
            this.queries = queries;
        }
    }
}
