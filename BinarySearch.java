public class BinarySearch {

public static int binarysearch(int[] arr,int size,int key){
int s = 0;
int e = size - 1;
int mid = s+(e-s)/ 2;
while(s<=e){

    if(arr[mid] == key){
        return mid;
    }
    else{
         if(key < arr[mid]){
            s=mid-1;
        }
        else{
            s=mid+1;
        }
    }
    mid = s+(e-s)/2;
}
  return -1;
}
public static void main(String[] args){
    int[] even = {10,20,30,40,50,60};

    System.out.println(binarysearch(even, 6, 60));
}    
}
