package week8;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueOperations {
    public static int minOperations(int[] queue1, int[] queue2) {
        int sum1 = 0;
        int sum2 = 0;

        for (int num : queue1) {
            sum1 += num;
        }

        for (int num : queue2) {
            sum2 += num;
        }

        if (sum1 != sum2) {
            return -1;
        }

        Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q2 = new ArrayDeque<>();

        for (int num : queue1) {
            q1.offer(num);
        }

        for (int num : queue2) {
            q2.offer(num);
        }

        int operations = 0;

        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (sum1 == sum2) {
                break;
            }

            int diff = sum1 - sum2;

            if (diff > 0) {
                int num = q1.poll();
                sum1 -= num;
                sum2 += num;
                q2.offer(num);
            } else {
                int num = q2.poll();
                sum1 += num;
                sum2 -= num;
                q1.offer(num);
            }

            operations++;
        }

        return operations;
    }

    public static void main(String[] args) {
        int[] queue1 = {3, 2, 7, 2};
        int[] queue2 = {4, 6, 5, 1};
        System.out.println(minOperations(queue1, queue2));
    }
}