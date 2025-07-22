    
//         * 
//        * * *
//      * * * * *
//    * * * * * * *
//  * * * * * * * * *
//* * * * * * * * * * *

 
import java.util.Scanner;
public class Pattern4{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enetr your number :");
    int num = sc.nextInt();
     
    for(int i = 1; i<=num; i++){
        for(int j=1; j<=(num-i); j++){
            System.out.print("  ");
        }
        for(int k=1; k<=(2*i-1); k++){
            System.out.print("* ");
        }
    
        System.out.println();
    }
    
    
    }

    }
