
import java.util.Scanner;
public class SquareOfNumbers{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Number :");
    int num = sc.nextInt();
    for(int i=1; i<=num; i++){
        System.out.println("Square of "+i+" is : "+i*i);
    }   
    }
}