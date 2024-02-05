package deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    static Deque<Integer> deque;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        deque=new LinkedList<>();

        StringTokenizer st;
        sb = new StringBuilder();

        String s;

        for(int i=0; i<n; i++){
            st= new StringTokenizer(br.readLine());
            s=st.nextToken();

            if(s.equals("push_front")) push_front(Integer.parseInt(st.nextToken()));
            if(s.equals("push_back")) push_back(Integer.parseInt(st.nextToken()));
            if(s.equals("pop_front")) pop_front();
            if(s.equals("pop_back")) pop_back();
            if(s.equals("size")) size();
            if(s.equals("empty")) empty();
            if(s.equals("front")) front();
            if(s.equals("back")) back();

        }
        System.out.println(sb);

    }

    //데크의 앞에 입력
    static void push_front(int X){

        deque.addFirst(X);

    }

    //데크 마지막 입력
    static void push_back(int X){

        deque.addLast(X);
    }

    static void pop_front(){

        if(deque.isEmpty())
            sb.append("-1\n");
        else{
           sb.append(deque.removeFirst()).append("\n");
        }

    }

    static void pop_back(){
        if(deque.isEmpty())
            sb.append("-1\n");
        else{
            sb.append(deque.removeLast()).append("\n");
        }
    }

    static void size(){

        sb.append(deque.size()).append("\n");
    }

    static void empty(){

        if(deque.isEmpty()){
            sb.append("-1\n");
        }
        else{
            sb.append("0\n");
        }
    }

    static void front(){

        if(deque.isEmpty())
            sb.append("-1\n");
        else
            sb.append(deque.getFirst()).append("\n");

    }

    static void  back(){

        if(deque.isEmpty())
            sb.append("-1\n");
        else
            sb.append(deque.getLast()).append("\n");
    }
}
