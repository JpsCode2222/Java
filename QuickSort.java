public class QuickSort {
    // Partition
    public static int partition(int[] arr,int low,int high){
     // Pivot  
     int pivot = arr[high];
     int i=low-1;

     for(int j=low;j<high;j++){
        if(arr[j] < pivot){
            i++;
            // swap
            int tmp = arr[j];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
     }

    //  Swap Pivot
    i++;
    int tmp = arr[i];
    arr[i]=arr[high];
    arr[high]=tmp;
    return i;
    }

    //  Base on Pivot & Partition
    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pidx = partition(arr,low,high);
            quickSort(arr, low, pidx-1);
            quickSort(arr, pidx+1, high);
        }
    }
    public static void main(String[] args){
        int[] arr = {10,8,6,4,2,1};
        int n = arr.length;
        quickSort(arr,0,n-1);
        // Print Sorted Array
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
