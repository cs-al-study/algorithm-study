class Solution {
    int ans = 0;


    public int solution(int n) {
        if(n == 1){
            return ans+1;
        }
        if(n % 2 == 1){
            ans++;
            return solution(n-1);
        }
        else{
            return solution(n/2);
        }

    }
}