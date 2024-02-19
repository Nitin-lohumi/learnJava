import java.util.*;
class start{  
    public static void main(String args[]){  
        int fact=1;  
        @SuppressWarnings("resource")
        Scanner s1 = new Scanner(System.in);
        int number = s1.nextInt();//It is the number to calculate factorial    
        fact = factorial(number);   
        System.out.println("Factorial of "+number+" is: "+ fact);    
    }  
    static int factorial(int n){    
     if (n == 0)    
       return 1;    
     else    
       return(n * factorial(n-1));    
    }    
   }  