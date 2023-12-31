package StackAndQueues_Exercise_01;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int S = scanner.nextInt();
        int X = scanner.nextInt();

        ArrayDeque<Integer> queue = new ArrayDeque<>();


        for (int i = 1; i <= N; i++) {
            queue.offer(scanner.nextInt());
        }

        for (int i = 1; i <= S; i++) {
            queue.poll();
        }

        if (queue.contains(X)) {
            System.out.println("true");
        } else {
            if (queue.isEmpty()) {
                System.out.println(0);
            } else {
                System.out.println(Collections.min(queue));
            }
        }
    }
}
