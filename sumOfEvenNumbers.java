
import java.util.Scanner;
public class sumOfEvenNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Number :");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=num; i++){
            if(i%2==0){
                sum += i;
            }
        }
        System.out.println("sum of Even numbers is here :"+sum);
    }
}