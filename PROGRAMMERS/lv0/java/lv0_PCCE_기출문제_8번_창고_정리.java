public class lv0_PCCE_기출문제_8번_창고_정리 {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp(new String[]{"pencil", "pencil", "pencil", "book"}, new int[]{2, 4, 3, 1}),
                new Inp(new String[]{"doll", "doll", "doll", "doll"}, new int[]{1, 1, 1, 1}),
                new Inp(new String[]{"apple", "steel", "leaf", "apple", "leaf"}, new int[]{5, 3, 5, 3, 7}),
                new Inp(new String[]{"mirror", "net", "mirror", "net", "bottle"}, new int[]{4, 1, 4, 1, 5})
        };

        for (Inp inp : inps) {
            System.out.println(solution(inp.storage, inp.num));
        }
    }

    public static String solution(String[] storage, int[] num) {
        int num_item = 0;
        String[] clean_storage = new String[storage.length];
        int[] clean_num = new int[num.length];

        for(int i=0; i<storage.length; i++){
            int clean_idx = -1;
            for(int j=0; j<num_item; j++){
                if(storage[i].equals(clean_storage[j])){
                    clean_idx = j;
                    break;
                }
            }
            if(clean_idx == -1){
                clean_storage[num_item] = storage[i];
                clean_num[num_item] = num[i];
                num_item += 1;
            }
            else{
                clean_num[clean_idx] += num[i];
            }
        }

        // 아래 코드에는 틀린 부분이 없습니다.

        int num_max = -1;
        String answer = "";
        for(int i=0; i<num_item; i++){
            if(clean_num[i] > num_max){
                num_max = clean_num[i];
                answer = clean_storage[i];
            }
        }
        return answer;
    }

    static class Inp {
        String[] storage;
        int[] num;

        Inp(String[] storage, int[] num) {
            this.storage = storage;
            this.num = num;
        }
    }
}
