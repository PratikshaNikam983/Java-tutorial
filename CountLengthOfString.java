import java.util.Scanner;
public class CountLengthOfString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string");
        String str = sc.nextLine();
        int count = 0;
        int Length = str.length();
        for(int i=0; i<Length; i++){
            count++;
           
        }
        System.out.println("length of String is: "+count);

    }
}