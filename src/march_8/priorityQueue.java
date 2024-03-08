package march_8;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pq size: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }



        System.out.println(pq);
    }
}
