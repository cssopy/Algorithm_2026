import java.util.Scanner;

public class lv0_문자열_돌리기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for (char c : str.toCharArray()) {
            System.out.println(c);
        }
    }
}
