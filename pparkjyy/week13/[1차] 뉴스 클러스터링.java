import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        ArrayList<String> klist = new ArrayList<>();
        ArrayList<String> hlist = new ArrayList<>();
        for(int i = 0; i < str1.length()-1; i++){
            char a = str1.charAt(i);
            char b = str1.charAt(i+1);

            if(Character.isLetter(a)&&Character.isLetter(b)){
                String str = Character.toString(a)+Character.toString(b);
                list1.add(str);
            }
        }

        for(int i = 0; i < str2.length()-1; i++){
            char a = str2.charAt(i);
            char b = str2.charAt(i+1);

            if(Character.isLetter(a)&&Character.isLetter(b)){
                String str = Character.toString(a)+Character.toString(b);
                list2.add(str);
            }
        }

        Collections.sort(list1);
        Collections.sort(list2);

        for(String s: list1){
            if(list2.remove(s)){
                hlist.add(s);
            }
            klist.add(s);
        }
        double answer = 0;
        for(String s:list2){
            klist.add(s);
        }
        if(klist.size() == 0)
            answer = 1;
        else
            answer = (double) hlist.size() / (double) klist.size();

        return (int) (answer * 65536);
    }
}