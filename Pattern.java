import java.util.*;
public class Pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows : ");
        int r = sc.nextInt();
        System.out.println("Enter Columns : ");
        int c = sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}