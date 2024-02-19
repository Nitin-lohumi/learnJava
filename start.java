/**
 * start
 */
import java.util.Scanner;
 public class start {

    public static void main(String[] args) {
        try (Scanner s1 = new Scanner(System.in)) {
            System.out.println("enter the frist number");
            
            int row =s1.nextInt();
            // System.out.println("enter the frist number");
            // int col= s1.nextInt();?
            int i;
            int j;
            for (i=1; i<=row; i++){
                for(j=1; j<=i; j++){
                    System.out.print(j +" ");
                }
                System.out.println(" ");
            }

          
        }
    }
}