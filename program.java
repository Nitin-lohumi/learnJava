import java.util.Scanner;
class program{
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner n =new Scanner(System.in);
        float num1= n.nextFloat();
        float num2= n.nextFloat();
        float res= num1*num2;
        System.out.println("multiply of two float num is "+res);
       }
}