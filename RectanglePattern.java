import java.util.*;
public class RectanglePattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows : ");
        int r = sc.nextInt();
        System.out.println("Enter Columns : ");
        int c = sc.nextInt();

        for(int i=0; i<=r; i++){
            for(int j=0;j<=c;j++){
                if(i==0 || j==0 || i==r || j==c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
