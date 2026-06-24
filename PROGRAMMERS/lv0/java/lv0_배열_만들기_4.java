import java.util.*;

public class lv0_배열_만들기_4 {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp(new int[]{1, 4, 2, 5, 3})
        };

        for(Inp inp : inps) {
            System.out.println(Arrays.toString(solution(inp.arr)));
        }
    }

    public static int[] solution(int[] arr) {
        Deque<Integer> stk = new LinkedList<>();

        for (int i = 0, k = arr.length; i < k; ) {
            if ( stk.isEmpty() || stk.getLast() < arr[i] ) {
                stk.add(arr[i]);
                i++;
            } else if ( stk.getLast() >= arr[i] ) {
                stk.removeLast();
            }
        }

        return stk.stream().mapToInt(Integer::intValue).toArray();
    }

    public static class Inp {
        int[] arr;

        Inp(int[] arr) {
            this.arr = arr;
        }
    }
}
