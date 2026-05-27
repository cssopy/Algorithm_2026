import java.util.Arrays;
import java.util.Collections;

public class lv0_문자_리스트를_문자열로_변환하기 {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp(new String[]{"a", "b", "c"})
        };

        for (Inp inp : inps) {
            System.out.println(solution(inp.arr));
        }
    }

    public static String solution(String[] arr) {
        String answer = "";

        answer = String.join("", arr);

        return answer;
    }

    static class Inp {
        String[] arr;

        Inp(String[] arr) {
            this.arr = arr;
        }
    }
}
