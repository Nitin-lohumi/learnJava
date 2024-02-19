package javaQus;
import java.util.*;
public class addDigit {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,sum;
        System.out.println("Enter frist number");
        num1= sc.nextInt();
        int num2;
        System.out.println("Enter second  number");
        num2= sc.nextInt();
        // number = number/10;
        num1= num1%10;
        num2= num2 %10;
        sum =  num1 + num2;
        System.out.println("the sum of last digit number  is "+ sum);
    }
}
