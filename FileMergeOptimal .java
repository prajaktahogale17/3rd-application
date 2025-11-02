import java.util.*;
public class FileMergeOptimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of files: ");
        int n = sc.nextInt();
        int[] files = new int[n];
        System.out.println("Enter sizes of files:");
        for (int i = 0; i < n; i++) {
            files[i] = sc.nextInt();
        }
        int minCost = optimalMergeCost(files);
        System.out.println("\nMinimum total cost of merging files: " + minCost);
        sc.close();
    }
    public static int optimalMergeCost(int[] files) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int size : files) {
            pq.add(size);
        }
        int totalCost = 0;
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            int mergeCost = first + second;
            totalCost += mergeCost;
            pq.add(mergeCost);
            System.out.println("Merged files of size " + first + " and " + second +
                    " → Cost: " + mergeCost);
        }
        return totalCost;
    }
}
