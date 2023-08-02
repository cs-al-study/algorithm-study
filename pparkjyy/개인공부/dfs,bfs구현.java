import java.util.*;

class Graph{
    class Node{  // 노드 설정
        int data;   // data는 int
        LinkedList<Node> adjacent;  // 노드간 연결을 위한 linkedlist
        boolean marked;           // 방문한 노드인지 체크
        Node (int data){          // 노드 초기화
            this.data = data;
            this.marked = false;
            this.adjacent = new LinkedList<Node>();
        }
    }
    Node[] nodes;
    Graph(int size){   // 그래프 초기화
        nodes = new Node[size];
        for(int i = 0; i < size; i++){
            nodes[i] = new Node(i);
        }
    }
    void addEdge(int i1, int i2){  // 노드간 연결 설정
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];
        if(!n1.adjacent.contains(n2)){
            n1.adjacent.add(n2);
        }
        if(!n2.adjacent.contains(n1)){
            n2.adjacent.add(n1);
        }
    }

    void dfs(){  // dfs 0부터
        dfs(0);
    }
    void dfs(int index){  // index 부터 시작하는 dfs  stack을 이용한 방법
        Node root = nodes[index]; // index 번째 노드를 root로 설정
        Stack<Node> stack = new Stack<>();  // stack 선언
        stack.push(root);          // 시작 노드를 stack에 push
        root.marked = true;        // 시작 노드 방문 설정
        while (!stack.empty()){    // stack이 비여있다면 종료
            Node r = stack.pop();  // stack에 있는 노드 pop
            for(Node n : r.adjacent){  // pop 한 노드의 연결 노드 순회
                if(n.marked == false){  // 연결 노드가 아직 방문 전이라면
                    n.marked = true;    // 방문처리한 후
                    stack.push(n);      // 스택에 추가
                }
            }
            visit(r);      // 노드 출력
        }
    }

    void bfs(){   // bfs 0부터
        bfs(0);
    }
    void bfs(int index){ // index 부터 시작하는 bfs queue를 이용한 방법
        Node root = nodes[index];  // index 번째 노드를 root로 설정
        Queue<Node> queue = new LinkedList<Node>(); // queue 선언
        queue.add(root);        // 시작 노드 queue에 add
        root.marked = true;     // 시작 노드 방문 처리
        while (!queue.isEmpty()){  // queue가 비여있다면 종료
            Node r = queue.poll();  // queue에 있는 노드 poll
            for (Node n : r.adjacent){  // poll 한 노드 연결 노드 순회
                if(n.marked == false){  // 연결 노드가 아직 방문 전이라면
                    n.marked = true;    // 방문처리한 후
                    queue.add(n);       // queue에 추가
                }
            }
            visit(r);        // 노드 출력
        }
    }
    void dfsR(Node r){  // dfs 재귀로 구현
        if(r == null) return;  // 노드가 없으면 종료
        r.marked = true;       // 노드 방문 처리
        visit(r);              // 노드 먼저 출력 후
        for(Node n : r.adjacent){  // 노드의 연결 노드 순회
            if(n.marked == false){  // 연결노드가 방문 전이라면
                dfsR(n);            // 재귀 호출
            }
        }
    }
    void dfsR(int index){
        Node r = nodes[index];
        dfsR(r);
    }
    void dfsR(){
        dfsR(0);
    }
    void visit(Node n){
        System.out.print(n.data + " ");
    }
}

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph(9); // 그래프 생성
        g.addEdge(0,1);  // 관계 추가
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(2,4);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.addEdge(3,5);
        g.addEdge(5,6);
        g.addEdge(5,7);
        g.addEdge(6,8);
        //g.dfs();        // stack으로 구현한 dfs 0부터 출력
        //g.bfs();        // queue로 구현한 bfs 0부터 출력
        //g.dfsR();       // 재귀로 구현한 dfs 0부터 출력
        //g.dfs(3);       // dfs 3번 index 부터
        g.bfs(3);   // bfs 3번 index 부터

    }

}