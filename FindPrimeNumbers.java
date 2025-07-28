
import java.util.Scanner;
public class FindPrimeNumbers{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enetr your number :");
    int num = sc.nextInt();
     System.out.println("Here are the prime numbers from 1 to "+num);
     for(int i = 1; i<=num; i++){
        boolean isPrime = true;

        for(int j = 2; j<i; j++){
            if(i%j == 0){
                isPrime = false;
                break;
            }
            
        }
        
        if(isPrime){ 
            System.out.print(i+" ");
        }
        
     }

    }   
}