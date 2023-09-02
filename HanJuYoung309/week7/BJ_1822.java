package week7;

import java.util.*;

public class BJ_1822 {


    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);


        // 집합 A와 B
        int nA = scanner.nextInt();
        int nB = scanner.nextInt();

        //A의 집합
        Set<Integer> setA = new HashSet<>();
        for (int i = 0; i < nA; i++) {
            setA.add(scanner.nextInt());
        }


        //B의 집합
        Set<Integer> setB = new HashSet<>();
        for (int i = 0; i < nB; i++) {
            setB.add(scanner.nextInt());
        }


        List<Integer> difference = new ArrayList<>();
        for (int element : setA) {
            if (!setB.contains(element)) {
                difference.add(element);
            }
        }


        Collections.sort(difference);

        System.out.println(difference.size());
        for (int element : difference) {
            System.out.print(element + " ");
        }
        System.out.println();

        scanner.close();



    }
}
