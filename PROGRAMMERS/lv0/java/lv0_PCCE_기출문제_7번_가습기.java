public class lv0_PCCE_기출문제_7번_가습기 {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp("auto", 23, 45),
                new Inp("target", 41, 40),
                new Inp("minimum", 10, 34)
        };

        for (Inp inp : inps) {
            System.out.println(solution(inp.mode_type, inp.humidity, inp.val_set));
        }
    }

    public static int func1(int humidity, int val_set){
        if(humidity < val_set)
            return 3;
        return 1;
    }

    public static int func2(int humidity){
        if(humidity >= 50)
            return 0;
        else if (humidity >= 40)
            return 1;
        else if (humidity >= 30)
            return 2;
        else if (humidity >= 20)
            return 3;
        else if (humidity >= 10)
            return 4;
        else
            return 5;
    }

    public static int func3(int humidity, int val_set){
        if(humidity < val_set)
            return 1;
        return 0;
    }

    public static int solution(String mode_type, int humidity, int val_set) {
        int answer = 0;

        if(mode_type.equals("auto")){
            answer = func2(humidity);
        }
        else if(mode_type.equals("target")){
            answer = func1(humidity, val_set);
        }
        else if(mode_type.equals("minimum")){
            answer = func3(humidity, val_set);
        }

        return answer;
    }

    static class Inp {
        String mode_type;
        int humidity;
        int val_set;

        Inp(String mode_type, int humidity, int val_set) {
            this.mode_type = mode_type;
            this.humidity = humidity;
            this.val_set = val_set;
        }
    }
}
