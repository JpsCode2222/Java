// Base on Divide and Conquer
public class MergeSort {
    // Conquer
    public static void conquer(int[] arr,int si,int mid,int ei){
        int[] merge = new int[ei-si+1];
        int ind1 = si;
        int ind2 = mid+1;
        int x = 0;

        while(ind1 <= mid && ind2 <= ei){
            if(arr[ind1] <= arr[ind2]){
                merge[x++]= arr[ind1++];
            }
            else{
                merge[x++] = arr[ind2++];
            }
        }

        while(ind1 <= mid){
            merge[x++] = arr[ind1++];
        }
        
        while(ind2 <= ei){
            merge[x++] = arr[ind2++];
        }

        for(int i=0 , j=si;i<merge.length;i++,j++){
            arr[j] = merge[i];
        }
    }

    // Divide
    public static void divide(int[] arr,int si,int ei){
        if(si >= ei){
            return;
        }
        // Find mid
        int mid = si + (ei - si) / 2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }
    
    // Main
    public static void main(String[] args){
        int[] arr = {6,3,9,5,2,8};
        int n=arr.length;
        // divide fun call
        divide(arr, 0, n-1);
        for(int i=0; i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
