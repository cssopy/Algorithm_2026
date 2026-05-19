public class lv0_PCCE_기출문제_6번_물_부족 {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp(5141, 500, new int[]{10, -10, 10, -10, 10, -10, 10, -10, 10, -10}),
                new Inp(1000, 2000, new int[]{-10, 25, -33})
        };

        for(Inp inp : inps) {
            System.out.println(solution(inp.storage, inp.usage, inp.change));
        }
    }

    public static int solution(int storage, int usage, int[] change) {
        int total_usage = 0;
        for(int i=0; i<change.length; i++){
            usage = (int)(usage + ((double)usage * change[i] / 100));
            total_usage += usage;
            System.out.print(total_usage + " ");
            if(total_usage > storage){
                return i;
            }
        }
        return -1;
    }

    static class Inp {
        int storage;
        int usage;
        int[] change;

        Inp(int storage, int usage, int[] change) {
            this.storage = storage;
            this.usage = usage;
            this.change = change;
        }
    }
}
