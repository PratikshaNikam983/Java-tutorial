
//*    
// *
//  *
//   *
//    *



import java.util.Scanner;
public class Pattern2{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enetr your number :");
    int num = sc.nextInt();
    for(int i = 1; i<=num; i++){
        for(int j=1; j<=num; j++){
            if(i==j){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    }
}