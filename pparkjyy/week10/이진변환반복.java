class Solution {

    int n1 = 0;
    int n2 = 0;

    String checkNum(String input){
        String res = "";
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '1'){
                res += "1";
            }
            else{
                n2++;
            }
        }
        return res;
    }

    public int[] solution(String s) {
        String str = s;
        while(true){
            str = checkNum(str);
            n1++;
            if(str.compareTo("1")==0)
                break;
            else{
                int num = str.length();
                str = Integer.toBinaryString(num);
            }

        }
        int[] answer = {n1,n2};
        return answer;
    }

}