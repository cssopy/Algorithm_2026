import java.util.Arrays;

public class lv0_수열과_구간_쿼리_3 {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 3}, {1, 2}, {1, 4}})
        };

        for (Inp inp : inps) {
            System.out.println(Arrays.toString(solution(inp.arr, inp.queries)));
        }
    }

    public static int[] solution(int[] arr, int[][] queries) {
        for (int i = 0 ; i < queries.length; i++) {
            int[] query = queries[i];

            int temp = arr[query[0]];
            arr[query[0]] = arr[query[1]];
            arr[query[1]] = temp;
        }

        return arr;
    }

    public static class Inp {
        int[] arr;
        int[][] queries;

        Inp(int[] arr, int[][] queries) {
            this.arr = arr;
            this.queries = queries;
        }
    }
}
