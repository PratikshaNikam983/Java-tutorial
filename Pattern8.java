














import java.util.Scanner;
public class Pattern8{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enetr your number :");
    int num = sc.nextInt();

    for(int i = 1; i<=num; i++){
        for(int space=1; space<=num-i; space++){
            System.out.print(" ");
        }
        for(int j = 1; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
    }
      
    }
}