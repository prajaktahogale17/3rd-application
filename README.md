# 3rd-application
The FileMergeOptimal program demonstrates the Optimal Merge Pattern problem using a Greedy Algorithm approach.

When multiple sorted files need to be merged into a single sorted file, the goal is to minimize the total computation (or cost) required for merging. The cost of merging two files is equal to the sum of their sizes, and the process continues until only one file remains.

To achieve the optimal (minimum) merge cost, the program always merges the two smallest files first, because merging larger files earlier would lead to higher subsequent costs. This approach ensures that the total cost remains minimal.

The implementation uses a PriorityQueue (Min-Heap) to efficiently retrieve the smallest file sizes at each step.
