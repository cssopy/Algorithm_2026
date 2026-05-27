import java.util.Scanner;

public class lv0_대소문자_바꿔서_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String result = "";
        for (Character c : str.toCharArray()) {
            if ( Character.isUpperCase(c) ) {
                result += Character.toLowerCase(c);
            } else {
                result += Character.toUpperCase(c);
            }
        }

        System.out.println(result);
    }
}
