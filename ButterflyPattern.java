import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args){
        System.out.println("Enter num : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 1st Half
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            // spaces
            int space = 2 * (n - i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            // 2nd Half
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower Part
         for(int i=n; i>=1; i--){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            // spaces
            int space = 2 * (n - i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            // 2nd Half
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
