import java.util.Scanner;
public class SumOfNumbers{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=num; i++){
           sum = sum + i;
        }
        System.out.println("Sum Of 1 To "+num+" is :");
        System.out.println(sum);
    }
}