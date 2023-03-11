import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BJ_14225 {

    static  int n;
    static int arr[];
    static Set<Integer> set= new HashSet<>(); //방문저장
    static  int answer=1;

    static  int min=Integer.MIN_VALUE;
        public static void main(String[] args) {

            Scanner scanner= new Scanner(System.in);

            n=scanner.nextInt();

            arr= new int[n];
            for(int i=0; i<n; i++){

                arr[i]=scanner.nextInt();

            }
            dfs(0,0);
            while (true){
                if(set.contains(answer)){
                    answer++;
                }else {
                    break;
                }
            }

        }

        public static  void dfs(int idx, int sum){

            if(idx==n){
                if(sum>0){
                   set.add(sum);
                }
            }else {
                dfs(idx+1,sum+arr[idx]);
                dfs(idx+1,sum);
            }

        }


    }

