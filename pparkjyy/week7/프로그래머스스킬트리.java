class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String cur : skill_trees) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < cur.length(); i++) {
                if(skill.contains(cur.charAt(i)+ "")){ // 일치하는 경우
                    sb.append(cur.charAt(i));          // 일치하는 문자만 따로 뺌
                }
            }
            answer += skill.indexOf(sb.toString()) == 0 ? 1 : 0;  // 일치하는 스킬 string 비교
        }
        return answer;
    }
}