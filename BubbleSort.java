public class BubbleSort {
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {10,8,6,4,2,1};
        // Bubble Sort n-1
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    // Swap
                    int tmp = arr[i];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        printArray(arr);
    }
}
