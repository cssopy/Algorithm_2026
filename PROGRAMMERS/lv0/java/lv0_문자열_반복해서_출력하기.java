import java.util.Scanner;

public class lv0_문자열_반복해서_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();

        System.out.println(str.repeat(n));
    }
}
