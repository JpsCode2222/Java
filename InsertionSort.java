public class InsertionSort {
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        int[] arr = {10,20,3,4,7,5,6};

        // Insertion Sort 
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j=i-1;
            while(j >= 0 && current < arr[j]){
                // arr[j+1] = j;
            }
        }
    }
}
