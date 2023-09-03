import java.util.Scanner;

public class HalfPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<n;i++){
            // for loop -> print Spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // for loop -> print *
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
