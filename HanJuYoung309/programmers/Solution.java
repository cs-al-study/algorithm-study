package programmers;

import java.util.ArrayList;
import java.util.List;


class Solution {
    public int solution(int n, int k) {
        int answer = -1;
            if(n!=0){

                String num2 = Integer.toBinaryString(n);	// 10진수 => 2진수
                //String num8 = Integer.toOctalString(n);	// 10진수 => 8진수
                //String num16 = Integer.toHexString(n);
                num2= String.valueOf(Integer.parseInt(num2));

            List<Integer> list= new ArrayList<>();
            list.add(Integer.valueOf(num2));

            for(int i=0; i<list.size(); i++){

                //양쪽에 있는경우
                if(list.get(0)==list.get(i-1)){
                    answer++;
                }
                //오른쪽에있는경우
                else if(list.get(i-1)==1){
                    answer++;

                }
                //왼쪽에 있는 경우

                //양쪽에없는경우
                else{
                    return answer;
                }
            }


        }



        return answer;
    }
}