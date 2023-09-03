import java.util.Scanner;

public class RhombusPattern {
    public static void main(String[] args){
        System.out.println("Enter Rows : ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            
            // spaces = row-i
            int space = row-i; 
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=row;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
