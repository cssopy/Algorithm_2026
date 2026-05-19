public class lv0_PCCE_기출문제_7번_버스 {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp(5, new String[][]{{"On", "On", "On"}, {"Off", "On", "-"}, {"Off", "-", "-"}}),
                new Inp(10, new String[][]{{"On", "On", "On", "On", "On", "On", "On", "On", "-", "-"}, {"On", "On", "Off", "Off", "Off", "On", "On", "-", "-", "-"}, {"On", "On", "On", "Off", "On", "On", "On", "Off", "Off", "Off"}, {"On", "On", "Off", "-", "-", "-", "-", "-", "-", "-"}})
        };

        for(Inp inp : inps) {
            System.out.println(solution(inp.seat, inp.passengers));
        }
    }

    public static int solution(int seat, String[][] passengers) {
        int num_passenger = 0;
        for(int i=0; i<passengers.length; i++){
            num_passenger += func4(passengers[i]);
            num_passenger -= func3(passengers[i]);
        }
        int answer = func1(seat - num_passenger);
        return answer;
    }

    public static int func1(int num){
        if(0 > num){
            return 0;
        }
        else{
            return num;
        }
    }
    public static int func2(int num){
        if(num > 0){
            return 0;
        }
        else{
            return num;
        }
    }

    public static int func3(String[] station){
        int num = 0;
        for(int i=0; i<station.length; i++){
            if(station[i].equals("Off")){
                num += 1;
            }
        }
        return num;
    }

    public static int func4(String[] station){
        int num = 0;
        for(int i=0; i<station.length; i++){
            if(station[i].equals("On")){
                num += 1;
            }
        }
        return num;
    }

    static class Inp {
        int seat;
        String[][] passengers;

        Inp(int seat, String[][] passengers) {
            this.seat = seat;
            this.passengers = passengers;
        }
    }
}
