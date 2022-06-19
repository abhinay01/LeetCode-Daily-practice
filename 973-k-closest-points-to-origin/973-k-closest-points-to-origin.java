class Solution {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> distHeap = new PriorityQueue<>((a, b) ->
                (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]));

        // Add first k points to heap
        // O(K * logK) time
        for (int i = 0 ; i < k; i++) {
            distHeap.add(points[i]);
        }
        // int[] ans=distHeap.peek();
        // for(int i = 0; i < ans.length; i++) 
        // System.out.println(ans[i]);
        // compare remaining elements
        // O((N-K) * logK) time
        for(int i = k; i < points.length; i++) {
            int[] currentPoint = points[i];
            int currentDist = currentPoint[0] * currentPoint[0] + currentPoint[1] * currentPoint[1];
            int[] peekElement = distHeap.peek();
            int heapPointDist = peekElement[0] * peekElement[0] + peekElement[1] * peekElement[1];
            if (currentDist < heapPointDist) {
                distHeap.poll();
                distHeap.add(currentPoint);
            }
        }

        // Next we create an array to contain points up to K
        int[][] results = new int[k][2];

        // Then iterate and add elements from our minHeap up to K
        for (int i = 0; i < k; i++) {
            results[i] = distHeap.poll();
        }
        return results;
        
    }
}