import java.util.*;
public class TwoDArray{
    public static void main(String[] args){
        // Scanner obj
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Rows : ");
        int r = sc.nextInt();
        System.out.println("Enter Coloums : ");
        int c = sc.nextInt();

        // Two D Array
        int[][] TwoDArr = new int[r][c];

        // Input
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                TwoDArr[i][j] = sc.nextInt();
            }
        }

        // Output
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(TwoDArr[i][j]+"\t");
            }
            System.out.println("\n");
        }

        System.out.println("Enter num to find location : ");
        int num = sc.nextInt();
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(TwoDArr[i][j] == num){
                    System.out.println("location is ("+i+","+j+")");
                }
            }
        }

    }
}