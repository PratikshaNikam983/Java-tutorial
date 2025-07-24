
//1 2 3 4 5 
//1 2 3 4
//1 2 3
//1 2
//1

import java.util.Scanner;
public class Pattern6{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enetr your number :");
    int num = sc.nextInt();
     for(int i =0; i<=num; i++){
        for(int j = 1; j<=num-i; j++){
            System.out.print(j+" ");
        }
        System.out.println();
     }
    }
}