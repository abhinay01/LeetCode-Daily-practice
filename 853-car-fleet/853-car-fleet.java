class Solution {
    
    void merge(int arr[], int l, int m, int r,int arr1[])
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
  
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        int l1[] = new int[n1];
        int r1[] = new int[n2];
  
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i){
            l1[i]=arr1[l + i];
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j){
            R[j] = arr[m + 1 + j];
            r1[j]=arr1[m + 1 + j];
        }
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
  
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr1[k]=l1[i];
                arr[k] = L[i];
                i++;
            }
            else {
                arr1[k]=r1[j];
                arr[k] = R[j];
                j++;
            }
            k++;
        }
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr1[k]=l1[i];
            arr[k] = L[i];
            i++;
            k++;
        }
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr1[k]=r1[j];
            arr[k] = R[j];
            j++;
            k++;
        }
    }
  
    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r,int arr1[])
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;
  
            // Sort first and second halves
            sort(arr, l, m,arr1);
            sort(arr, m + 1, r,arr1);
  
            // Merge the sorted halves
            merge(arr, l, m, r,arr1);
        }
    }
    static void printArray(Double arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    public int carFleet(int target, int[] position, int[] speed) {
        Solution ob = new Solution();
        ob.sort(position, 0, position.length - 1,speed);
        // printArray(position);
        // printArray(speed);
        Double [] leftDistance=new Double[position.length];
        for(int i=0;i<position.length;i++)
        {
            int res=target-position[i];
            Double div=Double.valueOf(speed[i]);
            leftDistance[i]=res/div;
        }
        // Arrays.sort(leftDistance);
        printArray(leftDistance);
        int count=1;
        Double max=leftDistance[position.length-1];
        for(int i=position.length-1;i>=0;i--)
        {
            if(leftDistance[i]>max){
                max=leftDistance[i];
                count++;
            }
        }
        return count;
    }
}