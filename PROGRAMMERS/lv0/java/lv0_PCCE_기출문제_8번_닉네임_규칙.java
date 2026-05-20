public class lv0_PCCE_기출문제_8번_닉네임_규칙 {
    public static void main(String[] args) {
        Inp[] inps = {
                new Inp("WORLDworld"),
                new Inp("GO")
        };

        for (Inp inp : inps) {
            System.out.println(solution(inp.nickname));
        }
    }

    public static String solution(String nickname) {
        String answer = "";
        for(int i=0; i<nickname.length(); i++){
            if(nickname.charAt(i) == 'l'){
                answer += "I";
            }
            else if(nickname.charAt(i) == 'w'){
                answer += "vv";
            }
            else if(nickname.charAt(i) == 'W'){
                answer += "VV";
            }
            else if(nickname.charAt(i) == 'O'){
                answer += "0";
            }
            else{
                answer += nickname.charAt(i);
            }
        }
        if(answer.length() < 3){
            answer += "o".repeat(4 - answer.length());
        }
        if(answer.length() > 8){
            answer = answer.substring(0, 8);
        }
        return answer;
    }

    static class Inp {
        String nickname;

        Inp(String nickname) {
            this.nickname = nickname;
        }
    }
}
